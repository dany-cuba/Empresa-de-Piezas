
package Clases;

public class PiezaPlastica extends Pieza{
    
    public PiezaPlastica(String codigo, String descripcion, double peso, int cantidadPiezas) {
        super(codigo, descripcion, peso, cantidadPiezas);
    }
    @Override
    public double calcularCosto(double peso){
        return (1.3*peso+30*cantidadPiezas);
    }
}
