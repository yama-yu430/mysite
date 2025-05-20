package curriculum8;

public class Product {
    private double price;

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("価格は０以上でなければなりません。");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
