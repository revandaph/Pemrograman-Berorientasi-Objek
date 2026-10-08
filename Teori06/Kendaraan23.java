package Teori06;

public class Kendaraan23 {
    protected String merk;
    protected String warna;
    protected int kecepatanMaks;

    public Kendaraan23(String merk, String warna, int kecepatanMaks) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() {
        System.out.println("Merk           : " + merk);
        System.out.println("Warna          : " + warna);
        System.out.println("Kecepatan Maks : " + kecepatanMaks + " km/jam");
    }
}