package Jobsheet07.Tugas;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil() {
        super();
        this.jumlahPintu = 4;
    }

    public Mobil(String merk, String platNomor, int jumlahPintu) {
        super(merk, platNomor);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jml Pintu  : " + jumlahPintu);
    }
}