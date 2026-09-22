package quiz1.Q1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String customerName;
    private String address;
    private String phone;
    private List<Order> orders = new ArrayList<>();


    public Customer(int customerID, String customerName, String address, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order #" + order.getOrderId() + " berhasil ditambahkan ke pelanggan " + customerName);
    }

    public void editCustomer(String customerName, String address, String phone) {
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        System.out.println("Informasi pelanggan ID " + customerID + " berhasil diperbarui.");
    }

    public void deleteCustomer() {
        this.customerName = null;
        this.address = null;
        this.phone = null;
        orders.clear();
        System.out.println("Data pelanggan ID " + customerID + " telah dihapus.");
    }
    public int getCustomerID() { return customerID; }
    public String getCustomerName() { return customerName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
}