package Ejercicios;

import java.util.Scanner;

public class SueldoEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo, descuento;

        System.out.println("Escriba el sueldo del empleado");
        sueldo = entrada.nextInt();

        if (sueldo < 500.00){
            descuento = 0.00;
        }
        else if(sueldo >= 500.00 && sueldo < 750.00){
            descuento = sueldo * 0.05;
        }

        else{
            descuento = sueldo * 0.10;
        }

        System.out.println("El descuento del sueldo es de:"+ descuento);






    }
}
