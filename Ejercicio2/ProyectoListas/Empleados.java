package ProyectoListas;
class Empleados{

    int EmpleadosId;
    String Nombre;
    String Apellidos;
    String Correo;

    public Empleados(int EmpleadosId, String nombre, String apellidos, String correo) {
        this.EmpleadosId = EmpleadosId;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Correo = correo;
    }

    public String toString(){
        return EmpleadosId + " " + Nombre + " " + Apellidos + " " + Correo;
    }
}