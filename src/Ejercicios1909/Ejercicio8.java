package Ejercicios1909;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList <String> marcas = new ArrayList <String>();
        marcas.add("BMW");
        marcas.add("Volvo");
        marcas.add("Seat");
        marcas.add("Peugeot");
        marcas.add("Citroen");
        marcas.add("Renault");
        marcas.add("Fiat");
        marcas.add("Audi");
        marcas.add("Mercedes");
        marcas.add("Volkswagen");
        marcas.add("Toyota");
        marcas.add("Honda");
        marcas.add("Mitsubishi");
        marcas.add("Tesla");
        marcas.add("Alfa Romeo");
        marcas.add("Ferrari");
        marcas.add("Porsche");
        marcas.add("Lamborghini");
        marcas.add("Rimac");
        marcas.add("Hyundai");
        marcas.add("Hummer");
        marcas.add("Jeep");
        marcas.add("Dodge");
        marcas.add("RAM");
        marcas.add("Smart");
        marcas.add("Alpine");
        marcas.add("Subaru");
        marcas.add("Mazda");
        marcas.add("Koenigsegg");
        marcas.add("Bugatti");
        marcas.add("Pagani");
        marcas.add("Aston Martin");
        marcas.add("Bentley");
        pares(marcas);


    }

    public static void pares( ArrayList <String> marcas){
        for (int i = 0; i < marcas.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("Posicion "+i+": "+marcas.get(i));
            }
        }
    }
}





















