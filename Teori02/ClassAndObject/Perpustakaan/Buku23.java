package Teori02.ClassAndObject.Perpustakaan;

public class Buku23 {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public String kategori;
    public boolean sedangDipinjam;

    public Buku23(String judul, String penulis, int tahunTerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.sedangDipinjam = false;
    }

    public void tampilkanInfo() {
        String ketersediaan = sedangDipinjam ? "SEDANG DIPINJAM" : "TERSEDIA";
        System.out.println("[" + kategori + "] " + judul + " (" + tahunTerbit + ")");
        System.out.println("Karya      : " + penulis);
        System.out.println("Status Koleksi: " + ketersediaan);
    }

    public void pinjamBuku() {
        if (!sedangDipinjam) {
            sedangDipinjam = true;
            System.out.println("LOG: Peminjaman koleksi \"" + judul + "\" berhasil dicatat.");
        } else {
            System.out.println("LOG ERROR: Koleksi \"" + judul + "\" sedang dipinjam anggota lain!");
        }
    }

    public void kembalikanBuku() {
        if (sedangDipinjam) {
            sedangDipinjam = false;
            System.out.println("LOG: Pengembalian koleksi \"" + judul + "\" berhasil diproses.");
        } else {
            System.out.println("LOG WARNING: Koleksi \"" + judul + "\" tercatat sudah ada di rak.");
        }
    }
}