import java.util.Scanner;

public class StoreTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey there new hire! I'm Jordan, Mr Business-Owner " +
                "told me to show you the reins. So welcome to the Store!");
        System.out.println("We have cookies, hotdogs, and sandwiches for sale. " +
                "I need you to mark up the food. \nLet's start off with cookies. " +
                "Are you ready? (y/n)");
        String ready = sc.next();
        if (ready.equalsIgnoreCase("y")){
            System.out.println("\nGood! First, what kind of cookies should we make?");
            String cookieType = sc.next();
            System.out.println("Okay, now how much should 1 cost?");
            double cookiePrice = sc.nextDouble();
            System.out.println("\nNow, let's move on to the sandwiches. What kind should we sell?");
            String sandwichType = sc.next();
            System.out.println("Good choice! What should we price it at?");
            double sandwichPrice = sc.nextDouble();
            System.out.println("And lastly! What should we sell our hotdogs at?");
            double hotdogPrice = sc.nextDouble();
            System.out.println("Okay, allow me to showcase your menu.");

            Cookie c = new Cookie (cookieType, cookiePrice);
            Item i =c;
            System.out.println("\nDepartment: "+i.getDepartment());
            System.out.println("Cookie Type: "+c.getType());
            System.out.println("Item Name: "+i.getItemName());
            System.out.println("Price: $"+i.getPrice());

            Sandwich s = new Sandwich(sandwichType, sandwichPrice);
            i = s;
            System.out.println("\nDepartment: "+i.getDepartment());
            System.out.println("Sandwich Type: "+s.getType());
            System.out.println("Item Name: "+i.getItemName());
            System.out.println("Price: $"+i.getPrice());
            i.itemMsg();

            Hotdog h = new Hotdog(hotdogPrice);
            System.out.println("\nDepartment: "+h.getDepartment());
            System.out.println("Item Name: "+h.getItemName());
            System.out.println("Price: $"+h.getPrice());

            System.out.println("\nThank you! This is a wonderful menu," +
                    " I'll let Mr Business-Owner know, have a good day!");
        } else {
            System.out.println("Oh, okay. Maybe next time then!");
        }
        sc.close();
    }
}
