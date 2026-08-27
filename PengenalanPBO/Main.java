package PengenalanPBO;
class Mahasiswa {
    String nama;
    int nim;
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // ini object
        m1.nama = "Linda";
        m1.nim = 2541079;
    }
}

class Rekening {
    double saldo; // atribut

    void tabung(double jumlah) { // method
        saldo += jumlah;
    }
}
