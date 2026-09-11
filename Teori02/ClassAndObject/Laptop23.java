package Teori02.ClassAndObject;

public class Laptop23 {
    public String merk;
    public String processor;
    public int ram;
    public int persentaseBaterai;

    public Laptop23() {
        this.merk = "Acer Aspire";
        this.processor = "Intel Core i3";
        this.ram = 8;
        this.persentaseBaterai = 100;
    }

    public Laptop23(String merk, String processor, int ram, int persentaseBaterai) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
        this.persentaseBaterai = persentaseBaterai;
    }

    public void nyalakan() {
        System.out.println("Sistem booting... Laptop " + merk + " (" + processor + ") siap digunakan.");
    }

    public void bukaProgram(String namaProgram) {
        System.out.println("Memproses dan membuka aplikasi " + namaProgram + "...");
    }

    public void matikan() {
        System.out.println("Menutup seluruh aplikasi. Laptop " + merk + " dimatikan.");
    }
}