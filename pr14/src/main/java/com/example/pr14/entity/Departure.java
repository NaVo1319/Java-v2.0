package com.example.pr14.entity;

public class Departure {
    String type;
    String departureDate;

    public Departure() {
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' + ", departureDate='" + departureDate + '\'';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}
