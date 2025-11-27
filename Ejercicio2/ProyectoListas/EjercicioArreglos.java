package ProyectoListas;
public class EjercicioArreglos {
    public static void main(String [] args){
        int [] numero ;
        numero = new int[4];

        numero[0] = 10;
        numero[1] = 23;
        numero[2] = 21;
        numero[3] = 4;

        for(int i = 0; i < numero.length ; i++){
            System.out.print("\n"+numero[i]);
        }
        
    }
}
