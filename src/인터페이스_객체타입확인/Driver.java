package 인터페이스_객체타입확인;

public class Driver {
    public void drive(Vehicle vehicle/*(bus객체 + taxi객체)*/) {

        if(vehicle instanceof Bus) { //vehicle 매개변수에 참조하는 객체가 bus인지 확인
            Bus bus = (Bus) vehicle; //참조하는 객체가 bus일 경우, 안전하게 강제타입변환 
            bus.checkFare(); //bus타입으로 강제타입변환을 하는 이유
            
        }

        vehicle.run();

    }
}
