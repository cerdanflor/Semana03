/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author UPEU
 */
public class Secuencial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista[] = {12, 18, -20, 0, 15, 12, 9, 6};
        int num;
        System.out.println("ingresar valor a buscar: ");
        num = teclado.nextInt();
        boolean encontrado = false;
        for (int i= 0; i < lista.length && encontrado == false;
        i++
        
            ){
            if (num == lista[i]) {
                encontrado = true;
                System.out.println("Posición del número buscado: " + i);
            }
        }
    }

}
