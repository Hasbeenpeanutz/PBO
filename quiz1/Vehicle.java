package quiz1;

public class Vehicle {
    private String plateNumber;
    private String brand;
    private String model;
    private String vehicleType;
    private Customer pemilik;

    public Vehicle(String plateNumber, String brand, String model, String vehicleType, Customer pemilik) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
        this.pemilik = pemilik;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Customer getPemilik() {
        return pemilik;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setPemilik(Customer pemilik) {
        this.pemilik = pemilik;
    }
}
