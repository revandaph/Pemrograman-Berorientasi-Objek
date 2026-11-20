package Kuiz1.Soal1;

public class RuangLab23 {
    private final String idRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean tersedia;

    public RuangLab23(String idRuang, String namaRuang, int kapasitas) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.tersedia = true;
    }

    public String getIdRuang() {
        return idRuang;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void ubahInformasi(String namaRuang, int kapasitas) {
        if (namaRuang == null || namaRuang.isEmpty()) {
            System.out.println("Nama ruang tidak boleh kosong.");
            return;
        }

        if (kapasitas <= 0) {
            System.out.println("Kapasitas harus lebih dari 0.");
            return;
        }

        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        System.out.println("Informasi ruang berhasil diubah.");
    }

    public void pesanRuang(int jumlahPeserta) {
        if (jumlahPeserta <= 0) {
            System.out.println("Pemesanan ditolak: jumlah peserta harus lebih dari 0.");
            return;
        }

        if (jumlahPeserta > kapasitas) {
            System.out.println("Pemesanan ditolak: jumlah peserta melebihi kapasitas.");
            return;
        }

        if (!tersedia) {
            System.out.println("Pemesanan ditolak: ruang sedang dipesan.");
            return;
        }

        tersedia = false;
        System.out.println("Pemesanan berhasil untuk ruang " + idRuang);
    }

    public void batalkanPemesanan() {
        if (tersedia) {
            System.out.println("Pembatalan ditolak: ruang belum dipesan.");
            return;
        }

        tersedia = true;
        System.out.println("Pemesanan ruang " + idRuang + " berhasil dibatalkan.");
    }

    public void tampilkanInfo() {
        System.out.println(
            "\n" + idRuang + " \n " +
            namaRuang + " \n Kapasitas: " +
            kapasitas + " \n Status: " +
            (tersedia ? "Tersedia" : "Dipesan")
        );
    }
}