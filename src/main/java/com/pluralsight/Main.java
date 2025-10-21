package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Room> rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        for(Room r : rooms) {
            System.out.println(r);
        }

        System.out.println("Two rooms checked in");
        r101.checkIn();
        r102.checkIn();
            for(Room r : rooms) {
                System.out.println(r);
            }

        System.out.println("One room checked out");
        r102.checkOut();
        for(Room r : rooms) {
            System.out.println(r);
        }



        ArrayList<Reservation> reservations= new ArrayList<>();
        Reservation res1 = new Reservation("king", 2,false);
        Reservation res2 = new Reservation("double", 1,false);
        Reservation res3 = new Reservation("king", 1,false);
        Reservation res4 = new Reservation("king", 2,true);

        reservations.add(res1);
        reservations.add(res2);
        reservations.add(res3);
        reservations.add(res4);

        for(Reservation r : reservations){
            System.out.println(r);
        }

        ArrayList<Employee> employees = new ArrayList<>();

        Employee a = new Employee(12345, "Jaylen", "House keeping", 25.00f, 40);
        Employee b = new Employee(12346, "Hignacio", "House keeping", 25.00f, 48);
        Employee c = new Employee(12347, "Nisa", "House keeping", 35.00f, 45);
        Employee d = new Employee(12348, "Henry", "House keeping", 40.00f, 40);

        employees.add(a);
        employees.add(b);
        employees.add(c);
        employees.add(d);

        for (Employee e : employees){
            System.out.println(e);
        }


        a.punchIn(8);
        a.punchOut(12);

        a.punchIn(13);
        a.punchOut(17);

        for (Employee e : employees){
            System.out.println(e);
        }

    ArrayList<Hotel> hotels = new ArrayList<>();

        Hotel h1 = new Hotel("Hilton", 8, 25);
        Hotel h2 = new Hotel("Days Inn", 5, 20);

        hotels.add(h1);
        hotels.add(h2);

        System.out.println("Hotels list:");
        for (Hotel h : hotels){
            System.out.println(h);
        }

        System.out.println("Hotels after bookRoom");
        h1.bookRoom(3,false);
        h2.bookRoom(2, true);


        for (Hotel h : hotels){
            System.out.println(h);
        }

    }



}
