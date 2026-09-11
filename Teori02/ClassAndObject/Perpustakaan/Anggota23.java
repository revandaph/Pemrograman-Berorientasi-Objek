package Teori02.ClassAndObject.Perpustakaan;

public class Anggota23 {
    public String nama;
    public String nim;
    public String jurusan;

    public Anggota23(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilkanInfo() {
        System.out.println("ID Anggota : " + nim);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Kelas/Jurusan  : " + jurusan);
    }

    public void pinjamBuku(Buku23 itemBuku) {
        System.out.println("Anggota " + nama + " melakukan transaksi pinjam...");
        itemBuku.pinjamBuku();
    }

    public void kembalikanBuku(Buku23 itemBuku) {
        System.out.println("Anggota " + nama + " melakukan transaksi pengembalian...");
        itemBuku.kembalikanBuku();
    }
}