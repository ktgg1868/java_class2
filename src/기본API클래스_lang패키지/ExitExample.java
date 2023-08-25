package 기본API클래스_lang패키지;

public class ExitExample {
    public static void main(String[] args) {
        
        for(int i=0; i<10; i++) {

            if(i==5) {

                //코드 강제종료 => 16라인의 코드출력X
                System.exit(0);
                //break;
            }
        }

        System.out.println("마무리 코드");

    }
}
