package com.example.stani.fragmentexample;

/**
 * Created by Stani on 3/11/2018.
 */

public class Diner {

    private String menuItem;
    private String menuItemDescription;



    public static final Diner [] dinerMenus = {
            new Diner("Weekday Special", "Fries, Veggie Burger"),
            new Diner("Weekend Special", "Soup, Salad, French Bread"),
            new Diner("Happy Hour", "Tacos, Chips, Salsa")
    };


            public Diner(String menuItem, String menuItemDescription){
                    this.menuItem = menuItem;
                    this.menuItemDescription = menuItemDescription;
            }

    public String getMenuItem() {
        return menuItem;
    }


    public String getMenuItemDescription() {
        return menuItemDescription;
    }



    public String toString(){
                return this.menuItem;
    }


}