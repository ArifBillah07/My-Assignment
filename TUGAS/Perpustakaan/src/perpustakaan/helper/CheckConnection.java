/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.helper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Arif
 */
public class CheckConnection {
    public static void main(String[] args) { 
        isConnected(); 
        showBook(); 
    }
    private static boolean isConnected(){
        try{
            ConnectionHelper.getConnection();
            System.out.println("Database Connected!");
        return true;
        } catch (SQLException ex){
            Logger.getLogger(CheckConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed to connect databse");
            return false;
        }
    }
    public static void showBook(){
        try{
            Connection conn = ConnectionHelper.getConnection();
            Statement stmn = conn.createStatement();
            ResultSet rs = stmn.executeQuery("Select * from buku");
            
            while (rs.next()){
                System.out.println("ID Buku: "+rs.getString("id_buku")+", Judul Buku: "+rs.getString("judul_buku")
                        +", Pengarang: "+rs.getString("pengarang")+", Tahun terbit: "+rs.getString("tahun_terbit"));
            }
        } catch (SQLException ex){
            Logger.getLogger(CheckConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
