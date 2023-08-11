package 기본API클래스;

import 중첩클래스_예제.Car;

public class ClassEx {
    public static void main(String[] args) {
        
        //클래스 객체 얻기

        //첫번째방법
        Class clazz = Car.class;

        //두번째방법
        //Class calzz = Class.forName("기본API클래스.Car");

        //세번째방법
        //Car car = new Car();
        //Class clazz = car.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());

    }
}
