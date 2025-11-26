package ListaLigadas;
import javax.swing.JOptionPane;

public class Menu {
    static ListaSimple  objListar =  new ListaSimple();
    static Nodo newItem = null;
    /*
     * Editar el código del repositorio para que en 
     *lugar de guardar datos int, guarde nombres de estudiantes.
     */

     public static void main(String[] args) {
        MenuEstudiantes();
    }

     public static void MenuEstudiantes(){
        String NombreAlumno = "";
        int opciones;
        do {
             opciones = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE DEL MENU: "
            +"\n 1.-Ingrese Un Nombre de un Estudiante "
            +"\n 2.-Mostrar estudiantes almacenados "
            +"\n 3.-Salir "));

            switch (opciones) {
                case 1:
                    NombreAlumno = JOptionPane.showInputDialog("Ingrese el nombre del alumno por favor");
                    newItem = new Nodo(NombreAlumno);
                    objListar.insertarNodo(newItem);
                    
                break;
                case 2:
                    
                    JOptionPane.showMessageDialog(null, "Los Nombres almacenados son: ");
                    objListar.mostrarLista();
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                break;
                default:
                    JOptionPane.showMessageDialog(null,"No se encuentra en el menu la opcion que ingreso");
                break;
            }
        } while (opciones != 3);

     }
}
