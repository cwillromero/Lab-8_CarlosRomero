
package lab3_carlosromero;
public class Productos {
    private double Precio;
    private String Descripcion;
    private String Marca;
    private double Descuento;

    public Productos() {
    }

    public Productos(double Precio, String Descripcion, String Marca, double Descuento) {
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.Descuento = Descuento;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    @Override
    public String toString() {
        return "Producto:  " + "Precio=" + Precio + ", Descripcion=" + Descripcion + ", Marca=" + Marca + ", Descuento=" + Descuento;
    }
}
