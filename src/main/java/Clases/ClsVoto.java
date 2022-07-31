/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author kaká
 */
public class ClsVoto {
 
    private String eleccion;
    private String votante;
    private String candidato;
    private String fecha;

    public ClsVoto(String eleccion, String votante, String candidato, String fecha) {
        
        this.eleccion = eleccion;
        this.votante = votante;
        this.candidato = candidato;
        this.fecha = fecha;
    }

  

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

    public String getVotante() {
        return votante;
    }

    public void setVotante(String votante) {
        this.votante = votante;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

  
    
    
}
