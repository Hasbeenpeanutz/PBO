package jobsheet9;

public class TiketBusEksekutif extends TiketBus {
    
    public TiketBusEksekutif(int kodeBooking, String namaPembeli, double hargaTiket, int nomorKursi, String namaBus) {
        super(kodeBooking, namaPembeli, hargaTiket, nomorKursi, namaBus);
    }

    @Override
    public double hitungBiayaDenda() {
        return hargaTiket * 0.25; 
    }
}