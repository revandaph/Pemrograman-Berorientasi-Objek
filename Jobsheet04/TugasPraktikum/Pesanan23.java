package Jobsheet04.TugasPraktikum;

import java.util.ArrayList;

public class Pesanan23 {
    private String idPesanan;
    private String tanggal;
    private ArrayList<BentoCake23> listCake;

    public Pesanan23(String idPesanan, String tanggal) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.listCake = new ArrayList<>();
    }

    public void tambahCake(BentoCake23 cake) {
        listCake.add(cake);
    }

    public double hitungTotal() {
        double total = 0;
        for (BentoCake23 cake : listCake) {
            total += cake.getHarga();
        }
        return total;
    }

    public void tampilkanDetailPesanan() {
        System.out.println("  ID Pesanan : " + idPesanan);
        System.out.println("  Tanggal    : " + tanggal);
        System.out.println("  Daftar Cake:");
        for (BentoCake23 cake : listCake) {
            System.out.println("   - " + cake.getInfoCake());
        }
        System.out.println("  Total Bayar: Rp" + String.format("%,.0f", hitungTotal()));
    }
}