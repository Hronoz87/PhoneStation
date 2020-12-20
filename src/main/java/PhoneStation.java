import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PhoneStation implements Runnable {

    static Queue<String> queue = new ConcurrentLinkedQueue<String>();
    static volatile boolean cycle = true;

    @Override
    public void run() {
        System.out.println("Телефонная станция начала присылать звонки");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                for (int j = 1; j <= 60; j++) {
                    String str = "Телефонный звонок " + j;
                    queue.add(str);
                    System.out.println("Телефонный звонок добавлен: "
                            + str);
                    cycle = false;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
