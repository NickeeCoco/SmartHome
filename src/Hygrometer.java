import java.util.Random;

public class Hygrometer implements Runnable {
    private Monitor listener;
    private Random data = new Random();

    public void registerListener(Monitor listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        while(true) {
            int humidity = data.nextInt(101);

            if(listener != null) {
                listener.update(humidity, "hygrometer");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}