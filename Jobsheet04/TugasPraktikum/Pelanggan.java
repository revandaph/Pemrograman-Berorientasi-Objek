package Jobsheet04.TugasPraktikum;

import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noHP;
    private ArrayList<Pesanan23> riwayatPesanan;

    public Pelanggan(String idPelanggan, String nama, String noHP) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHP = noHP;
        this.riwayatPesanan = new ArrayList<>();
    }

    public void buatPesanan(Pesanan23 pesanan) {
        riwayatPesanan.add(pesanan);
    }

    public void cetakRiwayat() {
        System.out.println("==================================================");
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + nama);
        System.out.println("No HP        : " + noHP);
        System.out.println("--------------------------------------------------");
        if (!riwayatPesanan.isEmpty()) {
            System.out.println("Riwayat Pesanan:");
            int no = 1;
            for (Pesanan23 p : riwayatPesanan) {
                System.out.println("\nPesanan #" + no++);
                p.tampilkanDetailPesanan();
            }
        } else {
            System.out.println("Belum ada riwayat pesanan.");
        }
        System.out.println("==================================================\n");
    }
}