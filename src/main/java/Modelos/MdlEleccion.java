/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import Clases.ClsEleccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class MdlEleccion {

    ClsJdbc jdbc = new ClsJdbc();

    public MdlEleccion() {
        jdbc.CrearConexion();
    }

    public ClsMensaje agregareleccion(ClsEleccion eleccion) {
        ClsMensaje mensaje;
        try {
            //creando el string en este caso para insertar una nueva eleccion
            String sqlagregar = "INSERT INTO tbl_elecciones (id_eleccion,descripcion,tipo,fecha_inicio,fecha_fin,estado) VALUES(?,?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlagregar);
            sentencia.setString(1, eleccion.getId());
            sentencia.setString(2, eleccion.getDescripcion());
            sentencia.setString(3, eleccion.getTipo());
            sentencia.setString(4, eleccion.getFecha_inicio());
            sentencia.setString(5, eleccion.getFecha_fin());
            sentencia.setString(6, eleccion.getEstado());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "El Tipo de elección ha sido registrado.Verifica Listado Elección");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "El Tipo de elección no ha sido registrado");
            }
            return mensaje;
        } catch (Exception e) {
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "El Tipo de eleccion no ha sido registrado " + e.getMessage());
            return mensaje;
        }
    }
    
    //creamos el metodo en este caso para actualizar el candidato
    public ClsMensaje actualizareleccion(ClsEleccion eleccion) {
        ClsMensaje mensaje;
        try {
            
            String sqlactualizar= "UPDATE tbl_elecciones SET descripcion=?, tipo=?, fecha_inicio=?, fecha_fin=?, estado=? WHERE id_eleccion=?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlactualizar);
            
            sentencia.setString(1, eleccion.getDescripcion());
            sentencia.setString(2, eleccion.getTipo());
            sentencia.setString(3, eleccion.getFecha_inicio());
            sentencia.setString(4, eleccion.getFecha_fin());
            sentencia.setString(5, eleccion.getEstado());
            sentencia.setString(6, eleccion.getId());
       
            
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"La Elección ha sido actualizada");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"La Elección no ha sido actualizada");
            }
            return mensaje;
        }
        catch(Exception e){
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"La Elección no ha sido actualizada "+e.getMessage());
            return mensaje;
        }
    }

    public ClsMensaje eliminareleccion(String ideleccion) {
        ClsMensaje mensaje;
        try {
            
            String sqleliminar = "DELETE FROM tbl_elecciones WHERE id_eleccion=?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqleliminar);
            sentencia.setString(1, ideleccion);
            
            int resultado=sentencia.executeUpdate();
            
            if(resultado>=1){
            mensaje=new ClsMensaje(ClsMensaje.OK,"La Elección fue eliminada");
            }else{
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"La Elección no fue eliminada");
            }
            return mensaje;
        }
        catch(Exception e){
            mensaje=new ClsMensaje(ClsMensaje.ERROR,"La Elección no fue eliminada "+e.getMessage());
            return mensaje;
        }
    }
    
    public LinkedList<ClsEleccion> obtenerElecciones() {

        try {

            LinkedList<ClsEleccion> elecciones = new LinkedList();

            String consulta = "SELECT id_eleccion,descripcion,tipo,fecha_inicio,fecha_fin,estado FROM tbl_elecciones";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                //String partidoPolitico, String ciudadOrigen, String descripcion, String mensajeCampania, String propuestas, String numeroDocumento, String nombre, String telefono, String correo
                String id = resultados.getString("id_eleccion");
                String descripcion = resultados.getString("descripcion");

                String tipo = resultados.getString("tipo");
                String fecha_inicio = resultados.getString("fecha_inicio");
                String fecha_fin = resultados.getString("fecha_fin");
                String estado = resultados.getString("estado");

                ClsEleccion eleccion = new ClsEleccion(id, descripcion, tipo, fecha_inicio, fecha_fin, estado);
                elecciones.add(eleccion);
            }

            return elecciones;

        } catch (Exception e) {
            return null;
        }

    }

    // metodo para asociar candidatos
    public ClsMensaje asociarcandidato(String ideleccion, String idcandidato) {
        ClsMensaje mensaje;
        try {
            //creando el string en este caso para insertar una nueva asociacion
            String sqlasociar = "INSERT INTO tbl_candidatos_x_eleccion VALUES(?,?,NOW())";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlasociar);
            sentencia.setString(1, idcandidato);
            sentencia.setString(2, ideleccion);

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "Asociación de candidato registrada");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "Asociación de candidato no registrada");
            }
            return mensaje;
        } catch (SQLIntegrityConstraintViolationException e) {
            // Duplicate entry
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "El candidato ya esta asociado");
            return mensaje;
        } catch (SQLException e) {
            // Other SQL Exception
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Asociación de candidato no registrada" + e.getMessage());
            return mensaje;
        }
    }

    //se crea este metodo para actualizar la tabla donde almacena candidatos asociados a una eleccion
    public LinkedList<ClsCandidato> obtenerCandidatoseleccion(String id_eleccion) {

        try {

            LinkedList<ClsCandidato> candidatos = new LinkedList();

            String consulta = "SELECT tc.* FROM tbl_candidatos_x_eleccion te,tbl_candidato tc WHERE te.id_eleccion=? AND te.id_candidato=tc.id_candidato";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            sentencia.setString(1, id_eleccion);

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
