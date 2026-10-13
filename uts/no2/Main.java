package uts.no2;

public class Main {
    public static void main(String[] args) {
        Biola stradivarius = new Biola();
        stradivarius.namaAlatMusik = "Biola Stradivarius";
        stradivarius.produsen = "Antonio Stradivari";
        stradivarius.tahunPembuatan = 1715;
        stradivarius.displayInfo();

        stradivarius.jenisBusur = "Tourte";
        stradivarius.bahanSenar = "Gut";
        stradivarius.jumlahSenar = 4;
        stradivarius.gantiSenar();
        stradivarius.setelNada();

        stradivarius.setUkuranAlat("4/4");
        stradivarius.mainkan();
        stradivarius.setelNada();
        
    }
}
