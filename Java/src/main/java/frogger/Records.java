package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }
    // Long Parameter List fixed for task 2
    public boolean addRecord(FroggerID froggerID) {
        if (this.records.contains(froggerID)) {
            return false; // Record already exists
        }
        this.records.add(froggerID);
        return true;
    }
}