package com.example.varun.snapsauce;

/**
 * Created by anthony on 4/20/18.
 */

public class MenuItem {
    String category;
    int ID;
    String name;
    String picture;
    double unitPrice;
    int calories;
    int prepTime;

    public MenuItem(String category, int ID, String name, String picture, double unitPrice, int calories, int prepTime) {
        this.category = category;
        this.ID = ID;
        this.name = name;
        this.picture = picture;
        this.unitPrice = unitPrice;
        this.calories = calories;
        this.prepTime = prepTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }
}
