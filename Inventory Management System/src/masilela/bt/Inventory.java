package masilela.bt;

import java.util.ArrayList;

/**
 * @author Buhle Masilela
 */
public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
    }

    public Inventory(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    public double totalCostPrice()
    {
        double costPrice = 0.0;
        
        for (Product product : products) {
            costPrice = costPrice+(product.getCost()*product.getQuantity());
        }
        
        return costPrice;
    }
    public double totalSellingPrice()
    {
        double sellingPrice = 0.0;
        
        for (Product product : products) {
            sellingPrice = sellingPrice + (product.getSellingPrice()*product.getQuantity());
        }
        return sellingPrice;
    }
    public double profit()
    {
        return totalSellingPrice() - totalCostPrice();
    }
}
