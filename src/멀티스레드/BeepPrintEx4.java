package 멀티스레드;

public class BeepPrintEx4 {
    
    //메인스레드
    public static void main(String[] args) {
        
        Thread thread = new BeepThread();
        //BeepThread 불러오기
        thread.start();

        for(int i=0; i<5; i++) {

            System.out.println("띵");
            try {

                Thread.sleep(500);

            } catch (Exception e) {}

        }
    }
}
