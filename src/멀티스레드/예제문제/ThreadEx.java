package 멀티스레드.예제문제;

public class ThreadEx {
    public static void main(String[] args) {
        
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();

    }
}
