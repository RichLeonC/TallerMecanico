/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.Mecanico;
import Modelo.Repuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class AdmRepuestos {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();

    public AdmRepuestos() {
    }
    
    public ArrayList listar(){
        ArrayList<Repuesto> listaRepuestos= new ArrayList();
        String sql = "select * from Repuesto";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Repuesto repuesto = new Repuesto();            
                repuesto.setCodigo(rs.getInt("codigo"));
                repuesto.setNombre(rs.getString("nombre"));
                repuesto.setPrecio(rs.getDouble("precio"));               
                
                listaRepuestos.add(repuesto);
            }
           
        } catch (Exception e) {
        }
         return listaRepuestos;
    }
}
