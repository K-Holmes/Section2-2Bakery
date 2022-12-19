public interface Item {
    //constants
    int QUANTITY = 1;
    String msg = "";
    //abstract methods
    public String getItemName();
    public double getPrice();
    public void setPrice(double price);
    public String getDepartment();

    //default method does not need to be established in each class
    //but can be overridden if desired
    default void itemMsg(){
        System.out.println(QUANTITY+" "+getItemName()+" is worth $"+getPrice());
    }
}
