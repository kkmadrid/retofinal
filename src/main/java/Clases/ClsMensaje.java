/*

 */
package Clases;

/**
 *
 * @author kaká
 */
public class ClsMensaje {
 
    public static final String OK="OK";
    public static final String ERROR="ERROR";
    public static final String ADVERTENCIA="ADVERTENCIA";
    
    private String tipo;
    private String texto;

    public ClsMensaje(String tipo, String mensaje) {
        this.tipo = tipo;
        this.texto = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setMensaje(String mensaje) {
        this.texto = mensaje;
    }
    
    
    
}
