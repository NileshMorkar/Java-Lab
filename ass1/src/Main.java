import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price Of Chair == >");
        int price = sc.nextInt();
        System.out.println("Enter rotation Of Chair == >");
        int rotation = sc.nextInt();
        Chair ch1 = new Chair(price,rotation);

        System.out.println(ch1.toString());
    }
}


class Chair{
    private int price;
    private int rotation;

    public Chair(int price, int rotation) {
        this.price = price;
        this.rotation = rotation;
    }

    public Chair(Chair ch) {
        this.price = ch.price;
        this.rotation = ch.rotation;
    }

    public Chair(){}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "price=" + price +
                ", rotation=" + rotation +
                '}';
    }
}