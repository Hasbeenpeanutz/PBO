package quiz1;

public class Employee {
    private String name;
    private String employeeId;
    private String role;

    public Employee(String name, String employeeId, String role) {
        this.name = name;
        this.employeeId = employeeId;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void serviceProcess(Customer customer, Vehicle vehicle, Service service) {
        double additionalFee = 0;
        if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
            additionalFee = 50000;
        } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
            additionalFee = 20000;
        }
        double totalCost = service.getServicePrice() + additionalFee;
        System.out.println("========================================");
        System.out.println(" BENGKEL MAJU SERVICE");
        System.out.println("========================================");
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Vehicle Plate : " + vehicle.getPlateNumber());
        System.out.println("Vehicle Brand : " + vehicle.getBrand());
        System.out.println("Vehicle Model : " + vehicle.getModel());
        System.out.println("Vehicle Type : " + vehicle.getVehicleType());
        System.out.println("----------------------------------------");
        System.out.println("Service Name : " + service.getServiceName());
        System.out.println("Service Price : Rp" + service.getServicePrice());
        System.out.println("Additional Fee : Rp" + additionalFee);
        System.out.println("Total Estimated : Rp" + totalCost);
        System.out.println("Employee : " + name);
        System.out.println("========================================");
        System.out.println();
    }
}
