package Ejercicios2109;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [][] matriz = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != 1){
                    matriz[i][j] =i+j;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            if (i == 0){
                System.out.println("Columna 1");
            } else {
                System.out.println("Columna 2");
            }
            for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println(matriz[i][j]);
            }
        }
        // Al poner matriz[2][3] aparece el error indexOutOfBounds porque no existe la fila 2,
        // las filas empiezan en 0, al haber 2, las columnas son 0 y 1, se aplica la misma
        // regla para la columna 3.

    }
}
