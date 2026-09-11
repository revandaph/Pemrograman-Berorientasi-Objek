package Teori02.ClassAndObject;

public class Laptop23 {
    public String merk;
    public String processor;
    public int ram;
    public int persentaseBaterai;

    public void nyalakan() {
        System.out.println("Sistem booting... Laptop " + merk + " siap digunakan.");
    }

    public void bukaProgram(String namaProgram) {
        System.out.println("Memproses dan membuka aplikasi " + namaProgram + "...");
    }

    public void matikan() {
        System.out.println("Menutup seluruh aplikasi. Laptop " + merk + " dimatikan.");
    }
}