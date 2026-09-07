package jobsheet2;
public class Smartphone {
    public String brand;
    public String model;
    public double price;

    public void turnOn() {
        System.out.println(brand + " " + model + " is now ON.");
    }

    public void turnOff() {
        System.out.println(brand + " " + model + " is now OFF.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}
