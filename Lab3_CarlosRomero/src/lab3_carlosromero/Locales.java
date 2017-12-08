package lab3_carlosromero;

import java.util.ArrayList;
    public class Locales {
        private String Nombre;
        private int Piso;
        private ArrayList<Productos> Produtos=new ArrayList();
        private String Empleado;

    public Locales() {
    }

    public Locales(String Nombre, int Piso, String Empleado) {
        this.Nombre = Nombre;
        this.Piso = Piso;
        this.Empleado = Empleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public ArrayList<Productos> getProdutos() {
        return Produtos;
    }

    public void setProdutos(ArrayList<Productos> Produtos) {
        this.Produtos = Produtos;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    @Override
    public String toString() {
        String m = "Productos\n";
                for (Object t : Produtos) {
                    m += "" + Produtos.indexOf(t) + "" + "_" + t + "\n";
                }
        return "Locales:\n" + "Nombre=" + Nombre + ", Piso=" + Piso + ", Empleado=" + Empleado+"\n"+m;
    }
    
}
