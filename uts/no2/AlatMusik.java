package uts.no2;

public class AlatMusik {
    protected String namaAlatMusik;
    protected String produsen;
    protected int tahunPembuatan;
    protected double harga;

    public AlatMusik() {
        System.out.println("Alat musik dibuat.");
    }

    public void mainkan() {
        System.out.println("Memainkan alat musik: " + namaAlatMusik);
    }

    public void setelNada() {
        System.out.println("Menyetel nada alat musik: " + namaAlatMusik);
    }

    public void displayInfo() {
        System.out.println("Nama Alat Musik: " + namaAlatMusik);
        System.out.println("Produsen: " + produsen);
        System.out.println("Tahun Pembuatan: " + tahunPembuatan);
        System.out.println("Harga: " + harga);
    }
}
