public class Skidka {
    private double skidka;
    private double procent;
    private double price;

    public double getProcent() {
        return procent;
    }
    public void setProcent(double procent) {
        this.procent = procent;
    }
    public double getSkidka() {
        return skidka;
    }
    public void setSkidka(double skidka) {
        this.skidka = skidka;
    }

    public Skidka(double skidka, double procent, double price) {
        skidka = price * procent / 100;
    }
}
