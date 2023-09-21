package Ejercicios1909;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("El array es: "+Arrays.toString(arr));
        System.out.println("La media es: "+calcular_media_array(arr));

    }
    public static double calcular_media_array(int[] array){
        double media = 0;
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma = array[i] + suma;
        }
        System.out.println("Los números suman: "+ suma);
        media = suma / array.length;

        return media;
    }
}
