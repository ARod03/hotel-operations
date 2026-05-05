package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isDirty;
    private boolean isOccupied;


    public Room(int numberOfBeds, double price, boolean isDirty, boolean isOccupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public boolean isDirty() {
            return isDirty;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

    public boolean isAvailable() {
        if(!this.isOccupied() && !this.isDirty()){
            return true;
        }
        return false;
    }



}
