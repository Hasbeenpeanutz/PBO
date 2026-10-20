package jobsheet7.overload;

public class Segitiga {
    int sudut;

    public int totalSudut(int sudutA) {
        int sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        int sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    public int keliling(int sudutA, int sudutB, int sudutC) {
        int keliling = sudutA + sudutB + sudutC;
        return keliling;
    }

    public double keliling(int sudutA, int sudutB) {
        double c = Math.sqrt(Math.pow(sudutA, 2) + Math.pow(sudutB, 2));
        return c;
    }
}
