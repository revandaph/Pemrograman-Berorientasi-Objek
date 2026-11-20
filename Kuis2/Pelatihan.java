package Kuis2;

public abstract class Pelatihan {
    protected String kodeProgram;
    protected String namaPeserta;
    protected int durasiJam;

    public Pelatihan() {
        this.kodeProgram = "-";
        this.namaPeserta = "-";
        this.durasiJam = 1;
    }

    public Pelatihan(String kodeProgram, String namaPeserta, int durasiJam) {
        if (durasiJam <= 0) {
            throw new IllegalArgumentException("Durasi harus lebih dari 0 jam.");
        }
        this.kodeProgram = kodeProgram;
        this.namaPeserta = namaPeserta;
        this.durasiJam = durasiJam;
    }

    public void tampilkanDataPeserta() {
        System.out.println("Kode Program : " + kodeProgram);
        System.out.println("Nama Peserta : " + namaPeserta);
        System.out.println("Durasi       : " + durasiJam + " jam");
    }

    public abstract double hitungBiaya();
    public abstract String tentukanStatus();

    protected static void validasiNilai(double nilai) {
        if (nilai < 0 || nilai > 100) {
            throw new IllegalArgumentException("Nilai harus berada pada rentang 0-100.");
        }
    }
}
