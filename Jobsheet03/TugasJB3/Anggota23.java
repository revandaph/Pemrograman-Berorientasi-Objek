package Jobsheet03.TugasJB3;

public class Anggota23 {
    private String nomorKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota23(String nomorKtp, String nama, int limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {
        int minimalAngsuran = (int) (0.10 * jumlahPinjaman);
        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman saat ini.");
        } else {
            jumlahPinjaman -= nominal;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}