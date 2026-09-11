package Jobsheet02.TugasJB2.Tugas1_JB2;


public class PersegiPanjang23 {
    public int panjang;
    public int lebar;

    public void displayInfo() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}