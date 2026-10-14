package UTS.AntrianLayananAkademik;

public class DemoAntrian23 {
    public static void main(String[] args) {
        Antrian23 antr = new Antrian23();
 
        System.out.println("=== Ambil Antrian ===");
        antr.ambilNomor("Andi");
        antr.ambilNomor("Budi");
        antr.ambilNomor("Citra");
        antr.ambilNomor("Dewi");
        antr.ambilNomor("");
 
        System.out.println("\n=== Panggil 2 Mahasiswa ===");
        antr.panggil();
        antr.panggil();
 
        System.out.println("\n=== Sisa Antrian ===");
        antr.tampilSisa();
 
        System.out.println("\n=== Panggil Sampai Kosong ===");
        antr.panggil();
        antr.panggil();
        antr.panggil();
 
        System.out.println("\n=== Sisa Antrian ===");
        antr.tampilSisa();
    }
}