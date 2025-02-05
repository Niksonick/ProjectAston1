import java.util.Objects;

public class Skidka {
    private int procent;
    private int price;

    public Skidka (int procent, int price) {
        this.procent = procent;
        this.price = price;
    }

    public int Drova (int procent, int price) {
       return procent * price / 100;
    }
}
