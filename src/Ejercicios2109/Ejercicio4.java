package Ejercicios2109;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        System.out.println("Ingrese un número del 0 al 10: ");

        do {
            nota = scanner.nextInt();


            switch (nota) {
                case 0: case 1: case 2: case 3: case 4:
                    throw new Exception("Insuficiente.");
                case 5:
                    System.out.println("Suficiente.");
                    break;
                case 6:
                    System.out.println("Bien.");
                    break;
                case 7: case 8:
                    System.out.println("Notable.");
                    break;
                case 9: case 10:
                    System.out.println("Sobresaliente.");
                    break;
                default:
                    System.out.println("Por favor, ingrese un número entre 0 y 10:");
                    break;

            }
        } while (nota <= 0 || nota >= 10);

    }
}
