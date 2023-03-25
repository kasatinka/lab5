package utility;

import exceptions.OutOfIDsException;

import java.util.List;

/*
 * Ensures nullability and non-nullability, max/min values
 * contains partial functionality for commands "add",
 * generates unique IDs
 */
public class MarineManager {
    private List<Integer> IDs;

    public Integer generateID() throws OutOfIDsException {
        for (Integer i = 1; i < Integer.MAX_VALUE; i++) {
            if (!IDs.contains(i)) {
                return i;
            }
        }
        throw new OutOfIDsException();

    }
}
