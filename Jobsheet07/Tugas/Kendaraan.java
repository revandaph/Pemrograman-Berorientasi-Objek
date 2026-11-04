package Jobsheet07.Tugas;

public class Kendaraan {
    protected String merk;
    protected String platNomor;

    public Kendaraan() {
        this.merk = "Belum diisi";
        this.platNomor = "Belum diisi";
    }

    public Kendaraan(String merk, String platNomor) {
        this.merk = merk;
        this.platNomor = platNomor;
    }

    public void tampilkanInformasi() {
        System.out.println("Merk       : " + merk);
        System.out.println("Plat Nomor : " + platNomor);
    }
}