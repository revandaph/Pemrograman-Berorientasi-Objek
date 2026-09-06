package Teori02;

public class Main23 {
    public static void main(String[] args) {

        System.out.println("=== Objek dengan Konstruktor Default ===");
        Mobil23 mobilDefault = new Mobil23();
        mobilDefault.tampilkanInfo();
        mobilDefault.jalan();

        System.out.println();

        Motor23 motorDefault = new Motor23();
        motorDefault.tampilkanInfo();
        motorDefault.jalan();

        System.out.println("\n=== Objek dengan Konstruktor Berparameter ===");

        Mobil23 avanza = new Mobil23("Toyota Avanza", "Hitam", 160, 4, "Matic");
        avanza.tampilkanInfo();
        avanza.jalan();

        System.out.println();

        Motor23 nmax = new Motor23("Yamaha NMAX", "Merah", 120, true, 155);
        nmax.tampilkanInfo();
        nmax.jalan();
    }
}