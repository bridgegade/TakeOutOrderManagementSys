package com.example.varun.snapsauce;

/**
 * Created by anthony on 4/20/18.
 */

public class Order {
    int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public int getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    public Order(int ID, String startTime, String endTime, int quantity, String pickupTime, int menuItemID) {

        this.ID = ID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.quantity = quantity;
        this.pickupTime = pickupTime;
        this.menuItemID = menuItemID;
    }

    String startTime;
    String endTime;
    int quantity;
    String pickupTime;
    int menuItemID;

}
