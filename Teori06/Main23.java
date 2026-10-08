package Teori06;

public class Main23 {
    public static void main(String[] args) {
        Mobil23 mobil1 = new Mobil23("Toyota", "Hitam", 180, 4);
        Motor23 motor1 = new Motor23("Honda", "Merah", 120, "Naked");

        System.out.println("=== INFO MOBIL ===");
        mobil1.tampilkanInfo();

        System.out.println("\n=== INFO MOTOR ===");
        motor1.tampilkanInfo();
    }
}