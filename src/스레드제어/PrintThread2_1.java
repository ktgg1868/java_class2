package 스레드제어;

//Thread.sleep을 사용하지 않고 Thread.interrupted()를 사용하여 무한반복문 벗어나기
public class PrintThread2_1 {

    public void run() {

        while(true) {

            System.out.println("실행 중");
            if(Thread.interrupted()) {

                break;

            }

        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
        
    }
}
