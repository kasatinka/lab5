package data;

import java.util.Date;
import java.util.Objects;

public class SpaceMarine implements Comparable<SpaceMarine> {

    private Integer id;
    private String name;
    private Coordinates coordinates;
    private java.util.Date creationDate;
    private Double health;
    private Long heartCount;
    private AstartesCategory category;
    private MeleeWeapon meleeWeapon;
    private Chapter chapter;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Long getHeartCount() {
        return heartCount;
    }

    public void setHeartCount(Long heartCount) {
        this.heartCount = heartCount;
    }

    public AstartesCategory getCategory() {
        return category;
    }

    public void setCategory(AstartesCategory category) {
        this.category = category;
    }

    public MeleeWeapon getMeleeWeapon() {
        return meleeWeapon;
    }

    public void setMeleeWeapon(MeleeWeapon meleeWeapon) {
        this.meleeWeapon = meleeWeapon;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpaceMarine that = (SpaceMarine) o;

        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        if (!coordinates.equals(that.coordinates)) return false;
        if (!creationDate.equals(that.creationDate)) return false;
        if (!Objects.equals(health, that.health)) return false;
        if (!Objects.equals(heartCount, that.heartCount)) return false;
        if (category != that.category) return false;
        return meleeWeapon == that.meleeWeapon;
    }

    @Override
    public String toString() {
        return "Space Marine : " + id +
                "\n Name: " + name +
                "\n Location: " + coordinates +
                "\n Created on: " + creationDate +
                "\n Health: " + health +
                "\n Heart count: " + heartCount +
                "\n Category: " + category +
                "\n Melee weapon: " + meleeWeapon +
                "\n Chapter: " + chapter;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + coordinates.hashCode();
        result = 31 * result + creationDate.hashCode();
        result = 31 * result + (health != null ? health.hashCode() : 0);
        result = 31 * result + (heartCount != null ? heartCount.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (meleeWeapon != null ? meleeWeapon.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(SpaceMarine marine) {
        return id.compareTo(marine.getId());
    }

}