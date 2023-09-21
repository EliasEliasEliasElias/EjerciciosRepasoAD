package Ejercicios1909;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca un número entre 0 y 10.");
            numero = sc.nextInt();
            if (numero < 0 || numero > 10) {
                System.out.println("El número introducido no es válido.");
            }
        } while (numero < 0 || numero > 10);

        for (int i = 0; i <= 20; i++) {
            System.out.println("El número "+numero+ " x "+i+" es: "+numero*i);
        }
    }
}
