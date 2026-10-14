package UTS.AntrianLayananAkademik;

public class Mahasiswa23 extends Orang23 {
    private int nomor;
 
    public Mahasiswa23(int nomor, String nama) {
        super(nama);
        this.nomor = nomor;
    }
 
    public int getNomor() { return nomor; }
}