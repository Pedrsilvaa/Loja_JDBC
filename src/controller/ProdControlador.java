
package controller;

import data.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

public class ProdControlador {
    JOptionPane JP = new JOptionPane();
    
    public void InserirProduto(Produto PD) {
        Connection conn = Conexao.Conectar();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO Produtos_TB (Nome, Marca, Valor, Estoque) VALUES (?, ?, ?, ?)");
            stmt.setString(1, PD.getNome());
            stmt.setString(2, PD.getMarca());
            stmt.setDouble(3, PD.getValor());
            stmt.setInt(4, PD.getEstoque());
            
            stmt.executeUpdate();
            JP.showMessageDialog(null, "Produto cadastrado com sucesso.", "Gestor de Produtos", JP.INFORMATION_MESSAGE);
            
        } catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro no cadastro do produto.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        } finally {
            Conexao.Desconectar(conn, stmt);
        }
    }
    
    public List<Produto> ListarProdutos() {
        Connection conn = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> ListPD = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM Produtos_TB");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto PD = new Produto();
                PD.setID(rs.getInt("ID"));
                PD.setNome(rs.getString("Nome"));
                PD.setMarca(rs.getString("Marca"));
                PD.setValor(rs.getDouble("Valor"));
                PD.setEstoque(rs.getInt("Estoque"));
                
                ListPD.add(PD);
            }
            
        } catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao buscar os produtos no banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        } finally {
            Conexao.Desconectar(conn, stmt, rs);
        }
        
        return ListPD;
    }
    
    public void AtualizarProduto(Produto PD) {
        Connection conn = Conexao.Conectar();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UPDATE Produtos_TB SET Nome = ?, Marca = ?, Valor = ?, Estoque = ? WHERE ID = ?");
            stmt.setString(1, PD.getNome());
            stmt.setString(2, PD.getMarca());
            stmt.setDouble(3, PD.getValor());
            stmt.setInt(4, PD.getEstoque());
            stmt.setInt(5, PD.getID());
            
            stmt.executeUpdate();
            JP.showMessageDialog(null, "Produto atualizado com sucesso.", "Gestor de Produtos", JP.INFORMATION_MESSAGE);
        } catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao atualizar o produto no banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        } finally {
            Conexao.Desconectar(conn, stmt);
        }
    }
    
    public void ExcluirProduto(int id) {
        Connection conn = Conexao.Conectar();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM Produtos_TB WHERE ID = ?");
            stmt.setInt(1, id);
            
            stmt.executeUpdate();
            JP.showMessageDialog(null, "Produto deletado com sucesso.", "Gestor de Produtos", JP.INFORMATION_MESSAGE);
        } catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao atualizar o produto no banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        } finally {
            Conexao.Desconectar(conn, stmt);
        }
    }
    
    public List<Produto> PesquisarProdutos(String pesq) {
        Connection conn = Conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> ListPD = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM Produtos_TB WHERE Nome = ? OR Marca = ?");
            stmt.setString(1, pesq);
            stmt.setString(2, pesq);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto PD = new Produto();
                PD.setID(rs.getInt("ID"));
                PD.setNome(rs.getString("Nome"));
                PD.setMarca(rs.getString("Marca"));
                PD.setValor(rs.getDouble("Valor"));
                PD.setEstoque(rs.getInt("Estoque"));
                
                ListPD.add(PD);
            }
            
        } catch(SQLException ex) {
            JP.showMessageDialog(null, "Erro ao buscar produtos do banco de dados.\nTente novamente", "Gestor de Produtos", JP.ERROR_MESSAGE);
        } finally {
            Conexao.Desconectar(conn, stmt, rs);
        }
        
        return ListPD;
    }
    
}
