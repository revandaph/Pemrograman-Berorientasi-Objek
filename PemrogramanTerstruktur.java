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

        double panjang1 = 20.0;
        double lebar1 = 7.0;

        double luas1 = hitungLuas(panjang1, lebar1);
        double keliling1 = hitungKeliling(panjang1, lebar1);

        System.out.println("\nLuas1: " + luas1);
        System.out.println("Keliling1: " + keliling1);
    }
}