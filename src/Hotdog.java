public class Hotdog {
    double price;
    public Hotdog(double price){
        this.price = price;
    }

    public String getItemName(){return "Hotdog";}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price= price;}
    public String getDepartment(){return "Food Truck";}
}
