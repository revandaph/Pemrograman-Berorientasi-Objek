package Jobsheet8.Tugas;

public abstract class MetodePembayaran {
    public String idTransaksi;
    public double jumlah;
    public String tanggal;

    public MetodePembayaran(String idTransaksi, double jumlah, String tanggal) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    public abstract boolean prosesBayar();
    public abstract double hitungBiaya();

    public void catatTransaksi() {
        System.out.println("ID Transaksi : " + this.idTransaksi);
        System.out.printf("Jumlah       : Rp%.0f%n", this.jumlah);
        System.out.println("Tanggal      : " + this.tanggal);
    }
}