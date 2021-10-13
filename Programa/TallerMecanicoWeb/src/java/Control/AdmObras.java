/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.ManoObra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author richa
 */
public class AdmObras {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();

    public AdmObras() {
    }
    
    public ArrayList listar(){
        ArrayList<ManoObra> lista= new ArrayList();
        String sql = "select * from ManoDeObra";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        
            while(rs.next()){
                
                ManoObra obra = new ManoObra();
                obra.setCodigo(rs.getInt("codigo"));
                obra.setNombre(rs.getString("nombre"));
                obra.setMonto(rs.getDouble("monto"));
                
                lista.add(obra);
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar");
        }
        
         return lista;
    }
    
}
