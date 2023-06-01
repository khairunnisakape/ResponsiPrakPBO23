/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
/**
 *
 * @author PC PRAKTIKUM
 */
public class ModelDataLomba {
    private String judul;
    private double alur;
    private double orisinalitas;
    private double pemilihanKata;
    private double nilai;
    List<ModelDataLomba> listLomba;

    public List<ModelDataLomba> getListlomba(){
        return listLomba;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getAlur() {
        return alur;
    }

    public void setAlur(double alur) {
        this.alur = alur;
    }

    public double getOrisinalitas() {
        return orisinalitas;
    }

    public void setOrisinalitas(double orisinalitas) {
        this.orisinalitas = orisinalitas;
    }

    public double getPemilihanKata() {
        return pemilihanKata;
    }

    public void setPemilihanKata(double pemilihanKata) {
        this.pemilihanKata = pemilihanKata;
    }

    public double getNilai() {
        nilai = (alur + orisinalitas + pemilihanKata)/3.0;
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    
}
