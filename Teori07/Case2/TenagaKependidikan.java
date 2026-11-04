package Teori07.Case2;

public class TenagaKependidikan extends Pegawai {
    private String unitKerja;

    public TenagaKependidikan(String nama, String nip, String unitKerja) {
        super(nama, nip);
        this.unitKerja = unitKerja;
    }

    @Override
    public void ajukanIzinAbsen() {
        System.out.println("Tenaga kependidikan " + nama + " dari unit " + unitKerja + " mengajukan izin absen ke kepala unit.");
    }
}