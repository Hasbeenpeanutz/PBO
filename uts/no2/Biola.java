package uts.no2;

public class Biola extends AlatMusikGesek {
    private String ukuranAlat;

    public Biola() {
        System.out.println("Biola dibuat.");
    }

    public void setUkuranAlat(String ukuranAlat) {
        this.ukuranAlat = ukuranAlat;
    }

    public void mainkan() {
        System.out.println(namaAlatMusik + " sedang dimaikan.");
    }

    public void setelNada() {
        System.out.println("Menyetel nada biola: " + namaAlatMusik);
    }
}
