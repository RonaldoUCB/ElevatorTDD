# Elevator Program With Unit Test
- To review the process of THINK, RED, GREEN, REFACTOR process of unit testing go to the commit history of the project where each step is commited.

### Unit Test 
- shouldCreatePerson():   Asserts that the a person is created with a class method.
- shouldStartAtFloorOne():   Assert that initialization of the Elevator class starts at floor number 1.
- shouldAssignPersonToFloor(): Asserts that the random asigning Person floor during initialization of Elevator class is between 1 and 3.
- shouldPersonCallElevator():   Asserts that when a Person calls the Elevator the position of the elevator is changed to the Person's floor.
- shouldPersonSelectFloor():   Assert that Elevator position is cahnged to the selected floor. It also throws an exceptio when selected floor is equeal to current floor.