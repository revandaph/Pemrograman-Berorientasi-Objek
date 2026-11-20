package Jobsheet8.Tugas;

public class EWallet extends MetodePembayaran {
    public String provider;
    public String nomorHp;

    public EWallet(String idTransaksi, double jumlah, String tanggal,
                   String provider, String nomorHp) {
        super(idTransaksi, jumlah, tanggal);
        this.provider = provider;
        this.nomorHp = nomorHp;
    }

    @Override
    public boolean prosesBayar() {
        System.out.println("Memproses pembayaran via " + this.provider + " ke nomor " + this.nomorHp);
        if (this.nomorHp == null || this.nomorHp.isEmpty() || this.jumlah <= 0) {
            System.out.println("Pembayaran gagal: data tidak valid");
            return false;
        }
        System.out.println("Pembayaran e-wallet berhasil");
        return true;
    }

    @Override
    public double hitungBiaya() {
        return this.jumlah * 0.01;
    }
}