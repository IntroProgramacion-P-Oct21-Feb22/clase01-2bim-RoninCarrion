/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {

    public static void main(String[] args) {
        int operacion;
        String cadena_1 = " ";
        String cadena_2 = " ";
        String cadenaFinal = " ";

        for (int i = 1; i <= 10; i++) { // for 01
            cadena_1 = String.format("%sTabla de multiplicar del número %d\n"
                                    , cadena_1
                                    , i);

            for (int contador = 1; contador <= 12; contador++) {
                operacion = i * contador;
                cadena_1 = String.format("%s%d x %d = %d\n",cadena_1, i, contador, operacion);
            }            
        } 
        System.out.printf("%s\n", cadena_1);
    }
}
