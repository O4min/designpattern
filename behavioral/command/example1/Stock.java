package behavioral.command.example1;

/**
 * Author: A.Hosseini
 * Date:10/7/2023
 * Time:5:12 PM
 */

//Receiver class
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public Stock() {
    }

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

    public void cancel(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] canceled");
    }
}