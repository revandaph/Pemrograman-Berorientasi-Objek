package Jobsheet02.TugasJB2.Tugas2_JB2;

public class MobilDemo23 {
    public static void main(String[] args) {
        Mobil23 mobil1 = new Mobil23();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Hitam";
        mobil1.kecepatan = 40;

        Mobil23 mobil2 = new Mobil23();
        mobil2.merk = "Honda Civic";
        mobil2.warna = "Merah";
        mobil2.kecepatan = 60;

        System.out.println("=== KONDISI AWAL ===");
        mobil1.displayInfo();
        System.out.println();
        mobil2.displayInfo();

        mobil1.warna = "Putih";
        mobil1.tambahKecepatan(20);
        mobil2.tambahKecepatan(40);

        System.out.println("\n=== SETELAH UPDATE ===");
        mobil1.displayInfo();
        System.out.println();
        mobil2.displayInfo();
    }
}