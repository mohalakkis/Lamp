//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Lamp lamp = new Lamp(true);

     lamp.turnOn();
     lamp.showState();

     lamp.turnOff();
     lamp.showState();
    }
}