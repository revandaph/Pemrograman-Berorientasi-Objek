package Teori09.multi;

public class BuketBunga implements IDirangkai, IDapatDikirim {
    public void rangkai() {
        System.out.println("Merangkai buket bunga campur");
    }
    public void kirim(String alamat) {
        System.out.println("Buket dikirim ke " + alamat);
    }
}
