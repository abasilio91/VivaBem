package vivabem.demo.src.main.java.br.com.vivabem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void connect() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite://vivabem/demo/src/main/resources/cadastro.db");
    
            System.out.println("Conexão estabelecida!");
    
            connection.close();
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        connect();
}