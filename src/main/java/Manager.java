public class Manager implements Runnable {

    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String str;
        while (PhoneStation.cycle || PhoneStation.queue.size() > 0) {
            if ((str = PhoneStation.queue.poll()) != null)
                System.out.println("Диспечер " + this.name + " обработал заявку: " + str);
            try {
                Thread.sleep(3000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
