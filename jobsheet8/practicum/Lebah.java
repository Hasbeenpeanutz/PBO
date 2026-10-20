package jobsheet8.practicum;

public class Lebah extends Hewan {

    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        this.kasta = kasta;
        super(berat, makanan, habitat);
    }

    public void bergerak() {
        System.out.println("Lebah bergerak dengan terbang.");
    }

    public void bernapas() {
        System.out.println("Lebah bernapas melalui trakea.");
    }
}
