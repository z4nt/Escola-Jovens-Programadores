package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection conn;
    public ResultSet autenticacaoUsuario(UsuarioDTO objetoUsuarioDTO){
       conn=new ConexaoDAO().conectaBD();
        try {
           String sql="select * from usuario where nome_usuario=? and senha_usuario=?";     
           PreparedStatement pstm=conn.prepareStatement(sql);
           pstm.setString(1, objetoUsuarioDTO.getNome_usuario());
           pstm.setString(2, objetoUsuarioDTO.getSenha_usuario());
           ResultSet rs=pstm.executeQuery();
           return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + e);
            return null;
      }
        
    
     }
     public void InserirUsuario(UsuarioDTO objetoUsuarioDTO){
      conn=new ConexaoDAO().conectaBD();
       try {
           String sql="insert into usuario (nome_usuario,senha_usuario) values (?,?)";     
           PreparedStatement pstm=conn.prepareStatement(sql);
           pstm.setString(1, objetoUsuarioDTO.getNome_usuario());
           pstm.setString(2, objetoUsuarioDTO.getSenha_usuario());
           pstm.execute();
           pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + e);
            
      }
        
    }
}