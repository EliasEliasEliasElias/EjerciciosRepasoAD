package Ejercicios1509;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Double> al = new ArrayList<>();
        for (int i = 0; i <= 2; i++){
            System.out.println("Introduzca el número "+ (i+1));
            al.add(sc.nextDouble());
        }
        // Utilizando Collections

        // Collections.sort(al);

        //Utilizando Comparator

        al.sort(Comparator.naturalOrder());

        System.out.println(al.toString());
    }
}
