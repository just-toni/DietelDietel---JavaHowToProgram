package chapterFive;

public class Sales {

    private int quantity;
    private double price;
    private double product;

    public void setQuantity(int quantity) {
        if(quantity >= 1){
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if(price >= 0)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double calculateProduct() {
        product += (quantity * 1.0) * price;
        return product;
    }
}
