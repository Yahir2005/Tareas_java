package ProyectoListas;
import javax.swing.*;

public class SistemaEmpleados {
    static ListaSimple listaEmpleados;
    public static void main(String[] args) {
        int opc=0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("[Menu] \n"
            +"\nInsertar Empleados"
            +"\nListar Empleados"
            +"\nSalir"
            ));
            switch (opc) {
                case 1:
                    InsertarEmpleado();
                    break;
                case 2:
                    mostrarListaEmpleados();
                    break;
                case 3:

                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, "No existe tal opcion");
                    break;
            }
        } while (opc != 3 );
    }

    public static void InsertarEmpleado(){
        Nodo newNodoEmpleado;
        listaEmpleados = new ListaSimple();
        listaEmpleados = ManejarArchivos.cargarEmpresaDeLista();
        int id=0;
        String nombre,apellido,email;
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
        email = JOptionPane.showInputDialog("Ingrese su correo");
        Empleados empleados = new Empleados(id, nombre, apellido, email);
        newNodoEmpleado = new Nodo(empleados);
        listaEmpleados.insertarNodo(newNodoEmpleado);
        ManejarArchivos.guardarListaEnArchivo(listaEmpleados);

    }

    public static void mostrarListaEmpleados(){
        listaEmpleados.mostrarLista();
    }
}
