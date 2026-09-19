package Jobsheet02.TugasJB2.Tugas1_JB2;

public class DemoPersegiPanjang23 {
    public static void main(String[] args) {
        PersegiPanjang23 pp = new PersegiPanjang23();

        PersegiPanjang23 pp1 = new PersegiPanjang23();

        System.out.println("=== DATA PERSEGI PANJANG ===");
        pp.displayInfo(20,10);
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());

        pp1.displayInfo(50,40);
        System.out.println("Luas     : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());
    }
}