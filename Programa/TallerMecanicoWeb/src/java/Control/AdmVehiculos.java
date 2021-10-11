/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.Cliente;
import Modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author richa
 */
public class AdmVehiculos {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();
    private int res;
    private String msj;

    public AdmVehiculos() {
      
    }
    
    
    
    public ArrayList listar(){
        ArrayList<Vehiculo> listaVehiculos= new ArrayList();
        String sql = "select * from Vehiculo";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setPlaca(rs.getInt("placa"));
                vehiculo.setPropietario(rs.getInt("propietario"));
                vehiculo.setMarca(rs.getString("marca"));
                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setAnio(rs.getInt("año"));
                vehiculo.setColor(rs.getString("color"));
                
                listaVehiculos.add(vehiculo);
            }
           
        } catch (Exception e) {
        }
         return listaVehiculos;
    }
    
   public boolean actualizar(String placa,String propietario,String marca,String modelo,String anio,String color){
        int pl,prop,an;
       try {
           pl = Integer.parseInt(placa);
           prop = Integer.parseInt(propietario);
           an = Integer.parseInt(anio);
       } catch (Exception e) {
           return false;
       }
       String sql = "update Vehiculo set propietario=?,marca=?,modelo=?,año=?,color=? where placa="+pl;
  
       try {
           con = conex.getConnection();
           ps = con.prepareStatement(sql);
        
           ps.setInt(1, prop);
           ps.setString(2, marca);
           ps.setString(3, modelo);
           ps.setInt(4, an);
           ps.setString(5, color);
           ps.executeUpdate();
       } catch (Exception e) {
          
           return false;
           
       }
       return true;
   }
   
  
   
   public Vehiculo listarPlaca(int placa){
       Vehiculo vehiculo = new Vehiculo();
       String sql = "select * from Vehiculo where placa="+placa;
       try {
           con = conex.getConnection();
           ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                vehiculo.setPlaca(rs.getInt("placa"));
                vehiculo.setPropietario(rs.getInt("propietario"));
                vehiculo.setMarca(rs.getString("marca"));
                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setAnio(rs.getInt("año"));
                vehiculo.setColor(rs.getString("color"));
                
            }
       } catch (Exception e) {
         
       }
       return vehiculo;
   }
   
}
