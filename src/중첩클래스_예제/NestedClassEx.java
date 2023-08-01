package 중첩클래스_예제;

//멤버클래스의 객체를 생성하는 코드 작성

public class NestedClassEx {
    public static void main(String[] args) {
        
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire();

        //Car.Engine engine = new myCar.Engine();
        Car.Engine engine = new Car.Engine();
    }
}
