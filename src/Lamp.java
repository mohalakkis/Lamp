public class Lamp {
    private boolean on;

    public Lamp(boolean initialState) {
        this.on = initialState;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        setOn(true);
    }

    public void turnOff() {
        setOn(false);
    }
    public boolean getOn() {
        return on;
    }

    public void showState() {
        System.out.println("Lâmpada está " + (getOn() ? "ligada" : "desligada"));
    }
}
