package app;

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
}
