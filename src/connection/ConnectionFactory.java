/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author laert
 */
public class ConnectionFactory {
    
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://";
    private static String DB_HOST = "";
    private static String DB_PORT = "";
    private static String DB_NAME = "";
    private static String DB_USER = "";
    private static String DB_PASS = "";
    
    private static Properties config = new Properties();
    private static String arquivo = "config/db.ini";
    
    public static Properties LoadConfig(boolean load){
        if (load) {
            try {
            config.load(new FileInputStream(arquivo));
            
            DB_HOST = config.getProperty("DB_HOST");
            DB_PORT = config.getProperty("DB_PORT");
            DB_NAME = config.getProperty("DB_NAME");
            DB_USER = config.getProperty("DB_USER");
            DB_PASS = config.getProperty("DB_PASS");
            } catch (IOException ex) {                
                JOptionPane.showMessageDialog(null, "Erro ao ler arquivo de configuração: " + ex);
            }
        }else{
            DB_HOST = "localhost";
            DB_PORT = "3306";
            DB_NAME = "paycash";
            DB_USER = "root";
            DB_PASS = "123456";
        }       
        
        return config;
    }
    
    public static Connection getConnection() {
        LoadConfig(true);
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL + DB_HOST + ":" + DB_PORT + "/" + DB_NAME, DB_USER, DB_PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar Banco de Dados: " + ex);
        }
        return null;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        }catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}