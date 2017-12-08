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
                        int Pos = -1;
                        while (Pos == -1) {
                            try {
                                Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                                while (Pos >= personas.size()) {
                                    JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
                                    Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                                }
                            } catch (Exception e) {
                                Pos = -1;
                            }
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
                        JOptionPane.showMessageDialog(null, "Vea la consola");
                        System.out.println(s);
                    }
                }

            }
        } catch (Exception e) {
            Menu();
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
            int NumeroDeProductosVendidos = -1;
            while (NumeroDeProductosVendidos == -1) {
                try {
                    NumeroDeProductosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Productos Vendidos:", "0"));

                } catch (Exception e) {
                    NumeroDeProductosVendidos = -1;
                }
            }
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
            double Dinero = -1;
            while (Dinero == -1) {
                try {
                    Dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero", "0.00"));
                } catch (Exception e) {
                    Dinero = -1;
                }
            }
            ((Clientes) personas.get(personas.size() - 1)).setDinero(Dinero);
        }
    }

    public static void modificar() {
        String s = "________________________________________Personas________________________________________\n";
        for (Object t : personas) {
            s += "" + personas.indexOf(t) + "" + ") \n" + t + "\n\n";
        }
        System.out.println(s);
        int Pos = -1;
        while (Pos == -1) {
            try {
                Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
            } catch (Exception e) {
                Pos = -1;
            }
        }
        while (Pos >= personas.size()) {
            JOptionPane.showMessageDialog(null, "Esa Posición no existe!");
            Pos = -1;
            while (Pos == -1) {
                try {
                    Pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                } catch (Exception e) {
                    Pos = -1;
                }
            }
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
                int NumeroDeProductosVendidos = -1;
                while (NumeroDeProductosVendidos == -1) {
                    try {
                        NumeroDeProductosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Productos Vendidos:", "0"));
                    } catch (Exception e) {
                        NumeroDeProductosVendidos = -1;
                    }
                }
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
                double Dinero = -1;
                while (Dinero == -1) {
                    try {
                        Dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero", "0.00"));
                    } catch (Exception e) {
                        Dinero = -1;
                    }
                }
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
                            int x = 0;
                            for (int I = 0; I < personas.size(); I++) {
                                if (personas.get(I) instanceof Empleados) {
                                    x = x + 1;
                                }
                            }
                            if (x == 0) {
                                JOptionPane.showMessageDialog(null, "No hay Empleados Agregados");
                            } else {
                                Empleados();
                            }
                        } else {
                            int x = 0;
                            for (int I = 0; I < personas.size(); I++) {
                                if (personas.get(I) instanceof Clientes) {
                                    x = x + 1;
                                }
                            }
                            if (x == 0) {
                                JOptionPane.showMessageDialog(null, "No hay Clientes Agregados");
                            } else {
                                if ((locales.size() - 1) < 0) {
                                    JOptionPane.showMessageDialog(null, "No hay Locales Agregados");
                                } else {
                                    Clientes();
                                }
                            }
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
        String s = "________________________________________Personas_______________________________________\n";
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
                int Piso = -1;
                while (Piso == -1) {
                    try {
                        Piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Piso donde esta ubicado el Local"));
                    } catch (Exception e) {
                        Piso = -1;
                    }
                }
                String Empleado = JOptionPane.showInputDialog("Ingrese el nombre del Empleado:");
                int cant = -1;
                while (cant == -1) {
                    try {
                        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Productos a añadir:"));
                    } catch (Exception e) {
                        cant = -1;
                    }
                }
                locales.add(new Locales());
                locales.get(locales.size() - 1).setNombre(Nombre);
                locales.get(locales.size() - 1).setPiso(Piso);
                locales.get(locales.size() - 1).setEmpleado(Empleado);
                while (cant > 0) {
                    String[] product = {"Ropa", "Juguetes"};
                    String p = (String) JOptionPane.showInputDialog(null, "Seleccion una opción:", "Productos", JOptionPane.DEFAULT_OPTION, null, product, product[0]);
                    if (p.equals(product[0])) {
                        locales.get(locales.size() - 1).getProdutos().add(new Ropa());
                        double Precio = -1;
                        while (Precio == -1) {
                            try {
                                Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                            } catch (Exception e) {
                                Precio = -1;
                            }
                        }
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = -1;
                        while (Descuento == -1) {
                            try {
                                Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                            } catch (Exception e) {
                                Descuento = -1;
                            }
                        }
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescuento(Descuento);
                        int Talla = -1;
                        while (Talla == -1) {
                            try {
                                Talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla de la Ropa:"));
                            } catch (Exception e) {
                                Talla = -1;
                            }
                        }
                        ((Ropa) locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1)).setTalla(Talla);
                        String Genero = JOptionPane.showInputDialog("Ingrese para qué género es la ropa:");
                        ((Ropa) locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1)).setGenero(Genero);
                    } else {
                        locales.get(locales.size() - 1).getProdutos().add(new Juguetes());
                        double Precio = -1;
                        while (Precio == -1) {
                            try {
                                Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                            } catch (Exception e) {
                                Precio = -1;
                            }
                        }
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = -1;
                        while (Descuento == -1) {
                            try {
                                Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                            } catch (Exception e) {
                                Descuento = -1;
                            }
                        }
                        locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1).setDescuento(Descuento);
                        String Tipo = JOptionPane.showInputDialog("Ingrese el Tipo de Juguete", "Auto,Muñeca,Para bebé,etc.");
                        ((Juguetes) locales.get(locales.size() - 1).getProdutos().get(locales.get(locales.size() - 1).getProdutos().size() - 1)).setTipo(Tipo);
                    }
                    cant = cant - 1;
                }
            }
            if (menu.equals(z[1])) {
                JOptionPane.showMessageDialog(null, "Vea la consola");
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
        int z = -1;
        while (z == -1) {
            try {
                z = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cliente:"));
                if (personas.get(z) instanceof Empleados) {
                    JOptionPane.showMessageDialog(null, "No es un cliente.");
                    z = -1;
                }
            } catch (Exception e) {
                z = -1;
            }
        }
        String adminitracion = "";
        while (!adminitracion.equals("Salir")) {
            String[] Y = {"Comprar", "Listar Productos", "Eliminar Productos", "Salir"};
            adminitracion = (String) JOptionPane.showInputDialog(null, "Elija una opcion:", "Menú Administrativo", JOptionPane.DEFAULT_OPTION, null, Y, Y[0]);

            if (adminitracion.endsWith(Y[0])) {
                String m = "________________________________________Locales________________________________________\n";
                for (Object t : locales) {
                    m += "" + locales.indexOf(t) + "" + ") \n" + t + "\n\n";
                }
                System.out.println(m);
                int Pos = -1;
                while (Pos == -1) {
                    try {
                        Pos = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Local donde desea comprar:"));
                    } catch (Exception e) {
                        Pos = -1;
                    }
                }
                while (locales.size() < Pos) {
                    JOptionPane.showMessageDialog(null, "Esa Posicion no existe");
                    Pos = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Local donde desea comprar:"));
                }
                int cont = 0;
                String M = "Productos del Local " + locales.get(Pos).getNombre() + "\n";
                for (Object t : locales.get(Pos).getProdutos()) {
                    M += "" + cont + "" + ") \n" + t + "\n\n";
                    cont++;
                }
                System.out.println(M);
                int x = -1;
                while (x == -1) {
                    try {
                        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el producto que desea comprar:"));
                    } catch (Exception e) {
                        x = -1;
                    }
                }
                while (x > locales.get(Pos).getProdutos().size() - 1) {
                    x = -1;
                    while (x == -1) {
                        try {
                            x = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nIngrese el producto que desea comprar:"));
                        } catch (Exception e) {
                            x = -1;
                        }
                    }
                }
                double precio = locales.get(Pos).getProdutos().get(x).getPrecio();
                double dinero = ((Clientes) personas.get(z)).getDinero();
                if (dinero <= precio) {
                    JOptionPane.showMessageDialog(null, "El dinero no ajusta");
                } else {
                    ((Clientes) personas.get(z)).getProductosComprados().add(locales.get(Pos).getProdutos().get(x));
                    ((Clientes) personas.get(z)).setDinero(((Clientes) personas.get(z)).getDinero() - locales.get(Pos).getProdutos().get(x).getPrecio());
                    locales.get(Pos).setContador(locales.get(Pos).getContador() + 1);
                    locales.get(Pos).getVendidos().add(locales.get(Pos).getProdutos().get(x));
                }
            }
            if (adminitracion.equals(Y[1])) {
                if ((((Clientes) personas.get(z)).getProductosComprados().size() - 1) < 0) {
                    JOptionPane.showMessageDialog(null, "No ha comprado ");
                } else {
                    String m = "Productos del Cliente\n";
                    int cont = 0;
                    for (Object t : ((Clientes) personas.get(z)).getProductosComprados()) {
                        m += "" + cont + "" + ") \n" + t + "\n\n";
                        cont++;
                    }
                    System.out.println(m);
                }
            }
            if (adminitracion.equals(Y[2])) {
                if ((((Clientes) personas.get(z)).getProductosComprados().size() - 1) < 0) {
                    JOptionPane.showMessageDialog(null, "No ha comprado ");
                } else {
                    String m = "Productos del Cliente\n";
                    int cont = 0;
                    for (Object t : ((Clientes) personas.get(z)).getProductosComprados()) {
                        m += "" + cont + "" + ") \n" + t + "\n\n";
                        cont++;
                    }
                    System.out.println(m);
                    int x = -1;
                    while (x == -1) {
                        try {
                            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el producto a eliminar:"));
                        } catch (Exception e) {
                            x = -1;
                        }
                    }
                    while (x > (((Clientes) personas.get(z)).getProductosComprados().size() - 1)) {
                        x = -1;
                        while (x == -1) {
                            try {
                                x = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nIngrese el producto a eliminar:"));
                            } catch (Exception e) {
                                x = -1;
                            }
                        }
                    }
                    ((Clientes) personas.get(z)).getProductosComprados().remove(x);
                }
            }
        }
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
        int x = -1;
        while (x == -1) {
            try {
                x = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Local"));
            } catch (Exception e) {
                x = -1;
            }
        }
        while (x > locales.size() - 1) {
            x = -1;
            while (x == -1) {
                try {
                    x = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nSeleccione el Local"));
                } catch (Exception e) {
                    x = -1;
                }
            }
        }
        String menu = "";
        while (!menu.equals("Salir")) {
            String[] z = {"Agregar Productos al Local", "Eliminar Productos del Local", "Modificar Productos del Local", "Listar Productos del Local", "Facturacion", "Salir"};
            menu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Locales", JOptionPane.DEFAULT_OPTION, null, z, z[0]);
            if (menu.equals(z[0])) {

                int cant = -1;
                while (cant == -1) {
                    try {
                        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Productos a añadir:"));
                    } catch (Exception e) {
                        cant = -1;
                    }
                }
                while (cant > 0) {
                    String[] product = {"Ropa", "Juguetes"};
                    String p = (String) JOptionPane.showInputDialog(null, "Seleccion una opción:", "Productos", JOptionPane.DEFAULT_OPTION, null, product, product[0]);
                    if (p.equals(product[0])) {
                        locales.get(x).getProdutos().add(new Ropa());
                        double Precio = -1;
                        while (Precio == -1) {
                            try {
                                Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                            } catch (Exception e) {
                                Precio = -1;
                            }
                        }
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = -1;
                        while (Descuento == -1) {
                            try {
                                Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                            } catch (Exception e) {
                                Descuento = -1;
                            }
                        }
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setDescuento(Descuento);
                        int Talla = -1;
                        while (Talla == -1) {
                            try {
                                Talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla de la Ropa:"));
                            } catch (Exception e) {
                                Talla = -1;
                            }
                        }
                        ((Ropa) locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1)).setTalla(Talla);
                        String Genero = JOptionPane.showInputDialog("Ingrese para qué género es la ropa:");
                        ((Ropa) locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1)).setGenero(Genero);
                    } else {
                        locales.get(x).getProdutos().add(new Juguetes());
                        double Precio = -1;
                        while (Precio == -1) {
                            try {
                                Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                            } catch (Exception e) {
                                Precio = -1;
                            }
                        }
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setPrecio(Precio);
                        String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setDescripcion(Descripcion);
                        String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                        locales.get(x).getProdutos().get(locales.get(x).getProdutos().size() - 1).setMarca(Marca);
                        double Descuento = -1;
                        while (Descuento == -1) {
                            try {
                                Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                            } catch (Exception e) {
                                Descuento = -1;
                            }
                        }
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
                int p = -1;
                while (p == -1) {
                    try {
                        p = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Producto a Eliminar"));
                    } catch (Exception e) {
                        p = -1;
                    }
                }
                while (p > locales.get(x).getProdutos().size() - 1) {
                    p = -1;
                    while (p == -1) {
                        try {
                            p = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nSeleccione el Producto a Eliminar"));
                        } catch (Exception e) {
                            p = -1;
                        }
                    }
                }
                locales.get(x).getProdutos().remove(p);
            }
            if (menu.equals(z[3])) {
                JOptionPane.showMessageDialog(null, "Vea la consola");
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
                int p = -1;
                while (p == -1) {
                    try {
                        p = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Producto a Modificar"));
                    } catch (Exception e) {
                        p = -1;
                    }
                }
                while (p > locales.get(x).getProdutos().size() - 1) {
                    p = -1;
                    while (p == -1) {
                        try {
                            p = Integer.parseInt(JOptionPane.showInputDialog("Ese producto no existe!\nSeleccione el Producto a Modificar"));
                        } catch (Exception e) {
                            p = -1;
                        }
                    }
                }
                if (locales.get(x).getProdutos().get(p) instanceof Ropa) {
                    double Precio = -1;
                    while (Precio == -1) {
                        try {
                            Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                        } catch (Exception e) {
                            Precio = -1;
                        }
                    }
                    locales.get(x).getProdutos().get(p).setPrecio(Precio);
                    String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                    locales.get(x).getProdutos().get(p).setDescripcion(Descripcion);
                    String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                    locales.get(x).getProdutos().get(p).setMarca(Marca);
                    double Descuento = -1;
                    while (Descuento == -1) {
                        try {
                            Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                        } catch (Exception e) {
                            Descuento = -1;
                        }
                    }
                    locales.get(x).getProdutos().get(p).setDescuento(Descuento);
                    int Talla = -1;
                    while (Talla == -1) {
                        try {
                            Talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla de la Ropa:"));
                        } catch (Exception e) {
                            Talla = -1;
                        }
                    }
                    ((Ropa) locales.get(x).getProdutos().get(p)).setTalla(Talla);
                    String Genero = JOptionPane.showInputDialog("Ingrese para qué género es la ropa:");
                    ((Ropa) locales.get(x).getProdutos().get(p)).setGenero(Genero);
                } else {
                    double Precio = -1;
                    while (Precio == -1) {
                        try {
                            Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio", "0.00"));
                        } catch (Exception e) {
                            Precio = -1;
                        }
                    }
                    locales.get(x).getProdutos().get(p).setPrecio(Precio);
                    String Descripcion = JOptionPane.showInputDialog("Ingrese la Descripcion:");
                    locales.get(x).getProdutos().get(p).setDescripcion(Descripcion);
                    String Marca = JOptionPane.showInputDialog("Ingrese la marca");
                    locales.get(x).getProdutos().get(p).setMarca(Marca);
                    double Descuento = -1;
                    while (Descuento == -1) {
                        try {
                            Descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento"));
                        } catch (Exception e) {
                            Descuento = -1;
                        }
                    }
                    locales.get(x).getProdutos().get(p).setDescuento(Descuento);
                    String Tipo = JOptionPane.showInputDialog("Ingrese el Tipo de Juguete", "Auto,Muñeca,Para bebé,etc.");
                    ((Juguetes) locales.get(x).getProdutos().get(p)).setTipo(Tipo);
                }
            }
            if (menu.equals(z[4])) {
                if (locales.get(x).getContador() >= 5) {
                    String fact = "Productos Vendidos\n";
                    int cont = 0;
                    for (Object t : locales.get(x).getVendidos()) {
                        fact += "" + cont + "" + ") \n" + t + "\n\n";
                        cont++;
                    }
                    System.out.println(fact);
                } else {
                    JOptionPane.showMessageDialog(null, "Este local no ha vendido 5 productos");
                }
            }
        }
    }
}
