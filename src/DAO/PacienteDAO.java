/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PacienteDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Antoniel
 */
public class PacienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PacienteDTO> lista = new ArrayList<>();

    public void InserirPaciente(PacienteDTO paDTO) {
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "insert into tbpacientes (nome_pac,idade_pac,endereco_pac) values (?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, paDTO.getNome_pa());
            pstm.setString(2, paDTO.getIdade_pa());
            pstm.setString(3, paDTO.getEndereco_pa());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + e);

        }

    }

    public ArrayList<PacienteDTO> pesquisarPaciente() {
        String sql = "select * from tbpacientes";

        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                PacienteDTO paDTO = new PacienteDTO();

                paDTO.setCodigo_pa(rs.getInt("cod_pac"));
                paDTO.setIdade_pa(rs.getString("idade_pac"));
                paDTO.setNome_pa(rs.getString("nome_pac"));
                paDTO.setEndereco_pa(rs.getString("endereco_pac"));

                lista.add(paDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar:" + e);
        }
        return lista;
    }

    public void alterarPaciente(PacienteDTO paDTO) {
        String sql
                = "update funcionario set nome =  ?,cargo =  ?,salario =  ? where  idfuncionario =  ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, paDTO.getNome_pa());
            pstm.setString(2, paDTO.getIdade_pa());
            pstm.setString(3, paDTO.getEndereco_pa());
            pstm.setInt(4, paDTO.getCodigo_pa());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PacienteDAO Alterar:" + e);
        }
    }

    public void excluirFuncionario(PacienteDTO paDTO) {
        String sql = "delete from tbpacientes where cod_pac=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, paDTO.getCodigo_pa());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Excluir:" + e);
 }
 }
}
