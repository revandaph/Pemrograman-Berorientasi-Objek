package Jobsheet01;

import java.util.Scanner;

public class KalkulatorStruktural23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil;
        String operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = sc.next();

        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();

        hasil = hitung(angka1, operator, angka2);

        System.out.println("Hasil: " + hasil);

        sc.close();
    }

    public static double hitung(double angka1, String operator, double angka2)
    {
        double hasil = 0;

        switch (operator)
        {
            case "+":
                hasil = tambah(angka1, angka2);
                break;
            case "-":
                hasil = kurang(angka1, angka2);
                break;
            case "*":
                hasil = kali(angka1, angka2);
                break;
            case "/":
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operator tidak dikenali");
                break;
        }

        return hasil;
    }

    public static double tambah(double a, double b) { return a + b; }
    public static double kurang(double a, double b) { return a - b; }
    public static double kali(double a, double b) { return a * b; }

    public static double bagi(double a, double b)
    {
        if (b == 0)
        {
            System.out.println("Tidak bisa dibagi dengan 0");
            return 0;
        }
        return a / b;
    }
}