
package lab3_carlosromero;

public class Empleados extends Persona{
    private String Horario;
    private int NumeroDeProductosVendidos;

    public Empleados() {
        super();
    }

    public Empleados(String Horario, int NumeroDeProductosVendidos) {
        this.Horario = Horario;
        this.NumeroDeProductosVendidos = NumeroDeProductosVendidos;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getNumeroDeProductosVendidos() {
        return NumeroDeProductosVendidos;
    }

    public void setNumeroDeProductosVendidos(int NumeroDeProductosVendidos) {
        this.NumeroDeProductosVendidos = NumeroDeProductosVendidos;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmpleado:  " + "Horario=" + Horario + ", NumeroDeProductosVendidos=" + NumeroDeProductosVendidos;
    }
    
    
}
