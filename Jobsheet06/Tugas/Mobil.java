package Jobsheet06.Tugas;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil() {
        super();
        this.jumlahPintu = 4;
    }

    public Mobil(String merk, int tahun, double hargaBase, int jumlahPintu) {
        super(merk, tahun, hargaBase);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jml Pintu   : " + jumlahPintu + "\n";
        return info;
    }
}