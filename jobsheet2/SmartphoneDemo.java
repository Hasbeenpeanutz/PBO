package jobsheet2;
public class SmartphoneDemo {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        s1.brand = "Apple";
        s1.model = "iPhone 17";
        s1.price = 999.99;

        Smartphone s2 = new Smartphone();
        s2.brand = "Samsung";
        s2.model = "Galaxy S25";
        s2.price = 899.99;

        System.out.println("Smartphone 1:");
        s1.displayInfo();
        s1.turnOn();
        s1.turnOff();

        System.out.println("\nSmartphone 2:");
        s2.displayInfo();
        s2.turnOn();
        s2.turnOff();
    }
}
