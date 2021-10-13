/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.Factura;
import com.sun.codemodel.JOp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author richa
 */
public class AdmFacturas {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();

    public AdmFacturas() {
    }
    
    public ArrayList listar(){
        ArrayList<Factura> listaFacturas= new ArrayList();
        String sql = "select * from Factura";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Factura factura = new Factura();            
                factura.setNumero(rs.getInt("numero"));
                factura.setIdReparacion(rs.getInt("idReparacion"));
                factura.setFechaEntregado(rs.getDate("fechaEntregado"));
                factura.setTotalAPagar(rs.getDouble("totalAPagar"));                
       
                listaFacturas.add(factura);
            }
           
        } catch (Exception e) {
        }
         return listaFacturas;
    }
    
    public boolean agregar(String numero,String idReparacion,String fecha){
        int n,id;
        double total= 0,precioIVA = 0,montoIVA = 0;
        try {
            n = Integer.parseInt(numero);
            id = Integer.parseInt(idReparacion);
        } catch (Exception e) {
            return false;
        }
        String sql = "insert into Factura(numero,idReparacion,fechaEntregado,totalAPagar) values(?,?,?,?)";
        String sqlR = "select sum(precioIVA) from Factura_RepuestosV where idReparacion="+id;
        String sqlM = "select sum(montoIVA) from Factura_ObrasV where idReparacion="+id;
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sqlR);
            rs = ps.executeQuery();
            // JOptionPane.showMessageDialog(null, "Antes del primerIF");
            if(rs.next()) precioIVA = rs.getDouble(1);
           // JOptionPane.showMessageDialog(null, precioIVA);
            ps = con.prepareStatement(sqlM);
            rs = ps.executeQuery();
            if(rs.next()) montoIVA = rs.getDouble(1);
           //  JOptionPane.showMessageDialog(null, montoIVA);
            ps = con.prepareStatement(sql);
            total=precioIVA+montoIVA;
            // JOptionPane.showMessageDialog(null, total);
            ps.setInt(1, n);
            ps.setInt(2, id);
            ps.setString(3, fecha);
            ps.setDouble(4,total);
            ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Catch facturas");
            return false;
        }
        return true;
    }
}
