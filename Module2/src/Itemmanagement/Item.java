package Itemmanagement;
//  create a class
public class Item {
    // instance variable
     String itemName;
     double price;
     int year;
     // create generate constructor
    public Item(String itemName, double price,int year) {
        this.itemName = itemName;
        this.price = price;
        this.year = year;
    }
// generate getitem method
    public String getItemName() {
        return itemName;
    }
// generate getprice method
    public double getPrice() {
        return price;
    }
// generate getyear method
    public int getYear() {
        return year;
    }
// create printing method
    public void item(){
    System.out.println("--------item Details---------");
    System.out.println("itemname: " + itemName+ "\nprice: $"+ price +"\nyear: "+ year );
}
    }


