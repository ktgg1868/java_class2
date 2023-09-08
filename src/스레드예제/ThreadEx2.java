package 스레드예제;

public class ThreadEx2 {
    public static void main(String[] args) {
        
        Thread thread = new MovieThreadEx2();
        thread.setDaemon(true);
        thread.start();

        try { Thread.sleep(3000); } catch (InterruptedException e) {}

    }
}
