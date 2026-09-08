public class Motor {
    private String platNomor;
    private boolean isMesinON;
    private int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        
        if (this.isMesinON) {
            System.out.println("Mesin ON");
        } else {
            System.out.println("Mesin OFF");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("================================");
    }


    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public boolean isIsMesinON() {
        return isMesinON;
    }

    public void setIsMesinON(boolean isMesinON) {
        this.isMesinON = isMesinON;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinON && kecepatan > 0 ) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin OFF");
        } else if (this.isMesinON && kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh lebih dari 100 jika mesin ON");
        }else if (this.isMesinON && kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif jika mesin ON");
        }else {
            this.kecepatan = kecepatan;
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }
}