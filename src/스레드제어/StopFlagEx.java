package 스레드제어;

public class StopFlagEx {
    public static void main(String[] args) {

        PrintThread1 printThread = new PrintThread1();
        printThread.start();

        try { Thread.sleep(500); } catch (InterruptedException e) {}

        printThread.setStop(true); //스레드 종료를 위해 stop필드를 true로 변경
        
    }
}
