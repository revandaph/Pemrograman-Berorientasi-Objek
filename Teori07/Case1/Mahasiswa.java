package Teori07.Case1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int umur;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.umur = 0;
    }

    public Mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public void setBiodata(String nama) {
        this.nama = nama;
    }

    public void setBiodata(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void setBiodata(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public void tampilBiodata() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Umur : " + umur);
        System.out.println();
    }
}