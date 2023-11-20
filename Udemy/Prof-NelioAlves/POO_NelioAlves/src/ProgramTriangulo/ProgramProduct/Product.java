package ProgramTriangulo.ProgramProduct;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removerProducts(int qantity) {
        this.quantity -= qantity;
    }


}
