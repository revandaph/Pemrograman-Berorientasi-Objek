package Teori02.ClassAndObject;

public class MainLaptop23 {
    public static void main(String[] args) {
        Laptop23 unitA = new Laptop23();
        unitA.merk = "Lenovo Legion";
        unitA.processor = "AMD Ryzen 7";
        unitA.ram = 16;
        unitA.persentaseBaterai = 85;

        Laptop23 unitB = new Laptop23();
        unitB.merk = "Asus ROG";
        unitB.processor = "Intel Core i9";
        unitB.ram = 32;
        unitB.persentaseBaterai = 40;

        Laptop23 unitC = new Laptop23();
        unitC.merk = "MacBook Air";
        unitC.processor = "Apple M2";
        unitC.ram = 8;
        unitC.persentaseBaterai = 100;

        unitA.nyalakan();
        unitA.bukaProgram("VS Code");
        System.out.println("=========================================");

        unitB.nyalakan();
        unitB.bukaProgram("Blender 3D");
        unitB.matikan();
        System.out.println("=========================================");

        unitC.nyalakan();
    }
}