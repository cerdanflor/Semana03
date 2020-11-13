package algoritmos;

import java.util.Scanner;

public class Binario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista[] = {2, 4, 5, 9, 12, 15, 16, 28, 29, 51};
        int num, centro, primero = 0, ultimo, valorcentro;
        boolean encontrado = false;
        ultimo = lista.length - 1;
        System.out.print("ingresar valor a buscar: ");
        num = Integer.valueOf(teclado.nextLine());
        while (primero <= ultimo && encontrado == false) {
            centro = (primero + ultimo) / 2;
            valorcentro = lista[centro];
            System.out.println("Comparando a " + num + " con " + valorcentro);
            if (num == valorcentro) {
                encontrado = true;
                System.out.println(centro);
            } else if (num < valorcentro) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        if (encontrado == false) {
            System.out.println("Valor no encontrado");
        }
    }
}
