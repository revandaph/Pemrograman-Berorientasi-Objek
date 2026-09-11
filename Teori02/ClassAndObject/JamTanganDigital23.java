package Teori02.ClassAndObject;

public class JamTanganDigital23 {
    public String merk;
    public int jam;
    public int menit;
    public boolean statusAlarm;

    public void tampilkanWaktu() {
        System.out.println("Jam digital menunjukkan pukul " + jam + ":" + menit + " WIB.");
    }

    public void pasangAlarm(int jamAlarm, int menitAlarm) {
        statusAlarm = true;
        System.out.println("Alarm diatur untuk pukul " + jamAlarm + ":" + menitAlarm);
    }

    public void mulaiStopwatch() {
        System.out.println("Stopwatch dimulai dari 00:00.");
    }
}