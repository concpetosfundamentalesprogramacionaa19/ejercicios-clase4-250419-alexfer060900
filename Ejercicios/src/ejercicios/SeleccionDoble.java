package ejercicios;


import java.util.Scanner;
import paquetedos.*;

/**
 *
 * @author alexa
 */
public class SeleccionDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // documentacion
        String miMensaje = Operacion.mensaje;
        String miMensaje2 = Operacion.mensaje2;
        int calificacion;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la calificacion del estudiante:\n");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }else{
            System.out.printf("%s %d\n", miMensaje2, calificacion);
        }
        
        int calificacion_2;
        
        System.out.println("Ingrese la segunda calificacion:");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion_2 >=85){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        }else{
            System.out.printf("%s %d\n", miMensaje2, calificacion_2);
        }
    }
}   

