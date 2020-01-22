package restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    //load data when/if created
    //loadData();

    //Initialize items
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    private String name;
    private Date dateCreated;
    private boolean newOrOld;

    public Menu(String name, ArrayList<MenuItem> MenuItems) {
        this.name = name;
        this.menuItems = menuItems;
        this.dateCreated= logDateAndTime();
    }

    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<MenuItem>();
        this.dateCreated = logDateAndTime();
    }

    //Set up Overrides for toString(), equals(), & hashcode().
    @Override
    public String toString() {
        return  name + ", update: " + dateCreated + "\n" + menuItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(getName(), menu.getName()) &&
                Objects.equals(getMenuItems(), menu.getMenuItems()) &&
                Objects.equals(getDateCreated(), menu.getDateCreated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMenuItems(), getDateCreated());
    }

    //methods
    public void additionalMenuItemInfo() {
        this.dateCreated = logDateAndTime();
        //need to validate how long "old" and "new are
        this.newOrOld = logNewOrOld(logDateAndTime());
    }

    //Menu class house menuItems after constructed in main & to store the date/time created.
    //want to move date time to menu .not in menuItem.
    //methods to add and remove from menu here.
            //use getter and setters for the constructed collections in these

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove((menuItem));
    }
    public static Date logDateAndTime() {
        return new Date();
    }
    public static boolean logNewOrOld(Date loggedTime) {
        //true = New, false = Old
        if(loggedTime.getYear()-ZonedDateTime.now().getYear()>1) {
            return false;
        }else{
            return true;
        }
    }

    //getters and setters
    public String getName() {
        return this.name = name;
    }
    public String setName() {
        return this.name;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    public Date setDateCreated(Date dateCreated) {
        return this.dateCreated;
    }
    public boolean getNewOrOld() {
        return this.newOrOld;
    }
    public boolean setNewOrOld(boolean newOrOld) {
        return this.newOrOld;
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

//*****************potential additions:*****************
    //    public void lastMenuUpdate() {
//
//    }
//
//    public void printMenuItem() {
//
//    }
//
//    public void printWholeMenu() {
//
//    }
//
//    public void duplicateCheck() {
//
//    }

}
