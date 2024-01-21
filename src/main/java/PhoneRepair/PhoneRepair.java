/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneRepair;

/**
 *
 * @author Jasmin Pascual
 */
public class PhoneRepair implements SalesCalculable{
    
    private String itemName;
    private double price;
    private double hours;
    
    public PhoneRepair (String itemName, double price, double hours) {
        this.itemName = itemName;
        this.price = price;
        this.hours = hours;
       
    }
    public double getprice(){
        return price;
    }
    
    public double gethours() {
        return hours;
    }
    
    @Override
    public double calculateTotalSales() {
        return price * hours;
    }
    
}
