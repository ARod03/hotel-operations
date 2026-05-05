package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(2, 129.99, false, false);

        Room room2 = new Room(1, 89.99, true, false);

        Room room3 = new Room(2, 129.99, false, true);

        Room room4 = new Room(1, 99.99, true, true);

        System.out.println("Room 1");
        System.out.println("Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: $" + room1.getPrice());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());
        System.out.println();

        System.out.println("Room 2");
        System.out.println("Beds: " + room2.getNumberOfBeds());
        System.out.println("Price: $" + room2.getPrice());
        System.out.println("Occupied: " + room2.isOccupied());
        System.out.println("Dirty: " + room2.isDirty());
        System.out.println("Available: " + room2.isAvailable());
        System.out.println();

        System.out.println("Room 3");
        System.out.println("Beds: " + room3.getNumberOfBeds());
        System.out.println("Price: $" + room3.getPrice());
        System.out.println("Occupied: " + room3.isOccupied());
        System.out.println("Dirty: " + room3.isDirty());
        System.out.println("Available: " + room3.isAvailable());
        System.out.println();

        System.out.println("Room 4");
        System.out.println("Beds: " + room4.getNumberOfBeds());
        System.out.println("Price: $" + room4.getPrice());
        System.out.println("Occupied: " + room4.isOccupied());
        System.out.println("Dirty: " + room4.isDirty());
        System.out.println("Available: " + room4.isAvailable());
        System.out.println();




    }

}
