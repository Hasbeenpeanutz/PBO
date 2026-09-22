package quiz1.Q1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Andi", "Jl. Mawar No. 12", "081234567890");

        Product product1 = new Product( 101, 150000.0f, "Elektronik");

        Stock stock1 = new Stock(101, 50, 1);

        product1.addStock(stock1);

        Order order1 = new Order(1001, customer1.getCustomerID(), product1.getProductId(), 0.0f, LocalDateTime.now());

        order1.addProduct(product1);
        customer1.addOrder(order1);

        order1.orderProcess(customer1);
    }
}