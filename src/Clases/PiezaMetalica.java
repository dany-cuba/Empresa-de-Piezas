
package Clases;

public class PiezaMetalica extends Pieza {
    
    public PiezaMetalica(String codigo, String descripcion, double peso, int cantidadPiezas) {
        super(codigo, descripcion, peso, cantidadPiezas);
    }
    @Override
    public double calcularCosto(double peso){
      return (2.8*peso+56)*cantidadPiezas;  
    }    
}
