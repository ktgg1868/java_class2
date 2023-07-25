package 인터페이스_강제타입변환;

public class VehicleEx {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Bus();
            
        vehicle.run();
        //vehicle.checkFare(); Vehicle인터페이스에 checkFare()가 없음

        Bus bus = (Bus) vehicle; //타입강제변환

        bus.run();
        bus.checkFare();
        
    }
}
