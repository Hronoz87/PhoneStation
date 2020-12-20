public class Main {
    public static void main(String[] args) {

        Thread PhoneStation = new Thread(new PhoneStation());
        Thread Manager1 = new Thread(new Manager("1"));
        Thread Manager2 = new Thread(new Manager("2"));
        Thread Manager3 = new Thread(new Manager("3"));
        Thread Manager4 = new Thread(new Manager("4"));

        PhoneStation.start();
        Manager1.start();
        Manager2.start();
        Manager3.start();
        Manager4.start();

    }

}
