package 스레드예제;

public class ThreadEx1 {
    public static void main(String[] args) {
        
        Thread thread = new MovieThreadEx1();
        thread.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        thread.interrupt();
        
    }
    
}
