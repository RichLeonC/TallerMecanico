/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.RepuestoReparacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class AdmRepuestoReparacion {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();

    public AdmRepuestoReparacion() {
    }
    
    public ArrayList listar(){
        ArrayList<RepuestoReparacion> lista= new ArrayList();
        String sql = "select * from Repuesto_Reparacion";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                RepuestoReparacion repuestoRep = new RepuestoReparacion();
                repuestoRep.setCodigoRepuesto(rs.getInt("codigoRepuesto"));
                repuestoRep.setIdReparacion(rs.getInt("idReparacion"));
               
      
                lista.add(repuestoRep);
            }
           
        } catch (Exception e) {
        }
         return lista;
    }
    
    public boolean agregar(String codigo,String idReparacion){
        int cod,ide;
        try {
            cod = Integer.parseInt(codigo);
            ide = Integer.parseInt(idReparacion);
        } catch (Exception e) {
            return false;
        }
        String sql = "insert into Repuesto_Reparacion(codigoRepuesto,idReparacion) values(?,?)";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setInt(2, ide);
            
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
}
