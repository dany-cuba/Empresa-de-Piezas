
package Clases;

import java.util.ArrayList;
import Vista.*;
import Excepciones.*;
import java.io.Serializable;

public class Empresa implements Serializable{
    private ArrayList<Pieza> piezas = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Solicitud> solicitudes = new ArrayList<>();
    private final String nombre = "Empresa de electrodomésticos";
    private final String direccion = "Carretera Camajuaní #163 e/ E y F";
    
    
    public void addPieza(Pieza p)throws CamposVacios, Positivos, PiezaIgual{
        boolean error = false;
        if(p.codigo.equals("")||p.descripcion.equals("")){
            error = true;
            throw new CamposVacios("Por favor rellene todos los campos y seleccione método de pago");
        }
        for(int i=0; i<piezas.size(); i++){
            if(p.codigo.equals(piezas.get(i).codigo)){
                error = true;
                throw new PiezaIgual("Ya la pieza existe");
            }        
        }
        if(p.peso <= 0||p.cantidadPiezas <=0){
            error = true;
            throw new Positivos("Los valores de peso y cantidad de piezas deben ser mayores que cero");
        }
        if(error == false){
            piezas.add(p);
        }
        
    }

    public void addCliente(Cliente c)throws CamposVacios, ClienteIgual{
        boolean error = false;
        if(c.getCodigo().equals("")||c.getCorreo().equals("")){
            error = true;
            throw new CamposVacios("Por favor rellene todos los campos y seleccione método de pago"); 
        }
        for(int i=0; i<clientes.size(); i++){
            if(c.getCodigo().equals(clientes.get(i).getCodigo())){
                error = true;
                throw new ClienteIgual("Ya el cliente existe");
            }        
        }
        if(error == false){
            clientes.add(c);
        }  
    }
    public void addSolicitud(Solicitud s)throws CamposVacios, SolicitudIgual{
        boolean error = false;
        if(s.getCodigoClienteCorrespondiente().equals("")||s.getCodigoPiezaCorrespondiente().equals("")||s.getFecha().equals("")){
            error = true;
            throw new CamposVacios("Por favor rellene todos los campos");
        }
        for(int i=0; i<solicitudes.size(); i++){
            if(s.getCodigoClienteCorrespondiente().equals(solicitudes.get(i).getCodigoClienteCorrespondiente()) && s.getCodigoPiezaCorrespondiente().equals(solicitudes.get(i).getCodigoPiezaCorrespondiente())){
                error = true;
                throw new SolicitudIgual("Ya la pieza existe");
            }        
        }
        if(error == false){
            solicitudes.add(s);
        }
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }
    
    public void mostrarDatos(){
        System.out.println("Clientes");
        for (Cliente x : clientes) {
            System.out.println("Codigo: "+x.getCodigo()+"\nCorreo: "+x.getCorreo()+"\nForma de Pago: "+x.getFormaPago()+"\n------------------------------------");
        }
        System.out.println("Piezas");
        for (Pieza y: piezas){
            System.out.println("Codigo: "+y.codigo+"\nPeso: "+y.peso+"Kg\nCantidad de Piezas: "+y.cantidadPiezas+"Descripción: "+y.descripcion+"\nTipo de Material: "+y.tipo(y)+"\nCosto: $"+y.calcularCosto(y.peso));
        }
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    

}