package databasemat;

import java.sql.*;

public class Conexion {
    
    Connection cn;
    
    public Connection Conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root",""); // ""sistema" es el nombre de la tabla temporal
        System.out.println("Conexion exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        } return cn;
    }
    
}
