package PengenalanPBO;

// 1. Deklarasi Interface
interface BisaTerbang {
    void terbang(); // method abstrak (tanpa bodi)
}

// 2. Class Burung yang mengimplementasikan interface BisaTerbang
class Burung implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Burung terbang di udara");
    }
}

// 3. Class utama yang berisi method main() untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Burung
        Burung burungGaruda = new Burung();
        
        // Memanggil method terbang()
        burungGaruda.terbang();
        
        // Bisa juga dipanggil menggunakan tipe Interface (Polimorfisme)
        BisaTerbang b = new Burung();
        b.terbang();
    }
}