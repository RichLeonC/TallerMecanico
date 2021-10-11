/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.Mecanico;
import Modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class AdmMecanicos {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();
    private int res;
    private String msj;

    public AdmMecanicos() {
    }
    
    public ArrayList listar(){
        ArrayList<Mecanico> listaMecanicos= new ArrayList();
        String sql = "select * from Mecanico";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Mecanico mecanico = new Mecanico();            
                mecanico.setCodigo(rs.getInt("codigo"));
                mecanico.setNombre(rs.getString("nombre"));
                mecanico.setApellido1(rs.getString("apellido"));
                mecanico.setApellido2(rs.getString("apellido2"));
                
                listaMecanicos.add(mecanico);
            }
           
        } catch (Exception e) {
        }
         return listaMecanicos;
    }
    
    public boolean eliminar(int codigo){
        String sql = "delete from Mecanico where codigo="+codigo;   
       try {
           con = conex.getConnection();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
       } catch (Exception e) {
           return false;
       }
       return true;
    }
    
}
