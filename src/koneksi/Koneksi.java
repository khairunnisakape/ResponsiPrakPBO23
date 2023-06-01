/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.MysqlDataSource;
/**
 *
 * @author  Khairunnisa Karima Prayogi 123210113
 */
public class Koneksi {
    static Connection konek;
    
    public static Connection koneksi(){
        if(konek==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("lomba");
            data.setUser("root");
            data.setPassword("");
            
            try{
                konek = data.getConnection();
                System.out.println("Koneksi Berhasil");
            }catch(SQLException ex){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return konek;
    }
}
    