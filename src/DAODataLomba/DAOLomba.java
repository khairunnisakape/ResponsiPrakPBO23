/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAODataLomba;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import koneksi.Koneksi;
import model.ModelDataLomba;
/**
 *
 * @author PC PRAKTIKUM
 */
public class DAOLomba implements DAOInterfaceLomba.DAOIntfLomba{
    Connection konekk = Koneksi.koneksi();
    
    @Override
    public void tambah(ModelDataLomba lomba) {
        String sql = "INSERT INTO lomba (judul, alur, orisinalitas, pemilihanKata, nilai) VALUES (?,?,?,?,?);";
        
        try{
            PreparedStatement ps = konekk.prepareStatement(sql);
            ps.setString(1, lomba.getJudul());
            ps.setDouble(2, lomba.getAlur());
            ps.setDouble(3, lomba.getOrisinalitas());
            ps.setDouble(4, lomba.getPemilihanKata());
            ps.setDouble(5, lomba.getNilai());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }

    @Override
    public void update(ModelDataLomba lomba) {
        String sql = "UPDATE lomba SET alur=?, orisinalitas=?, pemilihanKata=?, nilai=? WHERE judul=?";
        
        try{
            PreparedStatement ps = konekk.prepareStatement(sql);
            ps.setString(1, lomba.getJudul());
            ps.setDouble(2, lomba.getAlur());
            ps.setDouble(3, lomba.getOrisinalitas());
            ps.setDouble(4, lomba.getPemilihanKata());
            ps.setDouble(5, lomba.getNilai());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }

    @Override
    public void hapus(String judul) {
        String sql = "DELETE FORM lomba WHERE judul=?";
        
        try{
            PreparedStatement ps = konekk.prepareStatement(sql);
            ps.setString(1, judul);
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }

    @Override
    public List<ModelDataLomba> tampilAll() {
        List<ModelDataLomba> lombalomba = new ArrayList();
        String sql = "SELECT * FROM lomba";
        
        try{
            PreparedStatement ps = konekk.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                ModelDataLomba lomba = new ModelDataLomba();
                lomba.setJudul(rs.getString("judul"));
                lomba.setAlur(rs.getDouble("alur"));
                lomba.setOrisinalitas(rs.getDouble("orisinalitas"));
                lomba.setPemilihanKata(rs.getDouble("pemilihanKata"));
                lomba.setNilai(rs.getDouble("nilai"));
                lombalomba.add(lomba);
            }
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
        return lombalomba;
    }
    
}
