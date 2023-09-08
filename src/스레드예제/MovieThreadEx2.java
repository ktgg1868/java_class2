package 스레드예제;

public class MovieThreadEx2 extends Thread {

    @Override
    public void run() {
        
        while(true) {

            System.out.println("동영상을 재생합니다.");

            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            
        }
    }
    
}
