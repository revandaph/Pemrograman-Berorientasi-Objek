package Teori02;

public class Vehicle23 {
    protected String merek;
    protected String warna;
    protected int kecepatanMaksimal; // km/jam

    public Vehicle23() {
        this.merek = "Tidak diketahui";
        this.warna = "Tidak diketahui";
        this.kecepatanMaksimal = 0;
    }

    public Vehicle23(String merek, String warna, int kecepatanMaksimal) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public void tampilkanInfo() {
        System.out.println("Merek            : " + merek);
        System.out.println("Warna            : " + warna);
        System.out.println("Kecepatan Maks   : " + kecepatanMaksimal + " km/jam");
    }

    public void jalan() {
        System.out.println(merek + " sedang berjalan.");
    }

    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public int getKecepatanMaksimal() { return kecepatanMaksimal; }
    public void setKecepatanMaksimal(int kecepatanMaksimal) { this.kecepatanMaksimal = kecepatanMaksimal; }
}