/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Modelos.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class CtlCandidato {

    MdlCandidato modelo;

    public CtlCandidato() {
        this.modelo = new MdlCandidato();
    }
//creamos la clase en este caso para eliminar luego  el objeto que conectara con modelo, esta retorna un string
    public ClsMensaje eliminarcandidato(String idCandidato) {

        return this.modelo.eliminarcandidato(idCandidato);
    }
//creamos la clase en este caso para agregar luego  el objeto que conectara con modelo, esta retorna toda una clase
    public ClsMensaje agregarcandidato(ClsCandidato candidato) {

        return this.modelo.agregarcandidato(candidato);
    }
    
    public ClsMensaje actualizarcandidato(ClsCandidato candidato) {

        return this.modelo.actualizarcandidato(candidato);
    }

    public LinkedList<ClsCandidato> obtenerCandidatos() {
        return this.modelo.obtenerCandidatos();

    }
}
