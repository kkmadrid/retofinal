/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Clases.ClsEleccion;
import Modelos.MdlEleccion;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class CtlEleccion {
    
    MdlEleccion modelo;

    public CtlEleccion() {
        this.modelo = new MdlEleccion();
    }
    
    public ClsMensaje agregareleccion(ClsEleccion eleccion) {

        return this.modelo.agregareleccion(eleccion);
    }
    
    public ClsMensaje actualizareleccion(ClsEleccion eleccion) {

        return this.modelo.actualizareleccion(eleccion);
    }
    
    public LinkedList<ClsEleccion> obtenerElecciones() {
    
    LinkedList<ClsEleccion> elecciones=this.modelo.obtenerElecciones();
    
    return elecciones;
    }
    
    public ClsMensaje eliminareleccion(String ideleccion) {

        return this.modelo.eliminareleccion(ideleccion);
    }
    
    public ClsMensaje asociarcandidato(String ideleccion,String idcandidato) {

        return this.modelo.asociarcandidato(ideleccion,idcandidato);
    }
    
    public LinkedList<ClsCandidato> obtenerCandidatoseleccion(String ideleccion) {
    
    LinkedList<ClsCandidato> candidatos=this.modelo.obtenerCandidatoseleccion(ideleccion);
    
    return candidatos;
    }
  
}
