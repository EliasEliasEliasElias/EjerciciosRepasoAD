package Ejercicios2109;

public class Ejercicio5 {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        try {
            b();
        } catch (Exception e) {
            System.out.println("Se ha lanzado una excepcion en B");
        }
    }

    private static void b() throws Exception {

        //throw new Exception("Excepcion B");

        try {
            c();

        } catch (Exception e) {
            System.out.println("Se ha lanzado una excepcion en C");
        }
        throw new Exception("Excepcion B");
    }

    private static void c() throws Exception {
        throw new Exception("Excepcion C");

    }

    // Cuando en la función B se detecta un error en la función C, se continúa el programa
    // y se lanza la excepcion B, A detecta la excepción de B, lo que significa que el programa se sigue ejecutando desde
    // A pero no se ha detenido, en cambio, si generamos un error en B antes de ir a la función C, nunca llegamos
    // a ejecutar la función C.
}
