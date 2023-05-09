package com.example.networking;

import com.google.gson.JsonObject;

public class Mountain {
    String ID;
    String name;
    String type;
    String company;
    String location;
    String category;
    int size;
    int cost;
    JsonObject auxdata;

    @Override
    public String toString() {
        return (name + " is a " + size + "m tall mountain located in " + location + ". It is a " + type + " mountain and is " + category + ". It costs " + cost + "kr to climb.");
    }

    // getters
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getCompany() {
        return company;
    }
    public String getLocation() {
        return location;
    }
    public String getCategory() {
        return category;
    }
    public int getSize() {
        return size;
    }
    public int getCost() {
        return cost;
    }
    public JsonObject getAuxdata() {
        return auxdata;
    }

    public String getImage() {
        return auxdata.get("img").getAsString();
    }
}
