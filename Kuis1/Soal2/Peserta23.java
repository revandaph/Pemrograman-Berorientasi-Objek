package Kuiz1.Soal2;

public class Peserta23 {
    private final String idPeserta;
    private String nama;
    private double praktik;
    private double teori;
    private double proyek;

    public Peserta23(String idPeserta, String nama, double praktik, double teori, double proyek) {
        this.idPeserta = idPeserta;
        this.nama = nama;

        setPraktik(praktik);
        setTeori(teori);
        setProyek(proyek);
    }

    public String getIdPeserta() {
        return idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public double getPraktik() {
        return praktik;
    }

    public double getTeori() {
        return teori;
    }

    public double getProyek() {
        return proyek;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPraktik(double praktik) {
        if (praktik >= 0 && praktik <= 100) {
            this.praktik = praktik;
        } else {
            System.out.println("Nilai praktik harus 0-100.");
        }
    }

    public void setTeori(double teori) {
        if (teori >= 0 && teori <= 100) {
            this.teori = teori;
        } else {
            System.out.println("Nilai teori harus 0-100.");
        }
    }

    public void setProyek(double proyek) {
        if (proyek >= 0 && proyek <= 100) {
            this.proyek = proyek;
        } else {
            System.out.println("Nilai proyek harus 0-100.");
        }
    }

    public double hitungNilaiAkhir() {
        return (praktik * 0.40) + (teori * 0.30) + (proyek * 0.30);
    }

    public boolean lulus() {
        double nilaiAkhir = hitungNilaiAkhir();
        return nilaiAkhir >= 70 && praktik >= 60 && teori >= 60 && proyek >= 60;
    }

    public void tampilkanInfo() {
        System.out.println("ID       : " + idPeserta);
        System.out.println("Nama     : " + nama);
        System.out.println("Praktik  : " + praktik);
        System.out.println("Teori    : " + teori);
        System.out.println("Proyek   : " + proyek);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Status   : " + (lulus() ? "LULUS" : "TIDAK LULUS"));
    }
}