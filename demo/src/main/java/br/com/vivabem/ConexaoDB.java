package br.com.vivabem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    private static final String url="jdbc:sqlite:demo/src/main/resources/cadastro.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }
}
