package Ejercicios;

import java.util.Scanner;

public class Partidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ganados, empates, perdidos;

        System.out.println("Ingrese los partidos ganados");
        ganados = entrada.nextInt();

        System.out.println("Ingrese los partidos empatados");
        empates = entrada.nextInt();

        System.out.println("Ingrese los partidos perdidos");
        perdidos = entrada.nextInt();

        int puntostotales = (ganados * 3) + (empates * 1) + (perdidos * 0);

        System.out.println("Los puntos totales son: " + puntostotales);



    }
}
