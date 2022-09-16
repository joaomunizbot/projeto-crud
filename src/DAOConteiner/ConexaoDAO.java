package DAOConteiner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public Connection conectaBD(){
            
        Connection conn = null;
        
        
        try {
            String url ="jdbc:mysql://localhost:3306/bancoteste2?user=root&password=joao2002";
            conn = DriverManager.getConnection(url);   
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO erro na conexão" + erro.getMessage());
        }
        return conn;

    }   
}
