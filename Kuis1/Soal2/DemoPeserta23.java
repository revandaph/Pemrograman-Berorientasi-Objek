package Kuiz1.Soal2;

public class DemoPeserta23 {
    public static void main(String[] args) {

        Peserta23 p1 = new Peserta23(
                "P001",
                "Reva",
                80,
                75,
                85
        );

        Peserta23 p2 = new Peserta23(
                "P002",
                "Linda",
                65,
                60,
                60
        );

        Peserta23 p3 = new Peserta23(
                "P003",
                "Putri",
                50,
                90,
                90
        );

        System.out.println("=== PESERTA 1 ===");
        p1.tampilkanInfo();

        System.out.println("\n=== PESERTA 2 ===");
        p2.tampilkanInfo();

        System.out.println("\n=== PESERTA 3 ===");
        p3.tampilkanInfo();

        System.out.println("\n=== PENGUJIAN NILAI TIDAK VALID ===");

        p1.setPraktik(120);

        System.out.println("Nilai praktik setelah pengujian: "
                + p1.getPraktik());
    }
}