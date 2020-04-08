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
import model.Funcionario;
import model.Pagamento;

/**
 *
 * @author laert
 */
public class PagamentoDAO {
    private Connection con = null;
    
    public PagamentoDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Pagamento p){
        String sql = "INSERT INTO pagamento (valor,data,status,funcionario_id) VALUES(?,?,?,?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, p.getValor());
            stmt.setDate(2, p.getData());
            stmt.setInt(3, p.getStatus());
            stmt.setInt(4, p.getFuncionario().getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Pagamento> read() {
        String sql = "SELECT p.id AS id, valor, data, status, p.funcionario_id AS funcionario_id, f.id AS fid, f.codigo AS fcodigo, f.nome AS fnome, f.sexo AS sexo, f.cpf AS cpf, f.rg AS rg, f.data_nasc AS data_nasc, f.telefone AS telefone, f.salario AS salario \n" +
" from pagamento p INNER JOIN funcionario f ON f.id = p.funcionario_id";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pagamento> pagamentos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Pagamento pagamento = new Pagamento();
                pagamento.setId(rs.getInt("id"));
                pagamento.setValor(rs.getDouble("valor"));
                pagamento.setData(rs.getDate("data"));
                pagamento.setStatus(rs.getInt("status"));
                
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
                
                pagamento.setFuncionario(funcionario);
                
                pagamentos.add(pagamento);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler dados do cargo:" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return pagamentos;

    }
    
    public void update(Pagamento p){
        String sql = "UPDATE pagamento SET valor = ?, data = ?, status = ?, funcionario_id = ? WHERE id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, p.getValor());
            stmt.setDate(2, p.getData());
            stmt.setInt(3, p.getStatus());
            stmt.setInt(4, p.getFuncionario().getId());
            stmt.setInt(5, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(Pagamento p){
        String sql = "DELETE FROM pagamento WHERE id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
