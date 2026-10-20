package jobsheet8.practicum;

public class Ular extends Hewan {
    public boolean isBerbisa;

    public Ular(double berat, String makanan, String habitat, boolean isBerbisa) {
        super(berat, makanan, habitat);
        this.isBerbisa = isBerbisa;
    }

    public void bergerak() {
        System.out.println("Ular bergerak dengan merayap.");
    }

    public void bernapas() {
        System.out.println("Ular bernapas melalui paru-paru.");
    }
    
}
