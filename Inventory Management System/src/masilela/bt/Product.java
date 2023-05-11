package masilela.bt;

/**
 *
 * @author Buhle Masilela
 */
public class Product {
    private String name;
    private int quantity;
    private double cost;
    private double sellingPrice;

    public Product() {
    }

    public Product(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    
    public double calcSellingPrice(double markUp)
    {
        sellingPrice = ((100+markUp)/100)*cost;
        
        return sellingPrice;
    }
    
}
