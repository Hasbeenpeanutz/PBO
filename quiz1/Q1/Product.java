package quiz1.Q1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productId;
    private float productPrice;
    private String productType;
    private List<Stock> stocks = new ArrayList<>();

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public void modifyProduct(float productPrice, String productType) {
        this.productPrice = productPrice;
        this.productType = productType;
        System.out.println("Atribut produk berhasil diperbarui.");
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
        System.out.println("Stok berhasil dihubungkan ke produk ID: " + productId);
    }

    public void removeStock(Stock stock) {
        stocks.remove(stock);
        System.out.println("Stok berhasil dihapus dari produk ID: " + productId);
    }

    public int getProductId() {
        return productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductType() {
        return productType;
    }
}