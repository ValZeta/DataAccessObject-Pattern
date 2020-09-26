
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObatDaoImpl implements ObatDao {
//list is working as a database 
Scanner scan = new Scanner(System.in);
    List<Obat> students = new ArrayList<Obat>();;
    
    @Override
    public void inputObat(){
        
        System.out.print("Masukkan Jumlah Data : ");
        int inputan = scan.nextInt();
        System.out.println("=================================");
        for (int i = 0; i < inputan; i++) {
            System.out.print("Masukkan Nama : ");
            String nama = scan.next();
            System.out.print("Masukkan Expired (Format = DD/MM/YYYY): ");
            String exp = scan.next();
            System.out.print("Masukkan Harga : ");
            String hrg = scan.next();
            Obat obat = new Obat(nama, exp, hrg, i);
            students.add(obat);
            System.out.println("=================================");
        }
        System.out.println("Berhasil Ditambah");
    }

    @Override
    public void deleteObat(Obat obat) {
        students.remove(obat.getRollNo());
        System.out.println("Berhasil Dihapus");
    }

    //retrive list of students from the database
    @Override
    public List<Obat> getAllObat() {
        return students;
    }

    @Override
    public Obat getObat(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateObat(Obat obat) {
        students.get(obat.getRollNo()).setName(obat.getName());
        System.out.println("Berhasil Diperbarui");
    }
}
