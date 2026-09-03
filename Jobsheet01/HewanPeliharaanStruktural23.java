package Jobsheet01;

public class HewanPeliharaanStruktural23 {
    public static void main(String[] args)
    {
        String nama1, nama2, nama3, nama4, nama5, nama6, nama7, nama8, nama9, nama10;
        String jenis1, jenis2, jenis3, jenis4, jenis5, jenis6, jenis7, jenis8, jenis9, jenis10;
        double berat1, berat2, berat3, berat4, berat5, berat6, berat7, berat8, berat9, berat10;

        // Hewan 1
        nama1 = "Milo";
        jenis1 = "Kucing";
        berat1 = 3.5;

        // Hewan 2
        nama2 = "Bruno";
        jenis2 = "Anjing";
        berat2 = 12.0;

        // Hewan 3
        nama3 = "Kitty";
        jenis3 = "Kucing";
        berat3 = 2.5;

        // Hewan 4
        nama4 = "Rocky";
        jenis4 = "Anjing";
        berat4 = 15.5;

        // Hewan 5
        nama5 = "Coco";
        jenis5 = "Kucing";
        berat5 = 4.0;

        // Hewan 6
        nama6 = "Max";
        jenis6 = "Anjing";
        berat6 = 10.2;

        // Hewan 7
        nama7 = "Sumbul";
        jenis7 = "Kucing";
        berat7 = 3.2;

        // Hewan 8
        nama8 = "Dido";
        jenis8 = "Anjing";
        berat8 = 9.7;

        // Hewan 9
        nama9 = "Lily";
        jenis9 = "Kucing";
        berat9 = 3.9;

        // Hewan 10
        nama10 = "Leo";
        jenis10 = "Anjing";
        berat10 = 13.4;

        berat1  = tambahBerat(berat1, 0.5);
        berat2  = kurangiBerat(berat2, 1.0);
        berat3  = tambahBerat(berat3, 0.3);
        berat4  = kurangiBerat(berat4, 2.0);
        berat5  = tambahBerat(berat5, 0.7);
        berat6  = kurangiBerat(berat6, 0.8);
        berat7  = tambahBerat(berat7, 0.4);
        berat8  = kurangiBerat(berat8, 1.2);
        berat9  = tambahBerat(berat9, 0.6);
        berat10 = kurangiBerat(berat10, 1.5);

        System.out.println("Hewan Peliharaan 1 \nNama: " + nama1 + "\nJenis: " + jenis1 + "\nBerat: " + berat1 + " kg \n");
        System.out.println("Hewan Peliharaan 2 \nNama: " + nama2 + "\nJenis: " + jenis2 + "\nBerat: " + berat2 + " kg \n");
        System.out.println("Hewan Peliharaan 3 \nNama: " + nama3 + "\nJenis: " + jenis3 + "\nBerat: " + berat3 + " kg \n");
        System.out.println("Hewan Peliharaan 4 \nNama: " + nama4 + "\nJenis: " + jenis4 + "\nBerat: " + berat4 + " kg \n");
        System.out.println("Hewan Peliharaan 5 \nNama: " + nama5 + "\nJenis: " + jenis5 + "\nBerat: " + berat5 + " kg \n");
        System.out.println("Hewan Peliharaan 6 \nNama: " + nama6 + "\nJenis: " + jenis6 + "\nBerat: " + berat6 + " kg \n");
        System.out.println("Hewan Peliharaan 7 \nNama: " + nama7 + "\nJenis: " + jenis7 + "\nBerat: " + berat7 + " kg \n");
        System.out.println("Hewan Peliharaan 8 \nNama: " + nama8 + "\nJenis: " + jenis8 + "\nBerat: " + berat8 + " kg \n");
        System.out.println("Hewan Peliharaan 9 \nNama: " + nama9 + "\nJenis: " + jenis9 + "\nBerat: " + berat9 + " kg \n");
        System.out.println("Hewan Peliharaan 10 \nNama: " + nama10 + "\nJenis: " + jenis10 + "\nBerat: " + berat10 + " kg \n");
    }

    public static double tambahBerat(double berat, double increment)
    {
        berat += increment;
        if (berat < 0) berat = 0;

        return berat;
    }

    public static double kurangiBerat(double berat, double decrement)
    {
        berat -= decrement;
        if (berat < 0) berat = 0;

        return berat;
    }
}