package Jobsheet06.Tugas;

public class Kendaraan {
    protected String merk;
    protected int tahun;
    protected double hargaBase;

    public Kendaraan() {
        this.merk = "Belum Diatur";
        this.tahun = 0;
        this.hargaBase = 0.0;
    }

    public Kendaraan(String merk, int tahun, double hargaBase) {
        this.merk = merk;
        this.tahun = tahun;
        this.hargaBase = hargaBase;
    }

    public String getInfo() {
        String info = "";
        info += "Merk        : " + merk + "\n";
        info += "Tahun       : " + tahun + "\n";
        info += "Harga Base  : Rp " + hargaBase + "\n";
        return info;
    }
}