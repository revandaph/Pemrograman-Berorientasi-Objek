public class PemrogramanTerstruktur {
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        double panjang = 10.0;
        double lebar = 5.0;

        double luas = hitungLuas(panjang, lebar);
        double keliling = hitungKeliling(panjang, lebar);

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}