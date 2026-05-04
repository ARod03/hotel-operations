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

        public void setNumberOfBeds(int numberOfBeds) {
            this.numberOfBeds = numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isDirty() {
            return isDirty;
        }

        public void setDirty(boolean dirty) {
            isDirty = dirty;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

        public void setOccupied(boolean occupied) {
            isOccupied = occupied;
    }

    public boolean isAvailable() {
        if(!this.isOccupied() && !this.isDirty()){
            return true;
        }
        return false;
    }



}
