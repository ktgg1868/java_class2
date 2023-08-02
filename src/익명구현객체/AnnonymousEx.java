package 익명구현객체;

public class AnnonymousEx {
    public static void main(String[] args) {
        
        Annonymous anony = new Annonymous();

        //익명 객체 필드 사용
        anony.field.turnOn();

        //익명 객체 로컬변수 사용
        anony.method1();

        //익명 객체매개값 사용
        anony.method2(

            new RemoteControl() {
                @Override
                public void turnOn() {

                    System.out.println("Smart Tv를 켭니다.");

                }

                @Override
                public void turnOff() {

                    System.out.println("Smart Tv를 끕니다.");

                }
            }
            
        );
    }
}
