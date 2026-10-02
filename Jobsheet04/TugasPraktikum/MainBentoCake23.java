package Jobsheet04.TugasPraktikum;

public class MainBentoCake23 {
    public static void main(String[] args) {
        BentoCake23 cake1 = new BentoCake23("C01", "Red Velvet", "10cm", "Happy Birthday!", 65000);
        BentoCake23 cake2 = new BentoCake23("C02", "Chocolate Fudge", "12cm", "Congrats Grad!", 85000);
        BentoCake23 cake3 = new BentoCake23("C03", "Matcha Latte", "10cm", "Get Well Soon", 70000);

        Pesanan23 pesanan1 = new Pesanan23("P001", "2026-03-01");
        pesanan1.tambahCake(cake1);
        pesanan1.tambahCake(cake2);

        Pesanan23 pesanan2 = new Pesanan23("P002", "2026-03-05");
        pesanan2.tambahCake(cake3);

        Pelanggan pelanggan1 = new Pelanggan("PLG01", "Revalinda", "081234567890");

        pelanggan1.buatPesanan(pesanan1);
        pelanggan1.buatPesanan(pesanan2);

        pelanggan1.cetakRiwayat();
    }
}