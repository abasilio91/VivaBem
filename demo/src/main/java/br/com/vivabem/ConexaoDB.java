package br.com.vivabem;

import java.sql.Conenction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public Connection connect() {   
        Connection conexao = null;
        
        try {
           return Drivermanager.getConnection("jdbc:sqlite:demo/src/main/resources/cadastro.db");
        } catch (SQLException e) {
            throw new RunTimeException(e);
        }
    }
}
