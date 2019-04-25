/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se declara variables y se solicita ingresar el numero de mensajes.
         
        int mensajes;
        int tarifab = 3;
        double tarifa;
        double tarifa2;
        double mensaje_adicional;
        double mensaje_adicional2;
        double valor;
        double valormensual;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de mensajes enviados");
        mensajes = entrada.nextInt();
        
        // Se procede a calcular la tarifa del cliente.
        
        if (mensajes <= 40){
            valor = tarifab;
            valormensual = (valor*12/100);
                    System.out.printf("El valor mensual a pagar seria %.1f", 
                            valormensual);
        }
            if (mensajes > 40 && mensajes <=200){
                mensaje_adicional = mensajes - 40;  
                tarifa = (mensaje_adicional*0.05);
                valor = tarifa + tarifab;
                valormensual = (valor*12/100);
                    System.out.printf("El valor mensual a pagar seria %.1f", 
                            valormensual);

                if (mensajes > 200){
                    mensaje_adicional2 = mensajes - 200;
                    tarifa2 = (mensaje_adicional2*0.10);
                    valor = tarifab + tarifa + tarifa2;
                 
                
                valormensual = (valor*12/100);
                    System.out.printf("El valor mensual a pagar seria %.1f", 
                            valormensual);
                }         
            }          
    }    
}
