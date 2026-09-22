package quiz1.Q1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private int customerId;
    private int productId;
    private float amount;
    private LocalDateTime orderDate;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId, int customerId, int productId, float amount, LocalDateTime orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public void orderProcess(Customer customer) {
        System.out.println("==================================================");
        System.out.println("                  ORDER DETAILS                   ");
        System.out.println("==================================================");

        System.out.println("Customer ID       : " + customer.getCustomerID());
        System.out.println("Customer Name     : " + customer.getCustomerName());
        System.out.println("Address           : " + customer.getAddress());
        System.out.println("Phone             : " + customer.getPhone());

        System.out.println("--------------------------------------------------");

        System.out.println("Order ID          : " + orderId);
        System.out.println("Order Date        : " + orderDate);

        System.out.println("--------------------------------------------------");

        System.out.println("Product ID        : " + productId);
        System.out.println("Total Amount      : Rp " + calculateTotal());

        System.out.println("--------------------------------------------------");

        System.out.println("Order successfully processed.");
        System.out.println("==================================================");
    }

    public void createOrder() {
        System.out.println("Order #" + orderId + " berhasil dibuat pada tanggal: " + orderDate);
    }

    public void editOrder(int orderId) {
        this.orderId = orderId;
        System.out.println("ID Order diperbarui menjadi: " + orderId);
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Produk ID " + product.getProductId() + " ditambahkan ke Order #" + orderId);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Produk ID " + product.getProductId() + " dihapus dari Order #" + orderId);
    }

    public float calculateTotal() {
        float total = 0;
        for (Product p : products) {
            total += p.getProductPrice();
        }
        this.amount = total;
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public float getAmount() {
        return amount;
    }
}