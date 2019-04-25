/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.*;
/**
 *
 * @author alexa
 */
public class SeleccionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // metodo principal
        
        String miMensaje = Operacion.mensaje;
        int calificacion;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la calificacion del estudiante:\n");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
        int calificacion_2;
        
        System.out.println("Ingrese la segunda calificacion:");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion_2 >=85){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        }
    }
    
}
