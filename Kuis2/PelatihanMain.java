package Kuis2;

public class PelatihanMain {
    public static void main(String[] args) {
        Pelatihan[] daftar = {
            new PelatihanTeknis("TK-01", "Shakira", 10, 80),
            new PelatihanDesain("DS-01", "Hansen", 8, 65)
        };

        System.out.println("=== DATA PELATIHAN ===");
        for (Pelatihan p : daftar) {
            p.tampilkanDataPeserta();
            System.out.printf(java.util.Locale.forLanguageTag("id-ID"), "Biaya        : Rp%,.0f%n", p.hitungBiaya());
            System.out.println("Status       : " + p.tentukanStatus());
            System.out.println("----------------------------");
        }

        System.out.println("=== UJI INPUT TIDAK VALID ===");
        uji("Nilai -5 ", () -> new PelatihanTeknis("TK-02", "Hellen", 5, -5));
        uji("Nilai 120", () -> new PelatihanDesain("DS-02", "Haqi", 5, 120));
        uji("Durasi 0 ", () -> new PelatihanTeknis("TK-03", "Ivy", 0, 80));

        System.out.println("=== UJI OVERLOADING tentukanStatus(nilaiBaru) ===");
        PelatihanDesain d = (PelatihanDesain) daftar[1];
        System.out.println("Desain, nilai baru 75 : " + d.tentukanStatus(75));
        uji("Desain, nilai baru 120", () -> d.tentukanStatus(120));
    }

    private static void uji(String label, Runnable aksi) {
        try {
            aksi.run();
            System.out.println(label + ": DITERIMA");
        } catch (IllegalArgumentException e) {
            System.out.println(label + ": DITOLAK -> " + e.getMessage());
        }
    }
}
