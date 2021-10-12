/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Config.Conexion;
import Modelo.MecanicoSecundario;
import Modelo.Reparacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class AdmMecanicosSecundarios {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex = new Conexion();

    public AdmMecanicosSecundarios() {
    }
    
    public ArrayList listar(){
        ArrayList<MecanicoSecundario> listaSecundarios= new ArrayList();
        String sql = "select * from Mecanico_Secundario";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                MecanicoSecundario secundario = new MecanicoSecundario();
                secundario.setIdReparacion(rs.getInt("idReparacion"));
                secundario.setCodigoMecanico(rs.getInt("codigoMecanico"));
      
                listaSecundarios.add(secundario);
            }
           
        } catch (Exception e) {
        }
         return listaSecundarios;
    }
    
    public boolean agregar(String idReparacion,String codigoMecanico){
        int id,codigo;
        
        try {
            id=Integer.parseInt(idReparacion);
            codigo = Integer.parseInt(codigoMecanico);
        } catch (Exception e) {
            return false;
        }
        String sql = "insert into Mecanico_Secundario(idReparacion,codigoMecanico) values(?,?)";
        
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
}
