
package Clases;

import java.io.Serializable;

public abstract class Pieza implements Serializable{
    protected String codigo;
    protected String descripcion;
    protected double peso;
    protected int cantidadPiezas;

    public Pieza(String codigo, String descripcion, double peso, int cantidadPiezas) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.cantidadPiezas = cantidadPiezas;
    }
    
    public abstract double calcularCosto(double peso);
        
    public String tipo(Pieza p){
        if(p instanceof PiezaMetalica){
            return "Pieza Metálica";
        }else if(p instanceof PiezaPlastica){
            return "Pieza Plástica";
        }else if(p instanceof PiezasMixtas){
            return "Pieza Mixta";
        }else{
            return "MAL";
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public int getCantidadPiezas() {
        return cantidadPiezas;
    }
    
}
