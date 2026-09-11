package Jobsheet02.TugasJB2.Tugas1_JB2;

public class DemoPersegiPanjang23 {
    public static void main(String[] args) {
        PersegiPanjang23 pp = new PersegiPanjang23();
        pp.panjang = 10;
        pp.lebar = 5;

        System.out.println("=== DATA PERSEGI PANJANG ===");
        pp.displayInfo();
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());
    }
}