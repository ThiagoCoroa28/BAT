package ModelDAO;

import CRUD_BAT_NETBEANS.Conexao;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public void adicionar(Usuario obj) throws Exception {

        String sql = "INSERT INTO telacadastrousuario(txtSenha1, txtEmail, txtMat, txtNome) VALUES(?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, obj.getSenha());
            pstm.setString(2, obj.getEmail());
            pstm.setString(3, obj.getMatricula()); // Alterado para setar mat na posição 1
            pstm.setString(4, obj.getNome());
            
            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados " + e.toString());
        } finally {
            try {
                if (pstm != null) {
                    JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!!!");
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao salvar dados " + e.getMessage().toLowerCase());
            }
        }

    }

public boolean validateUser(Usuario usuario) throws SQLException, ClassNotFoundException {
    
        System.out.println("Chegou no DAO: " + usuario.toUser());

        String sql = "SELECT * FROM telacadastrousuario WHERE txtEmail = ? AND txtSenha1 = ?"; 
       
         
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getEmail());
            pstm.setString(2, usuario.getSenha());

            rs = pstm.executeQuery();

            return rs.next();

        } catch (SQLException ex) {

            System.err.println("Usuário nao encontrado: " + ex.getMessage());
        } finally {
              pstm.close();
              conn.close();
              rs.close();
        }
        return (Boolean) null;
    }
}
       