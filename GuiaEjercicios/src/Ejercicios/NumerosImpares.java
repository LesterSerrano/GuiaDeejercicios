package Ejercicios;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;

        System.out.println("Ingrese un numero entero");
        num1 = entrada.nextInt();

        if ( num1 <= 0 ){
            System.out.println("Por favor ingrese un numero positivo");
        }
        else {
            System.out.println("Números impares entre 0 y " + num1 + ":");
            for (int i = 1; i <= num1; i += 2) {
                System.out.println(i);
            }
        }

    }

}
