package quiz1;

public class Main {
    public static void main(String[] args) {

        Employee E1 = new Employee("Joni", "001", "Mechanic");

        Customer C1 = new Customer("Budi", "08123456789");

        Vehicle V1 = new Vehicle("N 1234 CD", "Toyota", "Avanza", "Car", C1);
        Vehicle V2 = new Vehicle("N 2222 AB", "Honda", "Brio", "Car", C1);
        Vehicle V3 = new Vehicle("N 5678 EF", "Honda", "CBR", "Motorcycle", C1);
        Vehicle V4 = new Vehicle("N 9999 XY", "Yamaha", "NMAX", "Motorcycle", C1);

        C1.addVehicle(V1);
        C1.addVehicle(V2);
        C1.addVehicle(V3);
        C1.addVehicle(V4);

        Service S1 = new Service("Ganti Oli", 75000);
        Service S2 = new Service("Tambal Ban", 50000);
        Service S3 = new Service("Service Mesin", 150000);
        Service S4 = new Service("Ganti Kampas Rem", 100000);

        E1.serviceProcess(C1, V1, S1);
        E1.serviceProcess(C1, V2, S2);
        E1.serviceProcess(C1, V3, S3);
        E1.serviceProcess(C1, V4, S4);
    }
}
