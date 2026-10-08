package Teori06;

public class Mobil23 extends Kendaraan23 {
    private int jumlahPintu;

    public Mobil23(String merk, String warna, int kecepatanMaks, int jumlahPintu) {
        super(merk, warna, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}