package Jobsheet8.Tugas;

public class TugasDemo {
    public static void main(String[] args) {
        TransferBank transfer1 = new TransferBank("TRX001", 150000, 
        "20-11-2026", "BCA", "1234567890");
        EWallet ewallet1 = new EWallet("TRX002", 75000, 
        "20-11-2026", "GoPay", "081234567890");
        KartuKredit kartu1 = new KartuKredit("TRX003", 2000000, 
        "20-11-2026", "1234567812345678", 5000000);

        System.out.println("=== Transfer Bank ===");
        transfer1.catatTransaksi();
        System.out.printf("Biaya        : Rp%.0f%n", transfer1.hitungBiaya());
        boolean hasil1 = transfer1.prosesBayar();
        System.out.println("Status       : " + (hasil1 ? "Berhasil" : "Gagal"));

        System.out.println();
        System.out.println("=== E-Wallet ===");
        ewallet1.catatTransaksi();
        System.out.printf("Biaya        : Rp%.0f%n", ewallet1.hitungBiaya());
        boolean hasil2 = ewallet1.prosesBayar();
        System.out.println("Status       : " + (hasil2 ? "Berhasil" : "Gagal"));

        System.out.println();
        System.out.println("=== Kartu Kredit ===");
        kartu1.catatTransaksi();
        System.out.printf("Biaya        : Rp%.0f%n", kartu1.hitungBiaya());
        boolean hasil3 = kartu1.prosesBayar();
        System.out.println("Status       : " + (hasil3 ? "Berhasil" : "Gagal"));
    }
}