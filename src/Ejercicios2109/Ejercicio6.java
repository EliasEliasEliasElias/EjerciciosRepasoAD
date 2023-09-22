package Ejercicios2109;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("Elija una opcion: \n 1. Error Ejercicio 2 \n 2. Error Ejercicio 3 ");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                ej2();
                break;
            case 2:
                ej3();
                break;
            default:



        }
    }

    public static void ej2 () {
        System.out.println("La division de de un número entre 0 lanza la excepción ArithmeticException");
        try {
            int exc = 4 / 0;

        }catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("El error se encuentra en: " + e.getStackTrace()[1].toString());

        }
    }

    public static void ej3 () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un número entero. (Para lanzar una excepción, introduzca algo que no sea un número entero.)");
            try {
                int num = sc.nextInt();

            } catch (java.util.InputMismatchException e) {
                System.out.println("No es un número entero.");
                System.out.println("Mensaje de error: ");
                e.printStackTrace();
            }
    }
}
