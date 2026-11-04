package Teori07.Case3;

public class PembayaranEWallet extends Pembayaran {
    public PembayaranEWallet(String kodeTransaksi) {
        super(kodeTransaksi);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran e-wallet " + kodeTransaksi + ": saldo langsung dipotong.");
    }
}