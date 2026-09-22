package quiz1.Q1;

public class Stock {
    private int productId;
    private int quantity;
    private int shopNo;

    public Stock(int productId, int quantity, int shopNo) {
        this.productId = productId;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
        System.out.println("Stok berhasil ditambahkan. Jumlah stok sekarang: " + this.quantity);
    }

    public void modifyStock(int quantity) {
        this.quantity = quantity;
        System.out.println("Jumlah stok berhasil diubah menjadi: " + this.quantity);
    }

    public Stock selectStockItem(int productId) {
        if (this.productId == productId) {
            return this;
        }
        return null;
    }

    public int getProductId() { 
        return productId; 
    }

    public int getQuantity() { 
        return quantity; 
    }

    public int getShopNo() {
        return shopNo; 
    }

}
