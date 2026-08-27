package PengenalanPBO;

abstract class Bentuk {
    abstract double luas(); // wajib diimplementasi child

    void info() {
        System.out.println("Ini adalah bentuk geometri");
    }
}

class Lingkaran extends Bentuk {
    double jariJari;
    Lingkaran(double r) { jariJari = r; }

    double luas() {
        return Math.PI * jariJari * jariJari;
    }
}