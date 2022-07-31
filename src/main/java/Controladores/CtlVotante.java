/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import Clases.ClsMensaje;
import Clases.ClsVotante;
import Modelos.MdlVotante;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class CtlVotante {
    MdlVotante modelo;

    public CtlVotante() {
        this.modelo = new MdlVotante();
    }
    
    
    public LinkedList<ClsVotante> obtenerVotantes() {
    
    return this.modelo.obtenerVotantes();
    
    }
    
    public ClsMensaje agregarvotante(ClsVotante votante) {

        return this.modelo.agregarvotante(votante);
    }
    
    public ClsMensaje actualizarvotante (ClsVotante votante) {

        return this.modelo.actualizarvotante(votante);
    }

    public ClsMensaje eliminarvotante(String idVotante) {

        return this.modelo.eliminarvotante(idVotante);
    }
}
