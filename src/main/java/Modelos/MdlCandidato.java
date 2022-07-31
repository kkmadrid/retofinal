/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class MdlCandidato {

    ClsJdbc jdbc = new ClsJdbc();

    public MdlCandidato() {
        jdbc.CrearConexion();
    }
// creamos el metodo en este caso para agregar un candidato nuevo
    public ClsMensaje agregarcandidato(ClsCandidato candidato) {
        ClsMensaje mensaje;
        try {
            
            String sqlagregar = "INSERT INTO tbl_candidato VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlagregar);
            sentencia.setString(1, candidato.getNumeroDocumento());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getCorreo());
            sentencia.setString(5, candidato.getPartidoPolitico());
            sentencia.setString(6, candidato.getCiudadOrigen());
            sentencia.setString(7, candidato.getDescripcion());
            sentencia.setString(8, candidato.getMensajeCampania());
            sentencia.setString(9, candidato.getPropuestas());
            
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"El candidato ha sido registrado");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El candidato no ha sido registrado");
            }
            return mensaje;
        }
        catch (SQLIntegrityConstraintViolationException e) {
            // Duplicate entry
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "El candidato ya se encuentra registrado");
            return mensaje;
        } catch (SQLException e) {
            // Other SQL Exception
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "El candidato no ha sido registrado" + e.getMessage());
            return mensaje;
        }
    }
    
    //creamos el metodo para eliminar candidato
    public ClsMensaje eliminarcandidato(String idcandidato) {
        ClsMensaje mensaje;
        try {
            
            String sqleliminar = "DELETE FROM tbl_candidato WHERE id_candidato=?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqleliminar);
            sentencia.setString(1, idcandidato);
            
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"El candidadto ha sido eliminado");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El candidadto no ha sido eliminado");
            }
            return mensaje;
        }
        catch(Exception e){
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El candidadto no ha sido eliminado "+e.getMessage());
            return mensaje;
        }
    }
    
//creamos el metodo en este caso para actualizar el candidato
    public ClsMensaje actualizarcandidato(ClsCandidato candidato) {
        ClsMensaje mensaje;
        try {
            
            String sqlactualizar= "UPDATE tbl_candidato SET nombre=?, telefono=?, correo=?, partido_politico=?, ciudad_origen=?, descripcion=?, mensaje_campania=?, propuestas=? WHERE id_candidato=?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlactualizar);
            
            sentencia.setString(1, candidato.getNombre());
            sentencia.setString(2, candidato.getTelefono());
            sentencia.setString(3, candidato.getCorreo());
            sentencia.setString(4, candidato.getPartidoPolitico());
            sentencia.setString(5, candidato.getCiudadOrigen());
            sentencia.setString(6, candidato.getDescripcion());
            sentencia.setString(7, candidato.getMensajeCampania());
            sentencia.setString(8, candidato.getPropuestas());
            sentencia.setString(9, candidato.getNumeroDocumento());
            
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"El candidato ha sido actualizado");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El candidato no ha sido actualizado");
            }
            return mensaje;
        }
        catch(Exception e){
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"El candidato no ha sido actualizado "+e.getMessage());
            return mensaje;
        }
    }
    
    
    
    public LinkedList<ClsCandidato> obtenerCandidatos() {

        try {

            LinkedList<ClsCandidato> candidatos = new LinkedList();

            String consulta = "SELECT * FROM tbl_candidato";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                //String partidoPolitico, String ciudadOrigen, String descripcion, String mensajeCampania, String propuestas, String numeroDocumento, String nombre, String telefono, String correo
                String partido = resultados.getString("partido_politico");
                String ciudad = resultados.getString("ciudad_origen");
                String descripcion = resultados.getString("descripcion");
                String mensaje = resultados.getString("mensaje_campania");
                String propuestas = resultados.getString("propuestas");

                String numerodocumento = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");

                ClsCandidato candidato = new ClsCandidato(partido, ciudad, descripcion, mensaje, propuestas, numerodocumento, nombre, telefono, correo);
                candidatos.add(candidato);
            }
            
            return candidatos;

        } catch (Exception e) {
            return null;
        }

    }
}
