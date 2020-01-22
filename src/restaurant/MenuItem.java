package restaurant;

import java.time.ZonedDateTime;
import java.util.ArrayList;

public class MenuItem {
    //load data when created for creating bulk menu items?
    //loadData();

    //Initialize items
    private String name;
    private String category;
    private Double price;


    public MenuItem (String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    //getters and setters
    public String getName() {
        return this.name;
    }
    public String setName(String name) {
        return this.name = name;
    }
    public String getCategory() {
        return this.category;
    }
    public String setCategory(String category) {
        return this.category = category;
    }
    public Double getPrice() {
        return this.price;
    }
    public Double setPrice(Double price) {
        return this.price = price;
    }

    @Override
    public String toString() {
        return "\n-----\n"+
                name +
                "\nCategory: "+ category +
                "\nPrice: " + price +
                "\nCreated: "  + Menu.logDateAndTime() +
                "\n-----\n";
    }

}
