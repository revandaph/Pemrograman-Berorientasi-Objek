package Teori02.ClassAndObject;

public class KameraDigital23 {
    public String merk;
    public int resolusiMegapixel;
    public int sisaPenyimpanan;
    public int iso;

    public void ambilFoto() {
        if (sisaPenyimpanan > 0) {
            sisaPenyimpanan--;
            System.out.println("Cekrek! Foto berhasil diambil. Sisa slot foto: " + sisaPenyimpanan);
        } else {
            System.out.println("Penyimpanan penuh! Tidak dapat mengambil foto.");
        }
    }

    public void rekamVideo() {
        System.out.println("Perekaman video berjalan pada ISO " + iso + "...");
    }

    public void matikan() {
        System.out.println("Kamera " + merk + " dimatikan.");
    }
}