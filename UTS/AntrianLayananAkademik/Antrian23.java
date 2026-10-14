package UTS.AntrianLayananAkademik;

import java.util.ArrayList;
 
public class Antrian23 {
    private ArrayList<Mahasiswa23> daftar = new ArrayList<>();
    private int nomorBerikut = 1;
    private int indeksPanggil = 0; 
 
    public void ambilNomor(String nama) {
        if (nama == null || nama.equals("")) {
            System.out.println("Ditolak: nama tidak boleh kosong.");
            return;
        }
        Mahasiswa23 m = new Mahasiswa23(nomorBerikut++, nama);
        daftar.add(m);
        System.out.println("Ambil antrian -> No. " + m.getNomor() + " : " + m.getNama());
    }
 
    public void panggil() {
        if (indeksPanggil >= daftar.size()) {
            System.out.println("Tidak ada antrian untuk dipanggil.");
            return;
        }
        Mahasiswa23 m = daftar.get(indeksPanggil++);
        System.out.println("Dipanggil     -> No. " + m.getNomor() + " : " + m.getNama());
    }
 
    public void tampilSisa() {
        int sisa = daftar.size() - indeksPanggil;
        System.out.println("Sisa antrian: " + sisa);
        for (int i = indeksPanggil; i < daftar.size(); i++) {
            Mahasiswa23 m = daftar.get(i);
            System.out.println("  No. " + m.getNomor() + " : " + m.getNama());
        }
    }
}