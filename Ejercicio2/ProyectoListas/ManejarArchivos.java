package ProyectoListas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class ManejarArchivos {

    public static void guardarListaEnArchivo(ListaSimple listaEmpleados){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ListaEmpleados.txt"))) {
            Nodo actual = listaEmpleados.inicio;
            while (actual != null) {
                writer.write(actual.dato.toString());
                writer.newLine();
                actual = actual.Siguiente;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar"
                +"\n El archivo"+e.getMessage());
        }
    }

    public static ListaSimple cargarEmpresaDeLista(){
        ListaSimple listaEmpleados = new ListaSimple();
        try(BufferedReader reader = new BufferedReader(new FileReader("ListaEmpleados.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if(!linea.trim().isEmpty()){
                    String[] partes = linea.trim().split(" ",4);
                     if(partes.length >= 4 ){
                        try {
                        int id =Integer.parseInt(partes[0]);
                        String nombre = partes[1];
                        String apellidos = partes[2];
                        String correo = partes[3];

                        Empleados empleados = new Empleados(id, nombre, apellidos, correo);
                        Nodo nuevoNodo = new Nodo(empleados);
                        listaEmpleados.insertarNodo(nuevoNodo);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null,"Error al persear ID empleado\n error"+e.getMessage()+"\nLinea: "+linea);
                        }

                     }else{
                        JOptionPane.showMessageDialog(null, "Línea con formato incorrecto: "+linea);
                     }
                }
            }
            JOptionPane.showMessageDialog(null, "Lista de Empleados cargada exitosamente desde el archivo.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: "+e.getMessage()+"\n No existe el archivo");
            JOptionPane.showMessageDialog(null, "Se retornara una lista vacia");
        }

        return listaEmpleados;
    }

}