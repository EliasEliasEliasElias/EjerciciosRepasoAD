package Ejercicios1509;

import javax.swing.*;


public class Ejercicio3 {


    public static void main(String[] args) {
        boolean correcto = true;
        String ltr = "";
        while (correcto){
            ltr = JOptionPane.showInputDialog("Introduce una letra.");

            if (ltr.length() != 1){
                JOptionPane.showMessageDialog( null,"Introduzca un solo carácter.");

            } else {
                correcto= false;

                char letra = ltr.charAt(0);
                if (Character.isLowerCase(letra)){
                    JOptionPane.showMessageDialog( null,"La letra \""+letra+ "\" está en minúscula.");

                } else if (Character.isDigit(letra)) {
                    JOptionPane.showMessageDialog( null,"Has introducido un número, por favor, introduzca una sola letra.");
                } else {

                    JOptionPane.showMessageDialog( null,"La letra \""+letra+ "\" está en mayúscula.");
                }
            }
        }


    }
}
