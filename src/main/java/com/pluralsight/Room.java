package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds){
        this.numberOfBeds = numberOfBeds;
        this .price = 120.00;
        this.isOccupied = false;
        this.isDirty = false;
    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
//        if (isOccupied || isDirty){
//            return false;
//        }
//        else{
//            return true;
//        }
//
        //return !(isOccupied || isDirty);
        return (!isOccupied && !isDirty);
    }

    public boolean checkIn(){
       if(isAvailable()) {
           this.isOccupied = true;
           this.isDirty = true;
           return true;
       }
       else{
           System.out.println("This room is already occupied");
           return false;
       }
    }

    public boolean checkOut(){
        if(!isAvailable()) {
            this.isOccupied = false;
            this.isDirty = true;
            return true;
        }
        else{
            System.out.println("Room is already vacant");
            return false;
        }

    }

    public void cleanRoom(){
        if (!isOccupied){
            this.isDirty = false;
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", isOccupied=" + isOccupied +
                ", isDirty=" + isDirty +
                ", isAvailable=" + isAvailable() +
                "}";
    }
}
