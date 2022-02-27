import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Thermometer thermometer = new Thermometer();
        Hygrometer hygrometer = new Hygrometer();

        Monitor monitor = new Monitor();

        thermometer.registerListener(monitor);
        hygrometer.registerListener(monitor);

        Thread t1 = new Thread(thermometer);
        Thread t2 = new Thread(hygrometer);

        t1.start();
        t2.start();
    }
}