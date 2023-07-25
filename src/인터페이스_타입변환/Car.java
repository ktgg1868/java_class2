package 인터페이스_타입변환;

public class Car {
    
    //인터페이스 타입 필드선언 & 초기 구현 객체 대입
    Tire frontLeftTire = new HankookTire();
    Tire frontRighTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run() {

        //인터페이스에서 정의된 roll()메소드 호출
        frontLeftTire.roll();
        frontRighTire.roll();
        backLeftTire.roll();
        backRightTire.roll();

    }

}
