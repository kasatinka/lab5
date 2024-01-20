package utility;

import data.AstartesCategory;
import exceptions.IDAlreadyExistsException;
import exceptions.OutOfIDsException;

import java.util.ArrayList;
import java.util.List;

/*
 * Validation
 * provides functionality for commands "add",
 * generates unique IDs
 */

public class MarineManager {

    private List<Integer> IDs = new ArrayList<>();

    public boolean validateName(String name) { // String
        return name != null && !name.isEmpty();
    }

    public Integer generateID() throws OutOfIDsException {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
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

    public boolean validateID(String ID) { // Integer
        Integer id;
        try {
            id = Integer.parseInt(ID);
            return IDs.contains(id);
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    public boolean validateX(String x) { // Double
        try {
            Double.parseDouble(x.trim());
            return true;
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    public boolean validateY(String y) { // Float
        try {
            Float.parseFloat(y);
            return true;
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    public boolean validateHealth(String health) { // Double, Nullable
        if (health.isEmpty()) return true;
        try {
            Double d = Double.parseDouble(health);
            return d > 0;
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    public boolean validateHeartCount(String heartCount) { // Long, Nullable
        if (heartCount.isEmpty()) return true;
        try {
            Long l = Long.parseLong(heartCount);
            return l > 0 && l < 4;
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    public boolean validateAstartesCategory(String astartesCategory) { // AstartesCategory, Nullable
        if (astartesCategory.isEmpty()) return true;
        for (AstartesCategory c : AstartesCategory.values()) {
            if (c.name().equals(astartesCategory)) return true;
        }
        return false;
    }

    public boolean validateMeleeWeapon(String meleeWeapon) { // MeleeWeapon, Nullable
        if (meleeWeapon.isEmpty()) return true;
        for (AstartesCategory c : AstartesCategory.values()) {
            if (c.name().equals(meleeWeapon)) return true;
        }
        return false;
    }

    public boolean validateChapterName(String name) { // String, Nullable
        return name != null && !name.isEmpty();
    }

    public boolean validateChapterParentLegion(String parentLegion) { // String, Nullable
        return true;
    }

}
