package Jobsheet02.Percobaan1;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Mahasiswa23 m1 = new Mahasiswa23();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        System.out.println("--------------------");

        Mahasiswa23 m2 = new Mahasiswa23();
        m2.nim = "023433";
        m2.nama = "Budi Santoso";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2A";
        m2.displayBiodata();

        System.out.println("--------------------");

        Mahasiswa23 m3 = new Mahasiswa23();
        m3.nim = "023434";
        m3.nama = "Siti Aminah";
        m3.alamat = "Surabaya, Jawa Timur";
        m3.kelas = "2B";
        m3.displayBiodata();
    }
}