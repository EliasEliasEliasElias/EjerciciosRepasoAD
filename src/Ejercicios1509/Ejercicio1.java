package Ejercicios1509;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int edad;

        System.out.println("Introduzca el nombre de usuario.");
        nombre = sc.nextLine();
        System.out.println("Introduzca la edad del usuario.");
        edad = sc.nextInt();
        System.out.print("Buenos días, "+ nombre +", tienes "+ edad + " años.");
    }
}
