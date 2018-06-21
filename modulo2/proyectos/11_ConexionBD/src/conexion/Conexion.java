package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {        
        try {
            // Incluyendo la libreria al proyecto
            System.out.println("Conectando...");
            Class.forName("com.mysql.jdbc.Driver");

            // Realizando la conexión a la base de datos
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prueba", "root", "");
            System.out.println("Conexión exitosa");

            // Preparando una consulta
            Statement sta = con.createStatement();
            
            // Creando un nuevo registro en la BD
            int resultado = sta.executeUpdate("INSERT INTO usuario (id, usuario, clave) VALUES (2, 'pedro', '123456789')");
            System.out.println("Resultado: " + resultado);             
            
            // Consulta a la base de datos
            ResultSet rs = sta.executeQuery("SELECT * FROM usuario");

            // Recorriendo el resultado
            while(rs.next()) {
                // Imprimiento cada registro
                System.out.println(
                    rs.getInt("id") + " - " + 
                    rs.getString("usuario") + " - " + 
                    rs.getString("clave")
                );
            }            
        } catch (ClassNotFoundException ce) {
            System.out.println(ce.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
