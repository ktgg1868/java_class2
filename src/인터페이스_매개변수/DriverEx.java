package 인터페이스_매개변수;

public class DriverEx {
    public static void main(String[] args) {
        
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
        
    }
}
