package jobsheet2;
public class Item {
    public String code;
    public String name;
    public double grossPrice;
    public double discount;

    public double getNetPrice() {
        return grossPrice - discount * grossPrice;
    }

    public void displayInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Gross Price: " + grossPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Net Price: " + getNetPrice());
    }
}
