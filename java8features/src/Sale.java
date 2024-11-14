public class Sale {

    int productId;
    int quantity;
    int price;

    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public Sale(int productId, int quantity, int price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
}
