package Kuis2;

class PelatihanDesain extends Pelatihan {
    private static final double BIAYA_PER_JAM = 40000;
    private static final double NILAI_LULUS = 70;
    private double nilaiPortofolio;

    public PelatihanDesain() {
        super();
        this.nilaiPortofolio = 0;
    }

    public PelatihanDesain(String kodeProgram, String namaPeserta, int durasiJam, double nilaiPortofolio) {
        super(kodeProgram, namaPeserta, durasiJam);
        validasiNilai(nilaiPortofolio);
        this.nilaiPortofolio = nilaiPortofolio;
    }

    @Override
    public double hitungBiaya() {
        return durasiJam * BIAYA_PER_JAM;
    }

    @Override
    public String tentukanStatus() {
        return tentukanStatus(nilaiPortofolio);
    }

    public String tentukanStatus(double nilaiBaru) {
        validasiNilai(nilaiBaru);
        return nilaiBaru >= NILAI_LULUS ? "LULUS" : "TIDAK LULUS";
    }

    @Override
    public void tampilkanDataPeserta() {
        super.tampilkanDataPeserta();
        System.out.println("Jenis           : Pelatihan Desain");
        System.out.println("Nilai Portofolio: " + nilaiPortofolio);
    }
}
