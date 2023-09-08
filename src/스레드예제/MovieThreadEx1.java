package 스레드예제;

public class MovieThreadEx1 extends Thread {

    @Override
    public void run() {

        while(true) {

            System.out.println("동영상을 실행합니다.");

            if(this.isInterrupted()) {

                break;
                
            }
        }
    }
    
}
