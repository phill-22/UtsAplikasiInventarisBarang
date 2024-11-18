package uts;
/**
     import database
 */
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ASUS ROG
 */
public class ConfigDatabase {
    private static Connection mysqlkoneksi;
    public static Connection koneksiDB() throws SQLException{
            if (mysqlkoneksi==null) {
                try {
                   String DB="jdbc:mysql://localhost:3306/aplikasiinventarisbarang";
                    String user="root";
                    String pass="";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkoneksi=(Connection) DriverManager.getConnection(DB,user,pass);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "koneksi gagal");
                }
                    
            } return mysqlkoneksi;
            
        }
    }
    
