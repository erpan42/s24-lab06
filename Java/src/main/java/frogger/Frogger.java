package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // Field for task 1.
    private final Road road;
    private int position;
    
    // Field for task 2. Anything to add/change?
    private final Records records;
    private FroggerID froggerID;

    public Frogger(Road road, int position, Records records, String firstName, String lastName, String phoneNumber, String zipCode, String state, String gender) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.froggerID = new FroggerID(firstName, lastName, phoneNumber, zipCode, state, gender);
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    // TODO: Do you notice any issues here? methods moved to Road.java for encapsulation
    // Feature envy: some of the functionality in the Frogger class might more appropriately belong to the Road class
    // The Frogger class is overly reliant on the internal details of the Road class when it had methods
    // here with implementation details.


    /**
     * Records Frogger to the list of records.
     * 
     * @return true if record successful, else false.
     */
    public boolean recordMyself() {
      boolean success = records.addRecord(froggerID);
      return success;
    }

}
