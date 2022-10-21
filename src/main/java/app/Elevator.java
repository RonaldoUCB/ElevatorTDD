package app;

import java.util.Random;

public class Elevator {
    // properties
    private final int MAX_FLOOR = 3;
    private final int MIN_FLOOR = 1;
    private int elevatorCurrentFloor;
    private int personCurrentFloor;

    // constructors
    public Elevator() {
        Random rand = new Random();
        this.elevatorCurrentFloor = 1;
        this.personCurrentFloor = rand.nextInt((MAX_FLOOR - MIN_FLOOR) + 1) + MIN_FLOOR;
    }

    // methods
    public Person createPerson() {
        Person person = new Person();
        return person;
    }

    public int callElavatorToFloor() {
        return personCurrentFloor;
    }

    public int getElevatorCurrentFloor() {
        return elevatorCurrentFloor;
    }

    public int getPersonCurrentFloor() {
        return personCurrentFloor;
    }
}
