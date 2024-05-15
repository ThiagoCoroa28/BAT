package ModelDAO;

import Model.Estoque;
import CRUD_BAT_NETBEANS.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EstoqueDAO {

   public void inserirProduto(Estoque estoque) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            
            String sql = "INSERT INTO estoque (Txtnome, TxtQnt, TxtLote) VALUES (?, ?, ?)";
            
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, estoque.getnome());
            ps.setInt(2, estoque.getQuantidade());
            ps.setString(3, estoque.getLote());

            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
   
   public void atualizarProduto(Estoque estoque) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            
            String sql = " UPDATE tabela SET coluna = (?,?,?) WHERE id = ?";

            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, estoque.getnome());
            ps.setInt(2, estoque.getQuantidade());
            ps.setString(3, estoque.getLote());
            

            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
   
   public void excluirProduto(Estoque estoque) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            
           String sql = "DELETE FROM estoque WHERE Txtnome = ?";
            
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, estoque.getnome());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Sucesso",1);
            
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}