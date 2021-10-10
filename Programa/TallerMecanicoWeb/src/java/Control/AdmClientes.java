/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class AdmClientes {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();
    private int res;
    private String msj;

    public AdmClientes() {
      
    }
    
    
    
    public ArrayList listar(){
        ArrayList<Cliente> listaClientes = new ArrayList();
        String sql = "select * from Cliente";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCedula(rs.getInt("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                listaClientes.add(cliente);
            }
           
        } catch (Exception e) {
        }
         return listaClientes;
    }
    
    public String agregar(String cedula, String nombre,String apellido1,String apellido2,String direccion,
           String telefono){
        String sql = "insert into Cliente(cedula,nombre,apellido,apellido2,direccion,telefono)"
                + "values(?,?,?,?,?,?)" ; 
        int ced;
        int telef;
        try {
            ced = Integer.parseInt(cedula);
        } catch (Exception e) {
            msj = "Cedula invalida";
            return msj;
        }
        try {
            telef = Integer.parseInt(telefono);
        } catch (Exception e) {
            msj = "Telefono invalido";
            return msj;
        }
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ced);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, direccion);
            ps.setInt(6, telef);
            res = ps.executeUpdate();
            if(res==1) msj = "Cliente Agregado";
            else msj = "Error al agregar, verifique bien los datos";
        } catch (Exception e) {
        }
        return msj;
    }
}
