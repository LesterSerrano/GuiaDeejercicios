package Ejercicios;

import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] elementos = new String[8];

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Ingrese el nombre del elemento químico " + (i + 1) + ":");
            System.out.println();
            elementos[i] = entrada.nextLine();
        }

        System.out.println("Elementos químicos en orden inverso:");
        for (int i = elementos.length - 1; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}
