
package controller;

import data.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

public class ProdControlador {
    JOptionPane JP = new JOptionPane();
    
    /*
        Este método insere o produto registrado pelo usuário
        no JFrame Index
    */
    public void InserirProduto(Produto PD) {
        Connection conn = Conexao.Conectar(); // Variável que recebe conexão com o banco de dados
        PreparedStatement stmt = null; // Variável que receberá o comando
        
        try {
            stmt = conn.prepareStatement("INSERT INTO Produtos_TB (Nome, Marca, Valor, Estoque) VALUES (?, ?, ?, ?)");
            stmt.setString(1, PD.getNome());
            stmt.setString(2, PD.getMarca());
            stmt.setFloat(3, PD.getValor());
            stmt.setShort(4, PD.getEstoque());
            stmt.executeUpdate();
            JP.showMessageDialog(null, "Produto cadastrado com sucesso.", "Gestor de Produtos", JP.INFORMATION_MESSAGE);
        }
        catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro no cadastro do produto.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
        finally {
            Conexao.Desconectar(conn, stmt);
        }
    }
    
    /*
        Este método busca os dados guardados no banco e os
        inserem dentro de uma ArrayList, retornando-a para
        qual método chamou
    */
    public List<Produto> ListarProdutos() {
        Connection conn = Conexao.Conectar(); // Variável que recebe conexão com o banco de dados
        PreparedStatement stmt = null; // Variável que receberá o comando
        ResultSet rs = null; // Variável que guardará os dados lidos de stmt
        List<Produto> ListPD = new ArrayList<>(); // Arraylist que receberá os dados de rs
        
        try { // Coletando os dados do banco
            stmt = conn.prepareStatement("SELECT * FROM Produtos_TB");
            rs = stmt.executeQuery();
    
            while(rs.next()) { // Inserindo os dados coletados na ArrayList
                Produto PD = new Produto();
                PD.setID(rs.getShort("ID"));
                PD.setNome(rs.getString("Nome"));
                PD.setMarca(rs.getString("Marca"));
                PD.setValor(rs.getFloat("Valor"));
                PD.setEstoque(rs.getShort("Estoque"));
                ListPD.add(PD);
            }
        }
        catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao buscar os produtos no banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
        finally {
            Conexao.Desconectar(conn, stmt, rs);
        }
        
        return ListPD;
    }
    
    /*
        Este método atualiza as informações do produto com
        os dados editados no Index (O produto é encontrado
        com o ID do mesmo)
    */
    public void AtualizarProduto(Produto PD) {
        Connection conn = Conexao.Conectar(); // Variável que recebe conexão com o banco de dados
        PreparedStatement stmt = null; // Variável que receberá o comando
        
        try {
            stmt = conn.prepareStatement("UPDATE Produtos_TB SET Nome = ?, Marca = ?, Valor = ?, Estoque = ? WHERE ID = ?");
            stmt.setString(1, PD.getNome());
            stmt.setString(2, PD.getMarca());
            stmt.setFloat(3, PD.getValor());
            stmt.setShort(4, PD.getEstoque());
            stmt.setShort(5, PD.getID());
            stmt.executeUpdate();
            JP.showMessageDialog(null, "Produto atualizado com sucesso.", "Gestor de Produtos", JP.INFORMATION_MESSAGE);
        }
        catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao atualizar o produto no banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
        finally {
            Conexao.Desconectar(conn, stmt);
        }
    }
    
    /*
        Este método deleta o produto no banco de dados
        (O produto é encontrado com o ID do mesmo)
    */
    public void ExcluirProduto(short id) {
        Connection conn = Conexao.Conectar(); // Variável que recebe conexão com o banco de dados
        PreparedStatement stmt = null; // Variável que receberá o comando
        
        try {
            stmt = conn.prepareStatement("DELETE FROM Produtos_TB WHERE ID = ?");
            stmt.setShort(1, id);
            stmt.executeUpdate();
            JP.showMessageDialog(null, "Produto deletado com sucesso.", "Gestor de Produtos", JP.INFORMATION_MESSAGE);
        }
        catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao atualizar o produto no banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
        finally {
            Conexao.Desconectar(conn, stmt);
        }
    }
    
    /*
        Este método busca os dados guardados no banco e os
        inserem dentro de uma ArrayList, retornando-a para
        qual método chamou, porém, esses dados são apenas
        aqueles que o usuário especificou na pesquisa no
        Index (Pesquisa pelo nome ou marca)
    */
    public List<Produto> PesquisarProdutos(String pesq) {
        Connection conn = Conexao.Conectar(); // Variável que recebe conexão com o banco de dados
        PreparedStatement stmt = null; // Variável que receberá o comando
        ResultSet rs = null; // Variável que guardará os dados lidos de stmt
        List<Produto> ListPD = new ArrayList<>(); // Arraylist que receberá os dados de rs
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM Produtos_TB WHERE Nome LIKE ? OR Marca LIKE ?");
            stmt.setString(1, "%" + pesq + "%");
            stmt.setString(2, "%" + pesq + "%");
            rs = stmt.executeQuery();

            while(rs.next()) {
                Produto PD = new Produto();
                PD.setID(rs.getShort("ID"));
                PD.setNome(rs.getString("Nome"));
                PD.setMarca(rs.getString("Marca"));
                PD.setValor(rs.getFloat("Valor"));
                PD.setEstoque(rs.getShort("Estoque"));
                ListPD.add(PD);
            }
        }
        catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao buscar produtos do banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
        finally {
            Conexao.Desconectar(conn, stmt, rs);
        }

        return ListPD;
    }
}
