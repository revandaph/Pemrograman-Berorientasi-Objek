package Jobsheet07.Tugas;

public class KendaraanMain {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        Mobil mobil2 = new Mobil("Toyota Avanza", "N 1234 ABC", 4);

        System.out.println("=== Informasi Mobil 1 (Default Constructor) ===");
        mobil1.tampilkanInformasi();

        System.out.println();

        System.out.println("=== Informasi Mobil 2 (Parameterized Constructor) ===");
        mobil2.tampilkanInformasi();
    }
}