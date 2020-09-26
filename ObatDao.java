
package dao;

import java.util.List;
public interface ObatDao {
    public List<Obat> getAllObat(); 
    public Obat getObat(int rollNo); 
    public void updateObat(Obat obat); 
    public void deleteObat(Obat obat);
    public void inputObat();
}
