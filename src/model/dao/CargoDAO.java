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

/**
 *
 * @author laert
 */
public class CargoDAO {
    
    public void create(Cargo c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cargo (codigo,nome,salario) VALUES(?,?,?)");
            stmt.setInt(1, c.getCodigo());
            stmt.setString(2, c.getNome());
            stmt.setDouble(3, c.getSalario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Cargo> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cargo> cargos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cargo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cargo cargo = new Cargo();
                cargo.setId(rs.getInt("id"));
                cargo.setCodigo(rs.getInt("codigo"));
                cargo.setNome(rs.getString("nome"));
                cargo.setSalario(rs.getDouble("salario"));
                
                cargos.add(cargo);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler dados do cargo:" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cargos;

    }
    
    public void update(Cargo c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cargo SET codigo = ?, nome = ?, salario = ? WHERE id = ?");
            stmt.setInt(1, c.getCodigo());
            stmt.setString(2, c.getNome());
            stmt.setDouble(3, c.getSalario());
            stmt.setInt(4, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(Cargo c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cargo WHERE id = ?");
            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
