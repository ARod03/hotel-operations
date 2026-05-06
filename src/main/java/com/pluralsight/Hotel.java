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

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (this.bookedSuites + numberOfRooms <= this.numberOfSuites) {
                this.bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if (this.bookedRooms + numberOfRooms <= numberOfRooms) {
                this.bookedRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedRooms;

    }
    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;

    }

}
