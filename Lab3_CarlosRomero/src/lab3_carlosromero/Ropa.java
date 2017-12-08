
package lab3_carlosromero;

public class Ropa extends Productos{
    private int Talla;
    private String Genero;

    public Ropa() {
        super();
    }

    public Ropa(int Talla, String Genero) {
        this.Talla = Talla;
        this.Genero = Genero;
    }

    public int getTalla() {
        return Talla;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return super.toString()+" Ropa: " + "Talla=" + Talla + ", Genero=" + Genero;
    }
    
    
}
