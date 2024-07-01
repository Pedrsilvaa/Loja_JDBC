
package data;

import java.sql.*;

public class Conexao {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; // Driver JDBC
    private static final String URL = "jdbc:mysql://localhost:3307/loja_db?zeroDateTimeBehavior=CONVERT_TO_NULL"; // URL
    private static final String USER = "root"; // Usuário
    private static final String PASSWORD = "root"; // Senha do servidor
    
    // Este método cria a conexão ao banco de dados
    public static Connection Conectar() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao conectar com o banco de dados:\n", ex);
        }
        
    }
    
    // Este método desconecta a conexão ao banco de dados
    public static void Desconectar(Connection conn) {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao desconectar o banco de dados:\n", ex);
        }
        
    }

    // Este método desconecta a conexão e o PreparedStatement ao banco de dados
    public static void Desconectar(Connection conn, PreparedStatement stmt) {
        Desconectar(conn);
        try {
            if(stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao desconectar o banco de dados:\n", ex);
        }
        
    }
    
    /* 
        Este método desconecta a conexão, o PreparedStatement
        e o ResultSet ao banco de dados
    */
    public static void Desconectar(Connection conn, PreparedStatement stmt, ResultSet rs) {
        Desconectar(conn, stmt);
        try {
            if(rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao desconectar o banco de dados:\n", ex);
        }
        
    }
    
}
