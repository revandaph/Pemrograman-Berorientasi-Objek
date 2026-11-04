package Teori07.Case3;

public class Pembayaran {
    protected String kodeTransaksi;

    public Pembayaran(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public double hitungTotal(double harga) {
        return harga;
    }

    public double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    public double hitungTotal(double harga, int jumlah, double diskon) {
        return harga * jumlah * (100 - diskon) / 100;
    }

    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran untuk transaksi " + kodeTransaksi);
    }

    public final void cetakBukti() {
        System.out.println("Bukti pembayaran transaksi " + kodeTransaksi);
    }
}