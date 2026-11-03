package jobsheet10;

public class Main {
    public static void main(String[] args) {

        Kipas kipas = new Kipas( "Berdiri", 350000, "Putih", "Miyako"  );

        TV tv = new TV( "LED", 20, 2500000, "Hitam", "Samsung" );

        Kulkas kulkas = new Kulkas( 2, 3500000, "Silver", "LG" );

        SmartFridge smartFridge = new SmartFridge( 50, 2, 7000000, "Hitam", "Samsung" );

        System.out.println("=== DATA KIPAS ===");
        System.out.println("Merk: " + kipas.getMerk());
        System.out.println("Warna: " + kipas.getWarna());
        System.out.println("Harga: " + kipas.getHarga());
        System.out.println(kipas.getInfo());

        System.out.println("\n=== DATA TV ===");
        System.out.println("Merk: " + tv.getMerk());
        System.out.println("Warna: " + tv.getWarna());
        System.out.println("Harga: " + tv.getHarga());
        System.out.println(tv.getInfo());

        System.out.println("Volume awal TV: " + tv.getVolume());
        tv.naikkanVolume(10);
        System.out.println("Volume setelah dinaikkan: " + tv.getVolume());
        tv.turunkanVolume(5);
        System.out.println("Volume setelah diturunkan: " + tv.getVolume());

        System.out.println("\n=== DATA KULKAS ===");
        System.out.println("Merk: " + kulkas.getMerk());
        System.out.println("Warna: " + kulkas.getWarna());
        System.out.println("Harga: " + kulkas.getHarga());
        System.out.println(kulkas.getInfo());

        System.out.println("\n=== DATA SMART FRIDGE ===");
        System.out.println("Merk: " + smartFridge.getMerk());
        System.out.println("Warna: " + smartFridge.getWarna());
        System.out.println("Harga: " + smartFridge.getHarga());
        System.out.println(smartFridge.getInfo());

        System.out.println("Volume awal: " + smartFridge.getVolume());
        smartFridge.naikkanVolume(10);
        System.out.println("Volume setelah dinaikkan: " + smartFridge.getVolume());
        smartFridge.turunkanVolume(5);
        System.out.println("Volume setelah diturunkan: " + smartFridge.getVolume());
    }
}
