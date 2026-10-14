package UTS.PaketInternetMahasiswa;

public class PelangganKuota23 extends Pelanggan23 {
    private int kuota;

    public PelangganKuota23(String id, String nama, int kuotaAwal) {
        super(id, nama);
        if (kuotaAwal < 0) {
            this.kuota = 0;
        } else {
            this.kuota = kuotaAwal;
        }
    }

    public int getKuota() { return kuota; }

    public boolean gunakan(int mb) {
        if (mb <= 0) {
            System.out.println("Ditolak: penggunaan harus lebih dari 0.");
            return false;
        }
        if (mb > kuota) {
            System.out.println("Ditolak: kuota tidak cukup.");
            return false;
        }
        kuota -= mb;
        System.out.println("Berhasil memakai " + mb + " MB.");
        return true;
    }

    public boolean tambah(int mb) {
        if (mb <= 0) {
            System.out.println("Ditolak: tambahan harus lebih dari 0.");
            return false;
        }
        kuota += mb;
        System.out.println("Berhasil menambah " + mb + " MB.");
        return true;
    }

    public String getStatus() {
        if (kuota == 0) return "HABIS";
        if (kuota <= 1000) return "MENIPIS";
        return "CUKUP";
    }

    public void tampil() {
        System.out.println("[" + getId() + "] " + getNama() + " | Kuota: " + kuota + " MB | Status: " + getStatus());
    }
}