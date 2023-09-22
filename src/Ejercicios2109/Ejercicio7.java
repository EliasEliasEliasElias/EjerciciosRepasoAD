package Ejercicios2109;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class Ejercicio7 {
    public static void main(String[] args) throws SQLException {
        String nombreBD = "BD1";
        String usuario =  "James";
        String pss = "contr";
        String url = "jdbc:mysql://localhost:3306/" + nombreBD + "?useUnicode=true&characterEncoding=UTF-8";
        Connection conexion = null;
        try {
            conexion = java.sql.DriverManager.getConnection(url, usuario,pss);
        } catch (SQLException e) {
            System.out.println("Error: "+e.toString());
        }
    }
}
