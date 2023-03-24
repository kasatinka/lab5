package data;

import java.util.Objects;

public class Chapter {
    private String name;
    private String parentLegion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chapter chapter = (Chapter) o;

        if (!name.equals(chapter.name)) return false;
        return Objects.equals(parentLegion, chapter.parentLegion);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (parentLegion != null ? parentLegion.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public String getParentLegion() {
        return parentLegion;
    }
}
