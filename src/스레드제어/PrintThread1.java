package 스레드제어;

public class PrintThread1 extends Thread {

    private boolean stop;

    public void setStop(boolean stop) {

        this.stop = stop;

    }

    public void run() {

        while(!stop) {

            System.out.println("실행 중");

        }

        //stop의 값이 true가 될 때
        System.out.println("자원 정리");
        System.out.println("실행 종료");

    }
    
}
