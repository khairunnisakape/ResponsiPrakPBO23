/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterfaceLomba;
import java.util.List;
import model.ModelDataLomba;
/**
 *
 * @author PC PRAKTIKUM
 */
public interface DAOIntfLomba {
    public void tambah(ModelDataLomba lomba);
    public void update(ModelDataLomba lomba);
    public void hapus(String judul);
    public List<ModelDataLomba> tampilAll();
}
