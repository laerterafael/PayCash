/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cargo;
import model.Funcionario;

/**
 *
 * @author laert
 */
public class FuncionarioDAO {
    public void create(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (codigo,nome,sexo,cpf,rg,data_nasc,telefone,funcao) VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, f.getCodigo());
            stmt.setString(2, f.getNome());
            stmt.setString(3, f.getSexo());
            stmt.setString(4, f.getCpf());
            stmt.setString(5, f.getRg());
            stmt.setString(6, f.getData_nascimento());
            stmt.setString(7, f.getTelefone());
            stmt.setInt(8, f.getFuncao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Funcionario> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setCodigo(rs.getInt("codigo"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setData_nascimento(rs.getString("data_nasc"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setFuncao(rs.getInt("funcao"));
                
                funcionarios.add(funcionario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler dados do cargo:" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return funcionarios;

    }
    
    public void update(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE funcionario SET codigo =?, nome = ?, sexo = ?, cpf = ?, rg = ?, data_nasc = ?, telefone = ?, funcao = ? WHERE id = ?");
            stmt.setInt(1, f.getCodigo());
            stmt.setString(2, f.getNome());
            stmt.setString(3, f.getSexo());
            stmt.setString(4, f.getCpf());
            stmt.setString(5, f.getRg());
            stmt.setString(6, f.getData_nascimento());
            stmt.setString(7, f.getTelefone());
            stmt.setInt(8, f.getFuncao());
            stmt.setInt(9, f.getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE id = ?");
            stmt.setInt(1, f.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
