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
public class SeleccionAnidada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // documentacion
        String miMensaje = operacion2.mensaje3;
        String miMensaje2 = operacion2.mensaje4;
        String miMensaje3 = operacion2.mensaje5;
        String miMensaje4 = operacion2.mensaje6;
        int calificacion;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la calificacion del estudiante:\n");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 90){
            System.out.printf("%s (excelente) con %d\n", miMensaje,
                    calificacion);
        }else{
            if (calificacion < 90 && calificacion >=80) {
                System.out.printf("%s %d\n", miMensaje2, calificacion);
            }else{
                if (calificacion < 80 && calificacion >=50) {
                    System.out.printf("%s %d\n", miMensaje3, calificacion);               
                }else{
                    System.out.printf("%s %d\n", miMensaje4, calificacion);
                }
            }
        }
    }   
}   
