package Teori02.ClassAndObject.Perpustakaan;

public class DemoPerpustakaan23 {
    public static void main(String[] args) {
        Buku23 novel = new Buku23("Laskar Pelangi", "Andrea Hirata", 2005, "Sastra");
        Buku23 modulPbo = new Buku23("Pemrograman Berorientasi Objek", "Tim Dosen", 2023, "Pendidikan");

        Anggota23 mhs = new Anggota23("Revalinda Putri Hadinata", "254107060053", "SIB 2D");

        System.out.println("================ PERPUSTAKAAN ================");
        mhs.tampilkanInfo();
        System.out.println("----------------------------------------------");

        novel.tampilkanInfo();
        System.out.println();

        mhs.pinjamBuku(novel);
        novel.tampilkanInfo();
        System.out.println();

        mhs.pinjamBuku(novel);
        System.out.println();

        mhs.kembalikanBuku(novel);
        novel.tampilkanInfo();
        System.out.println("=====================================================");
    }
}