
package com.mycompany.abstractionhw;


public class Phone implements SalesCalculable {
    
    private String itemName;
    private double price;
    private int quantitySold;
    
    public Phone(String itemName, double price, int quantitySold) {
        this.itemName = itemName;
        this.price = price;
        this.quantitySold = quantitySold;
        
    }
    public double getprice(){
        return price;
    }
    
    public int getQuantitySold() {
        return quantitySold;
    }
    @Override
    public double calculateTotalSales() {
        return price * quantitySold;
    }

    
}
    
   
