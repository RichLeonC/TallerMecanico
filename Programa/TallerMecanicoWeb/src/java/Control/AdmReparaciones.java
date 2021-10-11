/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.Mecanico;
import Modelo.Reparacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class AdmReparaciones {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();

    public AdmReparaciones() {
    }
    
     public ArrayList listar(){
        ArrayList<Reparacion> listaReparaciones= new ArrayList();
        String sql = "select * from Reparacion";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Reparacion reparacion = new Reparacion();            
                reparacion.setId(rs.getInt("id"));
                reparacion.setPlaca(rs.getInt("placa"));
                reparacion.setCliente(rs.getInt("cliente"));
                reparacion.setMecanicoLider(rs.getInt("mecanicoLider"));
                reparacion.setFechaEntrada(rs.getDate("fechaEntrada"));
       
                listaReparaciones.add(reparacion);
            }
           
        } catch (Exception e) {
        }
         return listaReparaciones;
    }
     
   public boolean agregar(String id, String placa, String cliente, String mecanicoLider,Date fechaEntrada){
       int ide,pl,cl,ml;  
       try {
           ide = Integer.parseInt(id);
           pl = Integer.parseInt(placa);
           cl = Integer.parseInt(cliente);
           ml = Integer.parseInt(mecanicoLider);
       } catch (Exception e) {
           return false;
       }
       String sql = "insert into Reparacion(id,placa,cliente,mecanicoLider,fechaEntrada) values(?,?,?,?,?)";
       try {
           con = conex.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, ide);
           ps.setInt(2, pl);
           ps.setInt(3, cl);
           ps.setInt(4, ml);
           ps.setDate(5, fechaEntrada);
           ps.executeUpdate();
       } catch (Exception e) {
           return false;
       }
       return true;
   }
     
}