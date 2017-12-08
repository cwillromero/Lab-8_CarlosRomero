
package lab3_carlosromero;

public class Juguetes extends Productos {
    private String Tipo;

    public Juguetes() {
        super();
    }

    public Juguetes(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" Juguete: " + "Tipo=" + Tipo;
    }
    
    
}
