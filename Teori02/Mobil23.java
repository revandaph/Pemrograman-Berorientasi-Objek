package Teori02;

public class Mobil23 extends Vehicle23 {
        private int jumlahPintu;
    private String jenisTransmisi;

    public Mobil23() {
        super();
        this.jumlahPintu = 4;
        this.jenisTransmisi = "Manual";
    }

    public Mobil23(String merek, String warna, int kecepatanMaksimal,
                 int jumlahPintu, String jenisTransmisi) {
        super(merek, warna, kecepatanMaksimal);
        this.jumlahPintu = jumlahPintu;
        this.jenisTransmisi = jenisTransmisi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- Data Mobil ---");
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu     : " + jumlahPintu);
        System.out.println("Transmisi        : " + jenisTransmisi);
    }

    @Override
    public void jalan() {
        System.out.println(merek + " melaju di jalan raya dengan " + jumlahPintu + " pintu.");
    }

    public int getJumlahPintu() { return jumlahPintu; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }

    public String getJenisTransmisi() { return jenisTransmisi; }
    public void setJenisTransmisi(String jenisTransmisi) { this.jenisTransmisi = jenisTransmisi; }
}