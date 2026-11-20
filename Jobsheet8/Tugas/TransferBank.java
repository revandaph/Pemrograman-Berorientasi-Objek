package Jobsheet8.Tugas;

public class TransferBank extends MetodePembayaran {
    public String namaBank;
    public String noRekening;

    public TransferBank(String idTransaksi, double jumlah, String tanggal,
                        String namaBank, String noRekening) {
        super(idTransaksi, jumlah, tanggal);
        this.namaBank = namaBank;
        this.noRekening = noRekening;
    }

    @Override
    public boolean prosesBayar() {
        System.out.println("Memproses transfer " + this.namaBank + " ke rekening " + this.noRekening);
        if (this.noRekening == null || this.noRekening.isEmpty() || this.jumlah <= 0) {
            System.out.println("Transfer gagal: data tidak valid");
            return false;
        }
        System.out.println("Transfer berhasil");
        return true;
    }

    @Override
    public double hitungBiaya() {
        return 6500;
    }
}