package 인터페이스_타입변환;

public class CarEx {
    public static void main(String[] args) {
        
        Car myCar = new Car();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRighTire = new KumhoTire();

        myCar.run();

    }
}
