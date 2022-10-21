package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ElevatorTest {
    @Test
    public void shouldCreatePerson() {
        // Prepare test
        Elevator elevator = new Elevator();

        // Test logic
        Person person = elevator.createPerson();

        // Verify o Assert
        assertEquals(Person.class, person.getClass());
    }

    @Test
    public void shouldStartAtFloorOne() {
        // Prepare test
        Elevator elevator = new Elevator();

        // Test logic
        int elevatorCurrentFloor = elevator.getElevatorCurrentFloor();

        // Verify o Assert
        assertEquals(1, elevatorCurrentFloor);
    }

    @Test
    public void shouldAssignPersonToFloor() {
        // Prepare test
        Elevator elevator = new Elevator();

        // Test logic
        int personCurrentFloor = elevator.getPersonCurrentFloor();

        // Verify o Assert
        assertTrue(personCurrentFloor >= 1 && personCurrentFloor <= 3);
    }

    @Test
    public void shouldPersonCallElevator() {
        // Prepare test
        Elevator elevator = new Elevator();

        // Test logic
        int elevatorAfterCall = elevator.callElavatorToFloor();

        // Verify o Assert
        assertEquals(elevator.getPersonCurrentFloor(), elevatorAfterCall);
    }

    @Test
    public void shouldPersonSelectFloor() throws Exception {
        // Prepare test
        Elevator elevator = new Elevator(1);

        // Test logic
        int elevatorAfterSelect = elevator.selectFloor(2);

        // Verify o Assert
        assertEquals(2, elevatorAfterSelect);
    }
}
