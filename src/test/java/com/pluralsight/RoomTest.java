package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {


    @Test
    public void checkIn_should_be_occupied() {
        // arrange
        Room testingRoom1 = new Room(2, 129.99, false, false);

        // act
        testingRoom1.checkIn();

        // assert
        assertTrue(testingRoom1.isOccupied());
    }

    @Test
    public void checkIn_should_be_dirty() {
        // arrange
        Room testingRoom1 = new Room(2, 129.99, false, false);

        // act
        testingRoom1.checkIn();

        // assert
        assertTrue(testingRoom1.isDirty());
    }

    @Test
    public void checkOut_should_be_clean() {
        // arrange
        Room testingRoom2 = new Room(1, 89.99, true, false);

        //act
        testingRoom2.checkOut();

        //assert
        assertFalse(testingRoom2.isDirty());
    }

    @Test
    public void checkOut_should_not_be_occupied() {
        // arrange
        Room testingRoom2 = new Room(1, 89.99, true, false);

        //act
        testingRoom2.checkOut();

        //assert
        assertFalse(testingRoom2.isOccupied());
    }

}