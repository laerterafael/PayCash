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
    private Connection con = null;
    
    public FuncionarioDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Funcionario f){
        String sql = "INSERT INTO funcionario (codigo,nome,sexo,cpf,rg,data_nasc,telefone,salario,cargo_id) VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, f.getCodigo());
            stmt.setString(2, f.getNome());
            stmt.setString(3, f.getSexo());
            stmt.setString(4, f.getCpf());
            stmt.setString(5, f.getRg());
            stmt.setString(6, f.getData_nascimento());
            stmt.setString(7, f.getTelefone());
            stmt.setDouble(8, f.getSalario());
            stmt.setInt(9, f.getCargo().getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Funcionario> read() {
        String sql = "SELECT f.id AS fid, f.codigo AS fcodigo, f.nome AS fnome, sexo, cpf, rg, data_nasc, telefone, salario, cargo_id, c.id AS cid, c.codigo AS ccodigo, c.nome AS cnome from funcionario f INNER JOIN cargo c ON c.id = f.cargo_id";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("fid"));
                funcionario.setCodigo(rs.getInt("fcodigo"));
                funcionario.setNome(rs.getString("fnome"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setData_nascimento(rs.getString("data_nasc"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setSalario(rs.getDouble("salario"));
                
                Cargo cargo = new Cargo();
                cargo.setId(rs.getInt("cid"));
                cargo.setCodigo(rs.getInt("ccodigo"));
                cargo.setNome(rs.getString("cnome"));
                
                funcionario.setCargo(cargo);
                
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
        String sql = "UPDATE funcionario SET codigo =?, nome = ?, sexo = ?, cpf = ?, rg = ?, data_nasc = ?, telefone = ?, salario = ?, cargo_id = ? WHERE id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, f.getCodigo());
            stmt.setString(2, f.getNome());
            stmt.setString(3, f.getSexo());
            stmt.setString(4, f.getCpf());
            stmt.setString(5, f.getRg());
            stmt.setString(6, f.getData_nascimento());
            stmt.setString(7, f.getTelefone());
            stmt.setDouble(8, f.getSalario());
            stmt.setInt(9, f.getCargo().getId());
            stmt.setInt(10, f.getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(Funcionario f){
        
        String sql = "DELETE FROM funcionario WHERE id = ?";
        PreparedStatement stmt = null;
                
        try {
            stmt = con.prepareStatement(sql);
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
