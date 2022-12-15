public class StoreTester {
    public static void main(String[] args) {
        //TODO: clean up code
        Cookie c = new Cookie("Chocolate Chip", 14.99);
        Item i = c;

        System.out.println("Department: "+i.getDepartment());
        //getType only exists in the Cookie class/outside the interface
        //and therefore cannot be attached to the Item interface
        System.out.println("Cookie Type: "+c.getType());
        System.out.println("Item Name: "+i.getItemName());
        System.out.println("Price: $"+i.getPrice());


        Sandwich s = new Sandwich("Ham", 15.50);
        i = s;
        System.out.println("\nDepartment: "+i.getDepartment());
        System.out.println("Sandwich Type: "+s.getType());
        System.out.println("Item Name: "+i.getItemName());
        System.out.println("Price: $"+i.getPrice());
        i.itemMsg();

        Hotdog h = new Hotdog(4.99);
        System.out.println("\nDepartment: "+h.getDepartment());
        System.out.println("Item Name: "+h.getItemName());
        System.out.println("Price: $"+h.getPrice());
    }
}
