package Teori07.Case2;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Yansy Ayuningtyas", "34329837", "1989432439");
        TenagaKependidikan tendik = new TenagaKependidikan("Rina Lestari", "34329850", "Bagian Akademik");

        dosen.ajukanIzinAbsen();
        tendik.ajukanIzinAbsen();

        System.out.println();

        Pegawai p1 = new Dosen("Yansy Ayuningtyas", "34329837", "1989432439");
        Pegawai p2 = new TenagaKependidikan("Rina Lestari", "34329850", "Bagian Akademik");

        p1.ajukanIzinAbsen();
        p2.ajukanIzinAbsen();
    }
}