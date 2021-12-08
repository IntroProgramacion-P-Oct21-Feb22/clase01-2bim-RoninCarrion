/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int limite;
        System.out.println("Ingresar el límite de la serie que desea imprimir: ");
        limite = entrada.nextInt();
        System.out.println("_____________________________________________");
        for (int i = 1; i <= limite; i+=2) {
            System.out.printf("%d\n", i);
        }
        
    }
    
}
