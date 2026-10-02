package Jobsheet04.TugasPraktikum;

public class BentoCake23 {
    private String idCake;
    private String rasa;
    private String ukuran;
    private String customTulisan;
    private double harga;

    public BentoCake23(String idCake, String rasa, String ukuran, String customTulisan, double harga) {
        this.idCake = idCake;
        this.rasa = rasa;
        this.ukuran = ukuran;
        this.customTulisan = customTulisan;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getInfoCake() {
        return "ID Cake: " + idCake + " | Rasa: " + rasa + " | Ukuran: " + ukuran + 
               " | Tulisan: \"" + customTulisan + "\" | Harga: Rp" + String.format("%,.0f", harga);
    }
}