import java.util.Random;

public class Thermometer implements Runnable {
    private Monitor listener;
    private Random data = new Random();

    public void registerListener(Monitor listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        while(true) {
            int temperature = data.nextInt(46);

            if(listener != null) {
                listener.update(temperature, "thermometer");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
