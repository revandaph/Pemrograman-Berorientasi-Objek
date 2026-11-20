package Kuis2;

class PelatihanTeknis extends Pelatihan {
    private static final double BIAYA_PER_JAM = 50000;
    private static final double NILAI_LULUS = 70;
    private double nilaiPraktik;

    public PelatihanTeknis() {
        super();
        this.nilaiPraktik = 0;
    }

    public PelatihanTeknis(String kodeProgram, String namaPeserta, int durasiJam, double nilaiPraktik) {
        super(kodeProgram, namaPeserta, durasiJam);
        validasiNilai(nilaiPraktik);
        this.nilaiPraktik = nilaiPraktik;
    }

    @Override
    public double hitungBiaya() {
        return durasiJam * BIAYA_PER_JAM;
    }

    @Override
    public String tentukanStatus() {
        return tentukanStatus(nilaiPraktik);
    }

    public String tentukanStatus(double nilaiBaru) {
        validasiNilai(nilaiBaru);
        return nilaiBaru >= NILAI_LULUS ? "LULUS" : "TIDAK LULUS";
    }

    @Override
    public void tampilkanDataPeserta() {
        super.tampilkanDataPeserta();
        System.out.println("Jenis        : Pelatihan Teknis");
        System.out.println("Nilai Praktik: " + nilaiPraktik);
    }
}
