/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsJdbc;
import Clases.ClsMensaje;
import Clases.ClsVotante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class MdlVotante {

    ClsJdbc jdbc = new ClsJdbc();

    public MdlVotante() {
    jdbc.CrearConexion();
    }
    
    //creamos el metodo para crear un votante nuevo de tipo clase ClsVotante
    
    public ClsMensaje agregarvotante(ClsVotante votante) {
        ClsMensaje mensaje;
        try {
            
            String sqlagregar = "INSERT INTO tbl_votantes VALUES(?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlagregar);
            sentencia.setString(1, votante.getNumeroDocumento());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreo());
            sentencia.setString(5, votante.getCiudad());
           
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"El votante ha sido registrado");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El votante no ha sido registrado");
            }
            return mensaje;
        }
        catch (SQLIntegrityConstraintViolationException e) {
            // Duplicate entry
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "El votante ya se encuentra registrado");
            return mensaje;
        } catch (SQLException e) {
            // Other SQL Exception
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "El votante no ha sido registrado " + e.getMessage());
            return mensaje;
        }
    }
    
    //creamos el metodo para actualizar el votante
    
    public ClsMensaje actualizarvotante(ClsVotante votante) {
        ClsMensaje mensaje;
        try {
            
            String sqlactualizar = "UPDATE tbl_votantes SET nombre=?, telefono=?, correo=?, ciudad_residencia=? WHERE id_votante=?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlactualizar);
            
            sentencia.setString(1, votante.getNombre());
            sentencia.setString(2, votante.getTelefono());
            sentencia.setString(3, votante.getCorreo());
            sentencia.setString(4, votante.getCiudad());
           
            sentencia.setString(5, votante.getNumeroDocumento());
            
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"El votante ha sido actualizado");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El votante no ha sido actualizado");
            }
            return mensaje;
        }
        catch(Exception e){
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El candidadto no ha sido actualizado "+e.getMessage());
            return mensaje;
        }
    }
    
     //creamos el metodo para eliminar candidato
    public ClsMensaje eliminarvotante(String idvotante) {
        ClsMensaje mensaje;
        try {
            
            String sqleliminar = "DELETE FROM tbl_votantes WHERE id_votante=?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqleliminar);
            sentencia.setString(1, idvotante);
            
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"El votante ha sido eliminado");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El votante no ha sido eliminado");
            }
            return mensaje;
        }
        catch(Exception e){
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El votante no ha sido eliminado "+e.getMessage());
            return mensaje;
        }
    }
    
    
    public LinkedList<ClsVotante> obtenerVotantes() {

        try {

            LinkedList<ClsVotante> votantes = new LinkedList();

            String consulta = "SELECT * FROM tbl_votantes";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                //String partidoPolitico, String ciudadOrigen, String descripcion, String mensajeCampania, String propuestas, String numeroDocumento, String nombre, String telefono, String correo
                
                String ciudad = resultados.getString("ciudad_residencia");
                

                String numerodocumento = resultados.getString("id_votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");

                ClsVotante votante = new ClsVotante(ciudad,numerodocumento, nombre, telefono, correo);
                votantes.add(votante);
            }
            
            return votantes;

        } catch (Exception e) {
            return null;
        }

    }
}
