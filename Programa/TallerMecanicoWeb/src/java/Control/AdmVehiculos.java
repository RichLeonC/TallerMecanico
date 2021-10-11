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
    
   public boolean actualizar(Vehiculo v){
       String sql = "updtate Vehiculo set propietario=?,marca=?,modelo=?,año=?,color=? where placa=?";
       try {
           con = conex.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(2, v.getPropietario());
           ps.setString(3, v.getMarca());
           ps.setString(4, v.getModelo());
           ps.setInt(5, v.getAnio());
           ps.setString(6, v.getColor());
           ps.executeUpdate();
       } catch (Exception e) {
           return false;
       }
       return true;
   }
   
   public boolean eliminar(int placa){
       String sql = "delete from Vehicul where placa="+placa;
       
       try {
           con = conex.getConnection();
           ps = con.prepareStatement(sql);
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
