package UTS.PaketInternetMahasiswa;

public class DemoPaket23 {
    public static void main(String[] args) {
        PelangganKuota23 plgn01 = new PelangganKuota23("P01", "Reva", 5000);
        PelangganKuota23 plgn02 = new PelangganKuota23("P02", "Linda", 800);
        PelangganKuota23 plgn03 = new PelangganKuota23("P03", "Putri", 300);

        System.out.println("=== Data Awal ===");
        plgn01.tampil();
        plgn02.tampil();
        plgn03.tampil();

        System.out.println("\n=== Penggunaan berhasil (Andi 1500 MB) ===");
        plgn01.tampil();
        plgn01.gunakan(1500);
        plgn01.tampil();

        System.out.println("\n=== Penggunaan melebihi kuota (Budi 2000 MB) ===");
        plgn02.tampil();
        plgn02.gunakan(2000);
        plgn02.tampil();

        System.out.println("\n=== Penggunaan nol dan negatif (Citra) ===");
        plgn03.tampil();
        plgn03.gunakan(0);
        plgn03.gunakan(-50);
        plgn03.tampil();

        System.out.println("\n=== Tambah kuota (Budi +1500 MB) ===");
        plgn02.tampil();
        plgn02.tambah(1500);
        plgn02.tampil();

        System.out.println("\n=== Uji status HABIS (Citra pakai 300 MB) ===");
        plgn03.gunakan(300);
        plgn03.tampil();

        System.out.println("\n=== Uji status MENIPIS (Budi pakai 1500 MB) ===");
        plgn02.gunakan(1500);
        plgn02.tampil();

        System.out.println("\n=== Uji status CUKUP (Andi) ===");
        plgn01.tampil();
    }
}