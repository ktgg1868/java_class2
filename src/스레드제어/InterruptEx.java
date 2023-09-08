package 스레드제어;

public class InterruptEx {
    public static void main(String[] args) {
        
        Thread thread = new PrintThread2();
        thread.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        thread.interrupt(); //스레드를 종료하기 위해 InterruptedException을 발생시킴

    }
}
