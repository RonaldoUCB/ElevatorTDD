package app;

public class Elevator {
    // properties
    private int elevatorCurrentFloor;

    // constructors
    public Elevator() {
        this.elevatorCurrentFloor = 1;
    }

    // methods
    public Person createPerson() {
        Person person = new Person();
        return person;
    }

    public int getElevatorCurrentFloor() {
        return elevatorCurrentFloor;
    }
}
