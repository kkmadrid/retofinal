/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsConteo;
import Clases.ClsEleccion;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import Clases.ClsVoto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class MdlVoto {
    ClsJdbc jdbc = new ClsJdbc();

    public MdlVoto() {
         jdbc.CrearConexion();
    }
    
     public ClsMensaje agregarvoto(ClsVoto voto) {
        ClsMensaje mensaje;
        try {
            //creando el string en este caso para insertar una nueva eleccion
            String sqlagregar = "INSERT INTO tbl_votos (id_voto,id_eleccion,id_votante,id_candidato,fecha) VALUES(?,?,?,?,NOW())";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sqlagregar);
            
            sentencia.setString(1, "");
            sentencia.setString(2, voto.getEleccion());
            sentencia.setString(3, voto.getVotante());
            sentencia.setString(4, voto.getCandidato());
            
            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "El voto ha sido registrado. Gracias por utilizar nuestros servicios");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "El voto no ha sido registrado");
            }
            return mensaje;
        } catch (Exception e) {
            // Other SQL Exception
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "El voto no ha sido registrado " + e.getMessage());
            return mensaje;
        }
    }
     
     public LinkedList<ClsVoto> obtenervotos() {

        try {

            LinkedList<ClsVoto > votos = new LinkedList();

            String consulta = "SELECT * FROM tbl_votos";
            
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                //String partidoPolitico, String ciudadOrigen, String descripcion, String mensajeCampania, String propuestas, String numeroDocumento, String nombre, String telefono, String correo
                String ideleccion=resultados.getString("id_voto");
               
                

                String votante = resultados.getString("id_votante");
                
                String idcandidato=resultados.getString("id_candidato");
                String fecha=resultados.getString("fecha");


                ClsVoto voto = new ClsVoto(ideleccion,votante,idcandidato,fecha);
                votos.add(voto);
            }

            return votos;

        } catch (Exception e) {
            return null;
        }

    }
     
     public LinkedList<ClsConteo> obtenerconteos() {

        try {

            LinkedList<ClsConteo > conteos = new LinkedList();

            String consulta = "select id_candidato,count(*) as votos FROM tbl_votos group by id_candidato";
            
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                //String partidoPolitico, String ciudadOrigen, String descripcion, String mensajeCampania, String propuestas, String numeroDocumento, String nombre, String telefono, String correo
             
                
                String idcandidato=resultados.getString("id_candidato");
                String cantidadvotos=resultados.getString("votos");


                ClsConteo conteo = new ClsConteo(idcandidato,cantidadvotos);
                conteos.add(conteo);
            }

            return conteos;

        } catch (Exception e) {
            return null;
        }

    }
}
