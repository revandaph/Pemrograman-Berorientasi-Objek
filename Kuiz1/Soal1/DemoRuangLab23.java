package Kuiz1.Soal1;

public class DemoRuangLab23 {
    public static void main(String[] args) {

        RuangLab23 ruang1 = new RuangLab23("RU01", "Lab Komputer", 30);
        RuangLab23 ruang2 = new RuangLab23("RU02", "Lab Jaringan", 25);
        RuangLab23 ruang3 = new RuangLab23("RU03", "Lab Pemrograman", 40);

        System.out.println("=== DATA AWAL ===");
        ruang1.tampilkanInfo();
        ruang2.tampilkanInfo();
        ruang3.tampilkanInfo();

        System.out.println("\n=== PENGUJIAN ===");

        ruang1.pesanRuang(20);

        ruang1.pesanRuang(10);

        ruang1.batalkanPemesanan();

        ruang2.pesanRuang(0);

        ruang2.pesanRuang(30);

        ruang3.batalkanPemesanan();

        System.out.println("\n=== DATA AKHIR ===");
        ruang1.tampilkanInfo();
        ruang2.tampilkanInfo();
        ruang3.tampilkanInfo();
    }
}