package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

@Test
    public void checkIn_newRoom_isOccupiedAndIsDirty(){
        //arrange
        Room r1 = new Room(3);

        //act
        r1.checkIn();

        //assert
    assertTrue(r1.isOccupied());
    assertTrue(r1.isDirty());
    }


    @Test
    public void checkIn_isOccupied_False(){
        //arrange
        Room r1 = new Room(3);
        r1.checkIn();

        //act
        boolean result = r1.checkIn();

        //assert
        assertFalse(result);
    }

    @Test
    public void checkOut_isOccupied_notIsOccupied(){
        //arrange
        Room r1 = new Room(3);
        r1.checkIn();

        //act
       boolean result = r1.checkOut();

        //assert
        assertTrue(result);

    }

    @Test
    public void cleanRoom_isDirty_isNotDirty(){
        //arrange
        Room r1 = new Room(3);
        r1.checkIn();
        r1.checkOut();

        //act
        r1.cleanRoom();

        //assert
        assertFalse(r1.isDirty());

    }








}