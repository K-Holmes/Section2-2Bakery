public class StoreTester {
    public static void main(String[] args) {
        //TODO: Make another class similar to cookie, clean up code
        Cookie c = new Cookie("Chocolate Chip", 14.99);
        Sandwich s = new Sandwich("Ham", 15.50);
        Item i = c;

        System.out.println("Department: "+i.getDepartment());
        //getType only exists in the Cookie class and therefore cannot be
        //attached to the Item interface
        System.out.println("Cookie Type: "+c.getType());
        System.out.println("Item Name: "+i.getItemName());
        System.out.println("Price: $"+i.getPrice());

        i = s;
        System.out.println("Department: "+i.getDepartment());
        //getType only exists in the Cookie class and therefore cannot be
        //attached to the Item interface
        System.out.println("Cookie Type: "+s.getType());
        System.out.println("Item Name: "+i.getItemName());
        System.out.println("Price: $"+i.getPrice());
    }
}
