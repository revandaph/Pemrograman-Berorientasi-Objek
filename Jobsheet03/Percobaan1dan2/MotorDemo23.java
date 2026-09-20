package Jobsheet03.Percobaan1dan2;

public class MotorDemo23 {
public static void main(String[] args) {
        Motor23 motor1 = new Motor23();
        motor1.displayStatus();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor23 motor2 = new Motor23();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();

        Motor23 motor3 = new Motor23();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();
    }
}