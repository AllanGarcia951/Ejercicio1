/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ATERCERO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner allancito = new Scanner(System.in);
        System.out.println("Ingrese su codigo de trajador");
        String codigo = allancito.nextLine();
        
        System.out.println("Ingrese su nombre");
        String nombre = allancito.nextLine();
        
        System.out.println("Ingrese su apellido");
        String apellidos = allancito.nextLine();
        
        System.out.println("Su salario mensual es de: ");
        double salario = allancito.nextDouble();
       
        System.out.println("Trabajador: " + nombre);
        System.out.println("Salario mensual: " + salario);
        System.out.println("Salario diario: " + salario/30);
    }
    
}
