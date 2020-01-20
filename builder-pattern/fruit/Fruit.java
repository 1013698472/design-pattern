package fruit;

/**
 * @author ChenVF
 * date 2020-01-20
 */
public class Fruit {
    public String type;
    public boolean state;
    public boolean isPack;

    @Override
    public String toString() {
        return "Fruit{" +
                "type='" + type + '\'' +
                ", state='" + state + '\'' +
                ", isPack=" + isPack +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isPack() {
        return isPack;
    }

    public void setPack(boolean pack) {
        isPack = pack;
    }

    public Fruit() {
    }

    public Fruit(String type, boolean state, boolean isPack) {
        this.type = type;
        this.state = state;
        this.isPack = isPack;
    }
}
