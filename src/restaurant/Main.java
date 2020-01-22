package restaurant;

import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        //Create several items and add them to a menu:
        MenuItem cheesePlate = new MenuItem("Cheese Board","Appetizer", 3.30);
        MenuItem steak = new MenuItem("8oz Steak","Main", 12.50);
        MenuItem cake = new MenuItem("Beef Taco","Main", 8.50);
        MenuItem iceCream = new MenuItem("Vanilla Ice Cream", "Desert", 4.00);

        //Create Menu to place Items & add items
        Menu lunchMenu = new Menu("Lunch Menu");
        lunchMenu.addMenuItem(cheesePlate);
        lunchMenu.addMenuItem(steak);
        lunchMenu.addMenuItem(cake);
        lunchMenu.addMenuItem(iceCream);

        //Print the entire, updated menu to the console.
        System.out.println(lunchMenu.toString());

        //Print an individual menu item to the screen.
        System.out.println(steak.toString());

        //Delete an item from the menu, then reprint the menu.
        lunchMenu.removeMenuItem(iceCream);
        System.out.println(lunchMenu.toString());
    }
}
