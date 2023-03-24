package data;

/**
 * X-Y coordinates.
 */
public class Coordinates {
    private final double x;
    private final Float y;

    public Coordinates(double x, Float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return X-coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * @return Y-coordinate.
     */
    public Float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "X:" + x + " Y:" + y;
    }

    @Override
    public int hashCode() {
        return y.hashCode() + (int) x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Coordinates coordinatesObj) {
            return (x == coordinatesObj.getX()) && y.equals(coordinatesObj.getY());
        }
        return false;
    }
}
