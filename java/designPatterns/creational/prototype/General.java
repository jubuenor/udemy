package designPatterns.creational.prototype;

/**
 * General
 */
public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoraleBoost";
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

}
