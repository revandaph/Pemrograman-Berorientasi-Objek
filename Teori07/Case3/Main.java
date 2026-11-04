package Teori07.Case3;

public class Main {
    public static void main(String[] args) {
        Pembayaran transfer = new PembayaranTransfer("TRX001");
        Pembayaran ewallet = new PembayaranEWallet("TRX002");

        System.out.println("Total (harga)                  : " + transfer.hitungTotal(100000));
        System.out.println("Total (harga, jumlah)          : " + transfer.hitungTotal(100000, 2));
        System.out.println("Total (harga, jumlah, diskon)  : " + transfer.hitungTotal(100000, 2, 10));
        System.out.println();

        transfer.prosesPembayaran();
        transfer.cetakBukti();
        System.out.println();

        ewallet.prosesPembayaran();
        ewallet.cetakBukti();
    }
}