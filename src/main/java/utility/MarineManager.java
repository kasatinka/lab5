package utility;

import data.AstartesCategory;
import exceptions.IDAlreadyExistsException;
import exceptions.OutOfIDsException;

import java.util.ArrayList;
import java.util.List;

/*
 * Validation
 * contains partial functionality for commands "add",
 * generates unique IDs
 */
public class MarineManager {
    private List<Integer> IDs;

    public MarineManager() {
        this.IDs = new ArrayList<Integer>();
    }

    public Integer generateID() throws OutOfIDsException {
        for (Integer i = 1; i < Integer.MAX_VALUE; i++) {
            if (!IDs.contains(i)) {
                return i;
            }
        }
        throw new OutOfIDsException();
    }

    public void addIDToList(Integer ID) throws IDAlreadyExistsException {
        if (IDs.contains(ID)) IDs.add(ID);
        else throw new IDAlreadyExistsException();
    }

    public boolean validateName(String name) {
        return name != null && !name.isEmpty();
    }

    public boolean validateX(String x) {
        try {
            Double.parseDouble(x);
            return true;
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    public boolean validateY(String y) {
        try {
            Float.parseFloat(y);
            return true;
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    public boolean validateHealth(Double health) {
        return health == null || health > 0;
    }

    public boolean validateHeartCount(Long heartCount) {
        return heartCount == null || heartCount > 0 && heartCount < 4;
    }

    public boolean validateAstartesCategory(String astartesCategory) {
        for (AstartesCategory c : AstartesCategory.values()) {
            if (c.name().equals(astartesCategory)) return true;
        }
        return astartesCategory == null;
    }

    public boolean validateMeleeWeapon(String meleeWeapon) {
        for (AstartesCategory c : AstartesCategory.values()) {
            if (c.name().equals(meleeWeapon)) return true;
        }
        return meleeWeapon == null;
    }

    public boolean validateChapterName(String name) {
        return name != null && !name.isEmpty();

    }

}
