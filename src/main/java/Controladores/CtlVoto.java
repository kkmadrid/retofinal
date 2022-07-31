/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsConteo;
import Clases.ClsEleccion;
import Clases.ClsMensaje;
import Clases.ClsVoto;
import Modelos.MdlEleccion;
import Modelos.MdlVoto;
import java.util.LinkedList;

/**
 *
 * @author kaká
 */
public class CtlVoto {

    MdlVoto modelo;

    public CtlVoto() {
        this.modelo = new MdlVoto();
    }

    public ClsMensaje agregarvoto(ClsVoto voto) {

        return this.modelo.agregarvoto(voto);
    }

    public LinkedList<ClsVoto> obtenervotos() {

        LinkedList<ClsVoto> votos = this.modelo.obtenervotos();

        return votos;
    }
    
    public LinkedList<ClsConteo> obtenerconteos() {

        LinkedList<ClsConteo> conteos = this.modelo.obtenerconteos();

        return conteos;
    }
}
