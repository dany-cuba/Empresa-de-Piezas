
package Clases;

import java.io.Serializable;

public class Solicitud implements Serializable{
    private String codigoClienteCorrespondiente;
    private String codigoPiezaCorrespondiente;
    private String fecha;

    public Solicitud(String codigoClienteCorrespondiente, String codigoPiezaCorrespondiente, String fecha) {
        this.codigoClienteCorrespondiente = codigoClienteCorrespondiente;
        this.codigoPiezaCorrespondiente = codigoPiezaCorrespondiente;
        this.fecha = fecha;
    }

    public String getCodigoClienteCorrespondiente() {
        return codigoClienteCorrespondiente;
    }

    public String getCodigoPiezaCorrespondiente() {
        return codigoPiezaCorrespondiente;
    }

    public String getFecha() {
        return fecha;
    }
    
}
