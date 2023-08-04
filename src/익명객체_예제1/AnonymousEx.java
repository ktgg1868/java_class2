package 익명객체_예제1;

public class AnonymousEx {
    public static void main(String[] args) {
        
        Anonymous anony = new Anonymous();
        anony.field.start();
        anony.method1();
        anony.method2(
            
        new Worker() {
            
            @Override
            public void start() {

                System.out.println("테스트를 시작합니다.");

            }

        }
        
        );
    }
}
