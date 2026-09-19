package Jobsheet02.TugasJB2.Tugas1_JB2;


public class PersegiPanjang23 {
    public int panjang;
    public int lebar;

    public void displayInfo(int panjang, int lebar) {
        this.panjang=panjang;
        this.lebar=lebar;

        System.out.println("Panjang  : " + this.panjang);
        System.out.println("Lebar    : " + this.lebar);
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}