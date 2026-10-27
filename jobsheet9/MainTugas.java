package jobsheet9;

public class MainTugas {
    public static void main(String[] args) {
        TiketPesawat pesawat = new TiketPesawat(101, "Melvin", 1500000, 12, 777);
        
        TiketKereta kereta = new TiketKereta(102, "Nabeel", 300000, 5, 3);
        
        TiketBusEksekutif bus = new TiketBusEksekutif(103, "Natha", 150000, 1, "Sinar Jaya");

        pesawat.cetakTiket();
        System.out.println("Total Harga     : Rp" + pesawat.hitungHargaTotal());
        pesawat.ubahJadwal("25-12-2024");
        pesawat.tampilkanSyaratKetentuan();
        pesawat.ajukanRefund();
        System.out.println("Denda Refund    : Rp" + pesawat.hitungBiayaDenda());
        pesawat.cetakSuratAsuransi();
        pesawat.klaimAsuransi();
        System.out.println("---------------------------------");


        kereta.cetakTiket();
        System.out.println("Total Harga     : Rp" + kereta.hitungHargaTotal());
        kereta.ubahJadwal("26-12-2024", "Urusan Keluarga"); 
        kereta.tampilkanSyaratKetentuan();
        kereta.ajukanRefund();
        System.out.println("Denda Refund    : Rp" + kereta.hitungBiayaDenda()); 
        System.out.println("---------------------------------");

        bus.cetakTiket();
        System.out.println("Total Harga     : Rp" + bus.hitungHargaTotal());
        bus.ubahJadwal("27-12-2024");
        bus.tampilkanSyaratKetentuan();
    }
}
