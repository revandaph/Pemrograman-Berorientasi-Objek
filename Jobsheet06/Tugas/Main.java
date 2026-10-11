package Jobsheet06.Tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Objek 1 (Constructor Tanpa Parameter) ===");
        Mobil mobil1 = new Mobil();
        System.out.println(mobil1.getInfo());

        System.out.println("=== Objek 2 (Constructor Berparameter) ===");
        Mobil mobil2 = new Mobil("Toyota Alphard", 2023, 1350000000.0, 5);
        System.out.println(mobil2.getInfo());
    }
}