package Ejercicios2109;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número entero.");
    try {
        int num = sc.nextInt();

    } catch (java.util.InputMismatchException e) {
        System.out.println("No es un número entero.");
    }


    }
}
