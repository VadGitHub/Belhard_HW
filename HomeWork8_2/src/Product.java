public class Product {
    private String prodName;
    private double price;

    public Product() {
    }

    public Product(java.lang.String prodName, double price) {
        this.prodName = prodName;
        this.price = price;
    }

    public java.lang.String getProdName() {
        return prodName;
    }

    public void setProdName(java.lang.String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
