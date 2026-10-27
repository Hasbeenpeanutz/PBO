package jobsheet9;

public class TiketPesawat extends Tiket implements IBisaRefund, IPunyaAsuransi {
    private int nomorPenerbangan;

    public TiketPesawat(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, int nomorPenerbangan) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi);
        this.nomorPenerbangan = nomorPenerbangan;
    }

    @Override
    public void cetakTiket() {
        System.out.println("=== TIKET PESAWAT ===");
        System.out.println("Kode Booking    : " + kodeBooking);
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("No. Penerbangan : " + nomorPenerbangan);
        System.out.println("Nomor Kursi     : " + nomorKursi);
    }

    @Override
    public double hitungHargaTotal() {
        return hargaTiket + (hargaTiket * pajakDasar); 
    }

    @Override
    public void ajukanRefund() {
        System.out.println("Refund Tiket Pesawat diproses. (Maksimal " + batasHariRefund + " hari sebelum keberangkatan)");
    }

    @Override
    public double hitungBiayaDenda() {
        return hargaTiket * 0.1;
    }

    @Override
    public void klaimAsuransi() {
        System.out.println("Klaim asuransi penerbangan sedang diproses.");
    }

    @Override
    public void cetakSuratAsuransi() {
        System.out.println("Mencetak polis asuransi untuk tiket pesawat " + kodeBooking);
    }
}