/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_carlosromero;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Lab3_CarlosRomero {

    static ArrayList<Locales> locales = new ArrayList();
    static ArrayList<Persona> personas = new ArrayList();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        String inicio = "";
        try {
            while (!inicio.equals("Salir")) {
                String[] z = {"Menú Administrativo", "Agregar Persona", "Modificar Persona", "Eliminar Persona", "Listar Personas", "Salir"};
                inicio = (String) JOptionPane.showInputDialog(null, "                           Menu Inicial            ", "Centro Comercial", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
                if (inicio.equals(z[0])) {
                    if (personas.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                    } else {
                        MenuAdministrativo();
                    }
                }
                if (inicio.equals(z[1])) {
                    agregar();
                }
                if (inicio.equals(z[2])) {
                    if (personas.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                    } else {
                        modificar();
                    }
                }
                if (inicio.equals(z[3])) {
                    if (personas.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                    } else {
                        int Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                        while (Pos >= personas.size()) {
                            JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
                            Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                        }
                        personas.remove(Pos);
                    }
                }
                if (inicio.equals(z[4])) {
                    if (personas.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe Agregar Personas Primero!");
                    } else {
                        String s = "________________________________________Personas________________________________________\n";
                        for (Object t : personas) {
                            s += "" + personas.indexOf(t) + "" + ") \n" + t + "\n\n";
                        }
                        JOptionPane.showMessageDialog(null, s);
                    }
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Saliendo", "Saliendo", 2);
        }
    }

    public static void agregar() {
        String tipo = "";
        String[] t = {"Empleado", "Cliente"};
        tipo = (String) JOptionPane.showInputDialog(null, "Seleccion un tipo de persona:", "Agregar", JOptionPane.DEFAULT_OPTION, null, t, t[0]);
        if (tipo.equals(t[0])) {
            personas.add(new Empleados());
            String Username = JOptionPane.showInputDialog("Ingrese el Username:");
            for (int i = 0; i < personas.size() - 1; i++) {
                while (((Persona) personas.get(i)).getUsername().equals(Username)) {
                    JOptionPane.showMessageDialog(null, "Username Repetido!");
                    Username = JOptionPane.showInputDialog("Ingrese el Username:");
                }
            }
            personas.get(personas.size() - 1).setUsername(Username);
            String Password = JOptionPane.showInputDialog("Ingrese el Password:");
            personas.get(personas.size() - 1).setPassword(Password);
            String Correo = JOptionPane.showInputDialog("Ingrese el correo:");
            personas.get(personas.size() - 1).setCorreo(Correo);
            String NombreCompleto = JOptionPane.showInputDialog("Ingrese Nombre Completo:");
            personas.get(personas.size() - 1).setNombreCompleto(NombreCompleto);
            String ID = JOptionPane.showInputDialog("Ingrese ID:");
            for (int i = 0; i < personas.size() - 1; i++) {
                while (((Persona) personas.get(i)).getID().equals(ID)) {
                    JOptionPane.showMessageDialog(null, "ID Repetido!");
                    ID = JOptionPane.showInputDialog("Ingrese el ID:");
                }
            }
            personas.get(personas.size() - 1).setID(ID);
            String FechaNacimiento = JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:", "DD/MM/AAAA");
            personas.get(personas.size() - 1).setFechaNacimiento(FechaNacimiento);
            String Horario = JOptionPane.showInputDialog("Ingrese el Horraio De Trabajo:", "00:00-00:00");
            ((Empleados) personas.get(personas.size() - 1)).setHorario(Horario);
            int NumeroDeProductosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Productos Vendidos:", "0"));
            ((Empleados) personas.get(personas.size() - 1)).setNumeroDeProductosVendidos(NumeroDeProductosVendidos);
        } else {
            personas.add(new Clientes());
            String Username = JOptionPane.showInputDialog("Ingrese el Username:");
            for (int i = 0; i < personas.size() - 1; i++) {
                while (((Persona) personas.get(i)).getUsername().equals(Username)) {
                    JOptionPane.showMessageDialog(null, "Username Repetido!");
                    Username = JOptionPane.showInputDialog("Ingrese el Username:");
                }
            }
            personas.get(personas.size() - 1).setUsername(Username);
            String Password = JOptionPane.showInputDialog("Ingrese el Password:");
            personas.get(personas.size() - 1).setPassword(Password);
            String Correo = JOptionPane.showInputDialog("Ingrese el correo:");
            personas.get(personas.size() - 1).setCorreo(Correo);
            String NombreCompleto = JOptionPane.showInputDialog("Ingrese Nombre Completo:");
            personas.get(personas.size() - 1).setNombreCompleto(NombreCompleto);
            String ID = JOptionPane.showInputDialog("Ingrese ID:");
            for (int i = 0; i < personas.size() - 1; i++) {
                while (((Persona) personas.get(i)).getID().equals(ID)) {
                    JOptionPane.showMessageDialog(null, "ID Repetido!");
                    ID = JOptionPane.showInputDialog("Ingrese el ID:");
                }
            }
            personas.get(personas.size() - 1).setID(ID);
            String FechaNacimiento = JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:", "DD/MM/AAAA");
            personas.get(personas.size() - 1).setFechaNacimiento(FechaNacimiento);
            double Dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero", "0.00"));
            ((Clientes) personas.get(personas.size() - 1)).setDinero(Dinero);
        }
    }

    public static void modificar() {
        String s = "________________________________________Personas________________________________________\n";
        for (Object t : personas) {
            s += "" + personas.indexOf(t) + "" + ") \n" + t + "\n\n";
        }
        System.out.println(s);
        int Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
        while (Pos >= personas.size()) {
            JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
            Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
        }
        if (personas.get(Pos).toString().contains("Empleado")) {
            String[] m = {"Username", "Password", "Correo", "Nombre Completo", "ID", "Fecha de Nacimiento", "Horario", "Numero de Productos Vendidos"};
            String p = (String) JOptionPane.showInputDialog(null, "Seleccion una opcion:", "Modificar", JOptionPane.DEFAULT_OPTION, null, m, m[0]);
            if (p.equals(m[0])) {
                String Username = JOptionPane.showInputDialog("Ingrese el Username Nuevo:");
                for (int i = 0; i < personas.size() - 1; i++) {
                    while (((Persona) personas.get(i)).getUsername().equals(Username)) {
                        JOptionPane.showMessageDialog(null, "Username Repetido!");
                        Username = JOptionPane.showInputDialog("Ingrese el Username:");
                    }
                }
                personas.get(personas.size() - 1).setUsername(Username);
            }
            if (p.equals(m[1])) {
                String Password = JOptionPane.showInputDialog("Ingrese el Password:");
                personas.get(personas.size() - 1).setPassword(Password);
            }
            if (p.equals(m[2])) {
                String Correo = JOptionPane.showInputDialog("Ingrese el Correo:");
                personas.get(personas.size() - 1).setCorreo(Correo);
            }
            if (p.equals(m[3])) {
                String NombreCompleto = JOptionPane.showInputDialog("Ingrese Nombre Completo:");
                personas.get(personas.size() - 1).setNombreCompleto(NombreCompleto);
            }
            if (p.equals(m[4])) {
                String ID = JOptionPane.showInputDialog("Ingrese ID:");
                for (int i = 0; i < personas.size() - 1; i++) {
                    while (((Persona) personas.get(i)).getID().equals(ID)) {
                        JOptionPane.showMessageDialog(null, "ID Repetido!");
                        ID = JOptionPane.showInputDialog("Ingrese el ID:");
                    }
                }
                personas.get(personas.size() - 1).setID(ID);
            }
            if (p.equals(m[5])) {
                String FechaNacimiento = JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:", "DD/MM/AAAA");
                personas.get(personas.size() - 1).setFechaNacimiento(FechaNacimiento);
            }
            if (p.equals(m[6])) {
                String Horario = JOptionPane.showInputDialog("Ingrese el Horraio De Trabajo:", "00:00-00:00");
                ((Empleados) personas.get(personas.size() - 1)).setHorario(Horario);
            }
            if (p.equals(m[7])) {
                int NumeroDeProductosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Productos Vendidos:", "0"));
                ((Empleados) personas.get(personas.size() - 1)).setNumeroDeProductosVendidos(NumeroDeProductosVendidos);
            }
        } else {
            String[] m = {"Username", "Password", "Correo", "Nombre Completo", "ID", "Fecha de Nacimiento", "Dinero"};
            String p = (String) JOptionPane.showInputDialog(null, "Seleccion una opcion:", "Modificar", JOptionPane.DEFAULT_OPTION, null, m, m[0]);
            if (p.equals(m[0])) {
                String Username = JOptionPane.showInputDialog("Ingrese el Username Nuevo:");
                for (int i = 0; i < personas.size() - 1; i++) {
                    while (((Persona) personas.get(i)).getUsername().equals(Username)) {
                        JOptionPane.showMessageDialog(null, "Username Repetido!");
                        Username = JOptionPane.showInputDialog("Ingrese el Username:");
                    }
                }
                personas.get(personas.size() - 1).setUsername(Username);
            }
            if (p.equals(m[1])) {
                String Password = JOptionPane.showInputDialog("Ingrese el Password:");
                personas.get(personas.size() - 1).setPassword(Password);
            }
            if (p.equals(m[2])) {
                String Correo = JOptionPane.showInputDialog("Ingrese el Correo:");
                personas.get(personas.size() - 1).setCorreo(Correo);
            }
            if (p.equals(m[3])) {
                String NombreCompleto = JOptionPane.showInputDialog("Ingrese Nombre Completo:");
                personas.get(personas.size() - 1).setNombreCompleto(NombreCompleto);
            }
            if (p.equals(m[4])) {
                String ID = JOptionPane.showInputDialog("Ingrese ID:");
                for (int i = 0; i < personas.size() - 1; i++) {
                    while (((Persona) personas.get(i)).getID().equals(ID)) {
                        JOptionPane.showMessageDialog(null, "ID Repetido!");
                        ID = JOptionPane.showInputDialog("Ingrese el ID:");
                    }
                }
                personas.get(personas.size() - 1).setID(ID);
            }
            if (p.equals(m[5])) {
                String FechaNacimiento = JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:", "DD/MM/AAAA");
                personas.get(personas.size() - 1).setFechaNacimiento(FechaNacimiento);
            }
            if (p.equals(m[6])) {
                double Dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero", "0.00"));
                ((Clientes) personas.get(personas.size() - 1)).setDinero(Dinero);
            }
        }
    }

    public static void MenuAdministrativo() {
        String adminitracion = "";
        while (!adminitracion.equals("Salir")) {
            String[] z = {"Iniciar Sesión", "Salir"};
            adminitracion = (String) JOptionPane.showInputDialog(null, "Por favor Inicie Sesión:", "Menú Administrativo", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
            if (adminitracion.equals(z[0])) {
                String s = "________________________________________Personas________________________________________\n";
                for (Object t : personas) {
                    s += "" + personas.indexOf(t) + "" + ") \n" + t + "\n\n";
                }
                String user = JOptionPane.showInputDialog("Ingrese el Usuario:", "will");
                if (s.contains(user) || user.equals("will")) {
                    String pass = JOptionPane.showInputDialog("Ingrese el Password:", "1234");
                    if (s.contains(pass) || pass.equals("1234")) {
                        String[] tipo = {"Empleado", "Cliente"};
                        String Tipo = (String) JOptionPane.showInputDialog(null, "Seleccione el Tipo de Persona:", "Menú Administrativo", JOptionPane.DEFAULT_OPTION, null, tipo, tipo[0]);
                        if (Tipo.equals(tipo[0])) {
                            Empleados();
                        } else {
                            Clientes();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password Incorrecto!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Incorrecto!");
                }
            }
        }
    }

    public static void Empleados() {
        String s = "________________________________________Personas________________________________________\n";
        for (Object t : personas) {
            s += "" + personas.indexOf(t) + "" + ") \n" + t + "\n\n";
        }
        System.out.println(s);
        String menu = "";
        while (!menu.equals("Salir")) {
            String[] z = {"Agregar Locales", "Listar Locales", "Modificar Locales", "Salir"};
            menu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Locales", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
            if (menu.equals(z[0])) {
                String Nombre = JOptionPane.showInputDialog("Ingrese el Nombre del Local:");
                int Piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Piso donde esta ubicado el Local"));
                String Empleado = JOptionPane.showInputDialog("Ingrese el nombre del Empleado:");

                // while(!locales.get(locales.size()-1).toString().equals("Empleado")){
                //   JOptionPane.showMessageDialog(null, "Ese empleado no existe!");
                // Empleado=JOptionPane.showInputDialog("Ingrese el nombre del Empleado:");
                //}
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Productos a añadir:"));
                locales.add(new Locales());
                locales.get(locales.size() - 1).setNombre(Nombre);
                locales.get(locales.size() - 1).setPiso(Piso);
                locales.get(locales.size() - 1).setEmpleado(Empleado);
                while (cant > 0) {
                    String[] product = {"Ropa", "Juguetes"};
                    String p = (String) JOptionPane.showInputDialog(null, "Seleccion una opción:", "Productos", JOptionPane.DEFAULT_OPTION, null, product, product[0]);
                    if (p.equals(product[0])) {
                        locales.get(locales.size() - 1).getProdutos().add(new Ropa());
                        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescuento(Descuento);
                        int Talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla de la Ropa:"));
                        ((Ropa) locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1)).setTalla(Talla);
                        String Genero = JOptionPane.showInputDialog("Ingrese para qué género es la ropa:");
                        ((Ropa) locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1)).setGenero(Genero);
                    } else {
                        locales.get(locales.size() - 1).getProdutos().add(new Juguetes());
                        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescuento(Descuento);
                        String Tipo = JOptionPane.showInputDialog("Ingrese el Tipo de Juguete", "Auto,Muñeca,Para bebé,etc.");
                        ((Juguetes) locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1)).setTipo(Tipo);
                    }
                    cant = cant - 1;
                }
            }
            if (menu.equals(z[1])) {
                if (locales.size() - 1 < 0) {
                    JOptionPane.showMessageDialog(null, "Debe agregar locales primero", "Advertencia", 0);
                } else {
                    String m = "________________________________________Locales________________________________________\n";
                    for (Object t : locales) {
                        m += "" + locales.indexOf(t) + "" + ") \n" + t + "\n\n";
                    }
                    System.out.println(m);
                }
            }
            if (menu.equals(z[2])) {
                if (locales.size() - 1 < 0) {
                    JOptionPane.showMessageDialog(null, "Debe agregar locales primero", "Advertencia", 0);
                } else {
                    ModificarLocales();
                }
            }
        }
    }

    public static void Clientes() {
        String y = "________________________________________Personas________________________________________\n";
        for (Object t : personas) {
            y += "" + personas.indexOf(t) + "" + ") \n" + t + "\n\n";
        }
        System.out.println(y);
        int z = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cliente al que desea agregar productos"));
        while (personas.get(z).toString().contains("Cliente")) {
            JOptionPane.showInternalInputDialog(null, "Ese no es un cliente");
            z = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cliente al que desea agregar productos"));
        }
        String m = "________________________________________Locales________________________________________\n";
        for (Object t : locales) {
            m += "" + locales.indexOf(t) + "" + ") \n" + t + "\n\n";
        }
        System.out.println(m);
        int Pos = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Local donde desea comprar:"));
        while (locales.size() < Pos) {
            JOptionPane.showMessageDialog(null, "Esa Posicion no existe");
            Pos = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Local donde desea comprar:"));
        }
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el producto que desea comprar:"));
        ((Clientes) personas.get(z)).getProductosComprados().add(locales.get(Pos).getProdutos().get(x));

    }

    public static void ModificarLocales() {
        if (locales.size() - 1 < 0) {
            JOptionPane.showMessageDialog(null, "Debe agregar locales primero", "Advertencia", 0);
        } else {
            String m = "________________________________________Locales________________________________________\n";
            for (Object t : locales) {
                m += "" + locales.indexOf(t) + "" + ") \n" + t + "\n\n";
            }
            System.out.println(m);
        }
        int x = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Local"));
        while (x > locales.size() - 1) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nSeleccione el Local"));
        }
        String menu = "";
        while (!menu.equals("Salir")) {
            String[] z = {"Agregar Productos al Local", "Eliminar Productos del Local", "Modificar Productos del Local", "Listar Productos del Local", "Salir"};
            menu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Locales", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
            if (menu.equals(z[0])) {
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Productos a añadir:"));
                while (cant > 0) {
                    String[] product = {"Ropa", "Juguetes"};
                    String p = (String) JOptionPane.showInputDialog(null, "Seleccion una opción:", "Productos", JOptionPane.DEFAULT_OPTION, null, product, product[0]);
                    if (p.equals(product[0])) {
                        locales.get(x).getProdutos().add(new Ropa());
                        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setDescuento(Descuento);
                        int Talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla de la Ropa:"));
                        ((Ropa) locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1)).setTalla(Talla);
                        String Genero = JOptionPane.showInputDialog("Ingrese para qué género es la ropa:");
                        ((Ropa) locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1)).setGenero(Genero);
                    } else {
                        locales.get(x).getProdutos().add(new Juguetes());
                        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setDescuento(Descuento);
                        String Tipo = JOptionPane.showInputDialog("Ingrese el Tipo de Juguete", "Auto,Muñeca,Para bebé,etc.");
                        ((Juguetes) locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1)).setTipo(Tipo);
                    }
                    cant = cant - 1;
                }
            }
            if (menu.equals(z[1])) {
                String m = "Productos del Local " + locales.get(x).getNombre() + "\n";
                for (Object t : locales.get(x).getProdutos()) {
                    m += "" + locales.get(x).getProdutos().indexOf(t) + "" + ") \n" + t + "\n\n";
                }
                System.out.println(m);
                int p = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Producto a Eliminar"));
                while (p > locales.get(x).getProdutos().size() - 1) {
                    p = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nSeleccione el Producto a Eliminar"));
                }
                locales.get(x).getProdutos().remove(p);
            }
            if (menu.equals(z[3])) {
                String m = "Productos del Local " + locales.get(x).getNombre() + "\n";
                for (Object t : locales.get(x).getProdutos()) {
                    m += "" + locales.get(x).getProdutos().indexOf(t) + "" + ") \n" + t + "\n\n";
                }
                System.out.println(m);
            }
            if (menu.equals(z[2])) {
                String m = "Productos del Local " + locales.get(x).getNombre() + "\n";
                for (Object t : locales.get(x).getProdutos()) {
                    m += "" + locales.get(x).getProdutos().indexOf(t) + "" + ") \n" + t + "\n\n";
                }
                System.out.println(m);
                int p = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Producto a Modificar"));
                while (p > locales.get(x).getProdutos().size() - 1) {
                    p = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nSeleccione el Producto a Modificar"));
                }
                if (locales.get(x).getProdutos().get(p) instanceof Ropa) {
                    double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                    locales.get(x).getProdutos().get(p).setPrecio(Precio);
                    String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                    locales.get(x).getProdutos().get(p).setDescripcion(Descripcion);
                    String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                    locales.get(x).getProdutos().get(p).setMarca(Marca);
                    double Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                    locales.get(x).getProdutos().get(p).setDescuento(Descuento);
                    int Talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla de la Ropa:"));
                    ((Ropa) locales.get(x).getProdutos().get(p)).setTalla(Talla);
                    String Genero = JOptionPane.showInputDialog("Ingrese para qué género es la ropa:");
                    ((Ropa) locales.get(x).getProdutos().get(p)).setGenero(Genero);
                } else {
                    double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                    locales.get(x).getProdutos().get(p).setPrecio(Precio);
                    String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                    locales.get(x).getProdutos().get(p).setDescripcion(Descripcion);
                    String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                    locales.get(x).getProdutos().get(p).setMarca(Marca);
                    double Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                    locales.get(x).getProdutos().get(p).setDescuento(Descuento);
                    String Tipo = JOptionPane.showInputDialog("Ingrese el Tipo de Juguete", "Auto,Muñeca,Para bebé,etc.");
                    ((Juguetes) locales.get(x).getProdutos().get(p)).setTipo(Tipo);
                }
            }
        }
    }
}
