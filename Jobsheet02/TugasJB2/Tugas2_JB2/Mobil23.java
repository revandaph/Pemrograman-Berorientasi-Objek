package Jobsheet02.TugasJB2.Tugas2_JB2;

public class Mobil23 {
    public String merk;
    public String warna;
    public int kecepatan;

    public void tambahKecepatan(int km) {
        kecepatan += km;
    }

    public void displayInfo() {
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }
}