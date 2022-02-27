public class Monitor implements Listener {
    @Override
    public void update(int data, String origin) {
        if(origin == "thermometer") {
            System.out.println("[Thermometer]: " + data + " degree");
        } else {
            System.out.println("[Hygrometer]: " + data + "%");
        }
    }
}