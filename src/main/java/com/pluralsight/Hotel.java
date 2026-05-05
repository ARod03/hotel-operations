package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){
            this.bookedSuites + this.numberOfRooms <= this.numberOfSuites
        } return true;
        return false;
    }

    private int numberOfSuites() {
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - bookedRooms;
    }
    public int getNumberOfNights() {
        return this.numberOfSuites - bookedSuites;
    }

}
