package Teori09.multi;

public class BungaPot implements IDapatDikirim {
    public void kirim(String alamat) {
        System.out.println("Bunga pot dikirim ke " + alamat);
    }
}