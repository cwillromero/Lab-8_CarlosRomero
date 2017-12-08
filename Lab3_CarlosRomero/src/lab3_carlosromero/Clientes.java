
package lab3_carlosromero;

import java.util.ArrayList;

public class Clientes extends Persona{
    private ArrayList ProductosComprados=new ArrayList();
    private double Dinero;

    public Clientes() {
        super();
    }

    public Clientes(double Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList getProductosComprados() {
        return ProductosComprados;
    }

    public void setProductosComprados(ArrayList ProductosComprados) {
        this.ProductosComprados = ProductosComprados;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCliente:  " + "ProductosComprados=" + ProductosComprados + ", Dinero=" + Dinero;
    }
    
    
}
