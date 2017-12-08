/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlosromero;

/**
 *
 * @author Will
 */
public class Persona {
 private String Username;
 private String Password;
 private String Correo;
 private String NombreCompleto;
 private String ID;
 private String FechaNacimiento;

    public Persona() {
    }

    public Persona(String Username, String Password, String Correo, String NombreCompleto, String ID, String FechaNacimiento) {
        this.Username = Username;
        this.Password = Password;
        this.Correo = Correo;
        this.NombreCompleto = NombreCompleto;
        this.ID = ID;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona:\n" + "Username=" + Username + ", Password=" + Password + ", Correo=" + Correo + ", NombreCompleto=" + NombreCompleto + ", ID=" + ID + ", FechaNacimiento=" + FechaNacimiento;
    }
 
    
}
