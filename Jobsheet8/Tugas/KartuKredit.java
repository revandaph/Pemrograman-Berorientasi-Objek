package Jobsheet8.Tugas;

public class KartuKredit extends MetodePembayaran {
    public String nomorKartu;
    public double limitKredit;

    public KartuKredit(String idTransaksi, double jumlah, String tanggal,
                       String nomorKartu, double limitKredit) {
        super(idTransaksi, jumlah, tanggal);
        this.nomorKartu = nomorKartu;
        this.limitKredit = limitKredit;
    }

    @Override
    public boolean prosesBayar() {
        double total = this.jumlah + hitungBiaya();
        System.out.println("Memproses kartu kredit " + this.nomorKartu);
        if (total > this.limitKredit) {
            System.out.println("Pembayaran gagal: limit kredit tidak cukup");
            return false;
        }
        this.limitKredit -= total;
        System.out.printf("Pembayaran berhasil, sisa limit: Rp%.0f%n", this.limitKredit);
        return true;
    }

    @Override
    public double hitungBiaya() {
        return this.jumlah * 0.025;
    }
}