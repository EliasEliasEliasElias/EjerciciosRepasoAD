package Ejercicios2109;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("La division de de un número entre 0 lanza la excepción ArithmeticException");
        try {
            int exc = 4 / 0;

        }catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
