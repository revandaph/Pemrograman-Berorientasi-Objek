package Teori07.Case2;

public class Dosen extends Pegawai {
    private String nidn;

    public Dosen(String nama, String nip, String nidn) {
        super(nama, nip);
        this.nidn = nidn;
    }

    @Override
    public void ajukanIzinAbsen() {
        System.out.println("Dosen " + nama + " (NIDN " + nidn + ") mengajukan izin absen ke ketua jurusan dan menyiapkan pengganti perkuliahan.");
    }
}