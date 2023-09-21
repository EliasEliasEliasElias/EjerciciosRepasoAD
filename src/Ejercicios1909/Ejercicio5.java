package Ejercicios1909;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 100);
        int intentos = 0;
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un número entre 0 y 100.");
            num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("Introduzca número que perteneza al intervalo de cero 0 y 100.");
            } else if (num > numero) {
                System.out.println("El número a adivinar es menor que el número introducido.");
            } else if (num < numero) {
                System.out.println("El número a adivinar es mayor que el número introducido.");

            }
            intentos++;
        } while (num!= numero);

        System.out.println("Felicidades, has acertado el número "+numero+"! Te ha tomado un total de "+intentos+" intentos.");


    }
}
