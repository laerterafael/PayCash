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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author laert
 */
public class UsuarioDAO {
    private Connection con = null;
    public UsuarioDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Usuario usuario){
        String sql = "INSERT INTO usuario (login,senha,tipo,status) VALUES(?,?,?,?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getTipo());
            stmt.setInt(4, usuario.getStatus());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void update(Usuario usuario){
        String sql = "UPDATE usuario SET login = ?, senha = ?, tipo = ?, status = ? WHERE login = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getTipo());
            stmt.setInt(4, usuario.getStatus());
            stmt.setString(5, usuario.getLogin());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar:" +ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Usuario> read() {
        String sql = "SELECT * FROM usuario";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipo(rs.getInt("tipo"));
                usuario.setStatus(rs.getInt("status"));
                
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler dados do cargo:" +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    
    public boolean checkUser(String login) {
        String sql = "SELECT * FROM usuario WHERE login = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, login);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
    public boolean checkLogin(String login, String senha) {
        String sql = "SELECT * FROM usuario WHERE login = ? and senha = ? and status = 1";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
}
