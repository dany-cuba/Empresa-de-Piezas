
package Clases;

import java.io.Serializable;

public class Cliente implements Serializable{
    private String codigo;
    private String correo;
    private String formaPago;
    

    public Cliente(String codigo, String correo, String formaPago) {
        this.codigo = codigo;
        this.correo = correo;
        this.formaPago = formaPago;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFormaPago() {
        return formaPago;
    }
    
    
}
