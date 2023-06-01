/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class ModelTabelDataLomba extends AbstractTableModel{
    private ArrayList<ModelDataLomba> dataLomba;
    public ModelTabelDataLomba(ArrayList<ModelDataLomba> dataLomba){
        this.dataLomba = dataLomba;
    }
    
    @Override
    public int getRowCount() {
        return dataLomba.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    public String getColoumnName(int kolom){
        switch(kolom){
            case 0:
                return "Judul";
            case 1:
                return "Alur";
            case 2:
                return "Orisinalitas";
            case 3:
                return "Pemilihan_Kata";
            case 4:
                return "Nilai";
            default:
                return null;   
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dataLomba.get(rowIndex).getJudul();
            case 1:
                return dataLomba.get(rowIndex).getAlur();
            case 2:
                return dataLomba.get(rowIndex).getOrisinalitas();
            case 3:
                return dataLomba.get(rowIndex).getPemilihanKata();
            case 4:
                return dataLomba.get(rowIndex).getNilai();
            default:
                return null;   
        }
    }
    
}
