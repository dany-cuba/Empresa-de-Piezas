
package Clases;

public class PiezasMixtas extends Pieza{
    
    public PiezasMixtas(String codigo, String descripcion, double peso, int cantidadPiezas) {
        super(codigo, descripcion, peso, cantidadPiezas);
    }
    @Override
    public double calcularCosto(double peso){
       return ((1.3*peso+30)+(2.8*peso+56))*cantidadPiezas;
    }
}
