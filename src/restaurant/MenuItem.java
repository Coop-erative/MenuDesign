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
    private ZonedDateTime dateCreated;
    private boolean newOrOld;

    //Do i need this?
    public void menuItem (String name, String category, Double price, ZonedDateTime dateCreated, boolean newOrOld) {
        this.name = name;
        this.category = category;
        this.price = price;
        //log the date created...
        this.dateCreated = dateCreated;
        //need to validate how long "old" and "new are
        this.newOrOld = newOrOld;
    }

    //getters and setters
    public String getName() {
        return this.name;
    }
    public String setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return this.category;
    }
    public String setCategory(String category) {
        this.category = category;
    }
    public Double getPrice() {
        return this.price;
    }
    public Double setPrice(Double price) {
        this.price = price;
    }
    public ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }
    public ZonedDateTime setDateCreated(ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
    public boolean getNewOrOld() {
        return this.newOrOld;
    }
    public boolean setNewOrOld(boolean newOrOld) {
        this.newOrOld = newOrOld;
    }

    //methods
    private void createMenuItem() {
        ArrayList<Object> items = new ArrayList<>();
        //add items to collection. get item: String firstItem = items.get(0);
        items.add(getName());
        items.add(getCategory());
        items.add(getPrice());
        items.add(logDateAndTime());
        items.add(logNewOrOld(logDateAndTime()));   //logNewOrOld isn't receiving the "logged" date and time at the moment?
    }

    private static ZonedDateTime logDateAndTime() {
        return ZonedDateTime.now();
    }

    private static boolean logNewOrOld(ZonedDateTime loggedTime) {
       //true = New, false = Old
        if(loggedTime.getYear()<logDateAndTime().getYear()) {
            return false;
        }else{
            return true;
        }
    }



}
