public class Sandwich implements Item{
    public String sandwichType;
    private double price;

    public Sandwich (String sandwichType, double price) {
        this.price = price;
        this.sandwichType = sandwichType;
    }

    public String getItemName(){return "Sandwich";}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price= price;}
    public String getDepartment(){return "Deli";}
    public String getType(){return sandwichType;}
}
