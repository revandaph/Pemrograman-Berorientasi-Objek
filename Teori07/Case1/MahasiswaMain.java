package Teori07.Case1;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Budi Santoso", "254107060001");
        m1.tampilBiodata();

        Mahasiswa m2 = new Mahasiswa("Sari Wulandari", "254107060002", 19);
        m2.tampilBiodata();

        m2.setBiodata("Sari Putri");
        m2.tampilBiodata();

        m2.setBiodata("Sari Putri", "254107060003");
        m2.tampilBiodata();

        m2.setBiodata("Sari Putri Ayu", "254107060004", 20);
        m2.tampilBiodata();
    }
}