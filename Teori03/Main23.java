package Teori03;

public class Main23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23("254107060053", "Revalinda Putri Hadinata", "Malang", 3.50);
        Mahasiswa23 mhs2 = new Mahasiswa23("254435674325", "Khadija Al-Fatima", "Surabaya", 3.85);

        System.out.println("=== DATA AWAL MAHASISWA ===");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.println("IPK    : " + mhs1.getIpk());
        System.out.println("-----------------------------------");
        System.out.println("NIM    : " + mhs2.getNim());
        System.out.println("Nama   : " + mhs2.getNama());
        System.out.println("Alamat : " + mhs2.getAlamat());
        System.out.println("IPK    : " + mhs2.getIpk());

        System.out.println("\n=== SETELAH PERUBAHAN VIA SETTER ===");
        mhs1.setNama("Khadija Al-Fatima");
        mhs1.setAlamat("Jakarta");
        mhs1.setIpk(3.75);

        System.out.println("NIM (Tetap) : " + mhs1.getNim());
        System.out.println("Nama Baru   : " + mhs1.getNama());
        System.out.println("Alamat Baru : " + mhs1.getAlamat());
        System.out.println("IPK Baru    : " + mhs1.getIpk());

        System.out.println("\n=== UJI VALIDASI IPK SALAH ===");
        mhs1.setIpk(4.50);

        //mhs1.nim = "2341720099";
        //mhs1.nama = "Nama Baru";

    }
}