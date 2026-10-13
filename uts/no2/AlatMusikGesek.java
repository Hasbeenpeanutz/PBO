package uts.no2;

public class AlatMusikGesek extends AlatMusik {
    protected String jenisBusur;
    protected String bahanSenar;
    protected int jumlahSenar;

    public AlatMusikGesek() {
        System.out.println("Alat musik gesek dibuat.");
    }

    public void gantiSenar() {
        System.out.println("Mengganti senar alat musik gesek: " + namaAlatMusik);
    }

    public void setelNada() {
        System.out.println("Menyetel nada alat musik gesek: " + namaAlatMusik);
    }
    
}
