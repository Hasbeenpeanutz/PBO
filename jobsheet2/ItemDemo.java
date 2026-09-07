package jobsheet2;
public class ItemDemo {
    public static void main(String[] args) {
        Item b1 = new Item();
        b1.code = "ATK01";
        b1.name = "Bolpoin";
        b1.grossPrice = 3500;
        b1.discount = 0.1;

        b1.displayInfo();
    }
}
