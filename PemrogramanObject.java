class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class PemrogramanObject {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(10.0, 5.0);

        System.out.println("Luas: " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());
    }
}