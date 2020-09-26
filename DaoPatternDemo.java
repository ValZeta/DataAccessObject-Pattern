package dao;

import java.util.Scanner;

public class DaoPatternDemo {

    public static void main(String[] args) {
        ObatDao obatDao = new ObatDaoImpl();
        for (String b = "y"; b.equals("y") || b.equals("Y");) {
            System.out.println("=================================");
            System.out.println("=========Database Apotek=========");
            System.out.println("=================================");
            System.out.println("1. Masukkan Data");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Perbarui");
            System.out.println("4. Hapus");
            System.out.println("=================================");
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan Pilihan: ");
            int pil = scan.nextInt();
            switch (pil) {
                case 1:
                    obatDao.inputObat();
                    break;
                case 2:
                    try {
                        for (Obat obat : obatDao.getAllObat()) {
                            System.out.println("[No : " + (obat.getRollNo() + 1) + ", Nama Obat : " + obat.getName() + ", Expired : " + obat.getExpired() + ", Harga : " + obat.getPrice() + " ]");
                        }
                    } catch (Exception e) {
                        System.out.println("Belum ada data");
                    }
                    break;
                case 3:
                    try {
                        for (Obat obat : obatDao.getAllObat()) {
                            System.out.println("[No : " + (obat.getRollNo() + 1) + ", Nama Obat : " + obat.getName() + ", Expired : " + obat.getExpired() + ", Harga : " + obat.getPrice() + " ]");
                        }
                        System.out.print("Masukkan Nomor Data Yang Akan Diperbarui : ");
                        int data = scan.nextInt();
                        Obat obat = obatDao.getAllObat().get(data - 1);
                        System.out.print("Masukkan Nama : ");
                        obat.setName(scan.next());
                        System.out.print("Masukkan Expired (Format = DD/MM/YYYY): ");
                        obat.setExpired(scan.next());
                        System.out.print("Masukkan Harga : ");
                        obat.setPrice(scan.next());
                        obatDao.updateObat(obat);
                    } catch (Exception e) {
                        System.out.println("Belum ada data");
                    }
                    break;
                case 4:
                    try {
                        for (Obat obat2 : obatDao.getAllObat()) {
                            System.out.println("[No : " + (obat2.getRollNo() + 1) + ", Nama Obat : " + obat2.getName() + ", Expired : " + obat2.getExpired() + ", Harga : " + obat2.getPrice() + " ]");
                        }
                        System.out.print("Masukkan Nomor Data Yang Akan Dihapus : ");
                        int hapusdata = scan.nextInt();
                        Obat obat2 = obatDao.getAllObat().get(hapusdata - 1);
                        obatDao.deleteObat(obat2);
                    } catch (Exception e) {
                        System.out.println("Belum ada data");
                    }
                    break;
                default:
                    System.out.println("MENU TIDAK TERSEDIA");
                    break;
            }
            System.out.println("=================================");
            System.out.print("Mengulang? (Y/N): ");
            b = scan.next();
        }
    }
}
