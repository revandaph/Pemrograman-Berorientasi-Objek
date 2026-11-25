package Teori09.multi;

public class Main {
    public static void main(String[] args) {
        BuketBunga buket = new BuketBunga();
        buket.rangkai();
        buket.kirim("Jl. Soekarno Hatta, Malang");
        IDirangkai t = new BungaTangkai();
        t.rangkai();
        IDapatDikirim p = new BungaPot();
        p.kirim("Jl. Veteran, Malang");
    }
}