package Teori03;

public class Mahasiswa23 {
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public Mahasiswa23(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        setIpk(ipk);
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.00 && ipk <= 4.00) {
            this.ipk = ipk;
        } else {
            System.out.println("Error: Nilai IPK (" + ipk + ") tidak valid! Harus antara 0.00 - 4.00.");
        }
    }       
}