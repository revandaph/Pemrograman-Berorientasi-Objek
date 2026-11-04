package Teori07.Case3;

public class PembayaranTransfer extends Pembayaran {
    public PembayaranTransfer(String kodeTransaksi) {
        super(kodeTransaksi);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran transfer bank " + kodeTransaksi + ": menunggu konfirmasi transfer.");
    }
}