/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAODataLomba.DAOLomba;
import model.*;
import view.TampilFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
/**
 *
 * @author PC PRAKTIKUM
 */
public class DataLombaController {
    private final TampilFrame tampil;
    private final DAOLomba dao;

    public DataLombaController(TampilFrame tampil, DAOLomba dao) {
        this.tampil = tampil;
        this.dao = dao;
    }
    
    public void tambah(){
        if (tampil.getjTJudul().getText().trim().isEmpty() ||
            tampil.getjTAlur().getText().trim().isEmpty() ||
            tampil.getjTOri().getText().trim().isEmpty() ||
            tampil.getjTDiksi().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(tampil, "Data tidak boleh kosong");
        }else {
            ModelDataLomba lomba = new ModelDataLomba();
            
            lomba.setJudul(tampil.getjTJudul().getText());
            lomba.setAlur(Double.parseDouble(tampil.getjTAlur().getText()));
            lomba.setOrisinalitas(Double.parseDouble(tampil.getjTOri().getText()));
            lomba.setPemilihanKata(Double.parseDouble(tampil.getjTDiksi().getText()));
            
            dao.tambah(lomba);
            JOptionPane.showMessageDialog(tampil, "Data Lomba Berhasil Ditambah!");
        }
    }
    
    public void update(){
         if (tampil.getjTJudul().getText().trim().isEmpty() ||
            tampil.getjTAlur().getText().trim().isEmpty() ||
            tampil.getjTOri().getText().trim().isEmpty() ||
            tampil.getjTDiksi().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(tampil, "Data tidak boleh kosong");
        }else {
            ModelDataLomba lomba = new ModelDataLomba();
            
            lomba.setJudul(tampil.getjTJudul().getText());
            lomba.setAlur(Double.parseDouble(tampil.getjTAlur().getText()));
            lomba.setOrisinalitas(Double.parseDouble(tampil.getjTOri().getText()));
            lomba.setPemilihanKata(Double.parseDouble(tampil.getjTDiksi().getText()));
            
            dao.update(lomba);
            JOptionPane.showMessageDialog(tampil, "Data Lomba Berhasil Di-update!");
        }
    }
    
    public void hapus(){
        String judul = tampil.getjTJudul().getText();
        dao.hapus(judul);
        JOptionPane.showMessageDialog(tampil, "Data Lomba Berhasil Dihapus!");
    }
    
    public void clear(){
        tampil.getjTJudul().setText("");
        tampil.getjTAlur().setText("");
        tampil.getjTOri().setText("");
        tampil.getjTDiksi().setText("");
    }
    
    public void isiTabelDataLomba(){
        List<ModelDataLomba> dataLomba = dao.tampilAll();
        ModelTabelDataLomba model = new ModelTabelDataLomba((ArrayList<ModelDataLomba>) dataLomba);
        
        tampil.getjTable1().setModel(model);
    }
}
