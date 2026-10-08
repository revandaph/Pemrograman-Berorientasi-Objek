package Teori06;

public class Motor23 extends Kendaraan23 {
    private String jenisStang;

    public Motor23(String merk, String warna, int kecepatanMaks, String jenisStang) {
        super(merk, warna, kecepatanMaks);
        this.jenisStang = jenisStang;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Stang    : " + jenisStang);
    }
}