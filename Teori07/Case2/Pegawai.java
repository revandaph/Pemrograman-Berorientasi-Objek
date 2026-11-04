package Teori07.Case2;

public class Pegawai {
    protected String nama;
    protected String nip;

    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public void ajukanIzinAbsen() {
        System.out.println("Pegawai " + nama + " (NIP " + nip + ") mengajukan izin absen ke bagian kepegawaian.");
    }
}