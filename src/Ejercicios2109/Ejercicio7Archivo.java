package Ejercicios2109;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio7Archivo {
    public static void main(String[] args) throws FileNotFoundException {

        String ruta = "C:\\Users\\EliasKendilM\\Downloads\\mysql-connector-j-8.1.0\\JOse.txt";
        // Esta ruta si existe
        RandomAccessFile raf = new RandomAccessFile(ruta,"r");
        // Esta ruta NO existe


        try{
            System.out.println("El contenido del archivo es:");
            System.out.println(raf.readLine());

        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("\n ----------------------------\n");

        try{
            ruta = "C:\\Users\\EliasKendilM\\Downloads\\mysql-connector-j-8.1.0\\miguel.txt";
            RandomAccessFile raf2 = new RandomAccessFile(ruta,"r");
            System.out.println(raf2.readLine());
        } catch (IOException e){
            System.out.println("Error: "+e.toString());
        }
    }


}
