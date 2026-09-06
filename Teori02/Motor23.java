package Teori02;

public class Motor23 extends Vehicle23 {
    private boolean isMatic;
    private int kapasitasMesin;

    public Motor23() {
        super();
        this.isMatic = true;
        this.kapasitasMesin = 110;
    }

    public Motor23(String merek, String warna, int kecepatanMaksimal,
                 boolean isMatic, int kapasitasMesin) {
        super(merek, warna, kecepatanMaksimal);
        this.isMatic = isMatic;
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- Data Motor ---");
        super.tampilkanInfo();
        System.out.println("Jenis            : " + (isMatic ? "Matic" : "Manual"));
        System.out.println("Kapasitas Mesin  : " + kapasitasMesin + " cc");
    }

    @Override
    public void jalan() {
        System.out.println(merek + " melaju lincah di antara kemacetan.");
    }

    public boolean isMatic() { return isMatic; }
    public void setMatic(boolean matic) { isMatic = matic; }

    public int getKapasitasMesin() { return kapasitasMesin; }
    public void setKapasitasMesin(int kapasitasMesin) { this.kapasitasMesin = kapasitasMesin; }
}