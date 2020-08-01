package test;

import java.sql.*;


public class testMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin"); //ESTABLECEMOS CONEXIÓN
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT * FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            
            //Sacamos la informacion de la BD
            while(resultado.next()){
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print("\tNombre: " + resultado.getString("nombre"));
                System.out.print("\tApellido: " + resultado.getString("apellido"));
                System.out.print("\tEmail: " + resultado.getString("email"));
                System.out.println("\tTelefono: " + resultado.getString("telefono"));
            }
            
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        
        
    }
}
