package 멀티스레드;

public class BeepPrintEx2 {
    public static void main(String[] args) {
        
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask); //작업스레드 생성
        thread.start(); //BeepTask.java 실행

        for(int i=0; i<5; i++) {

            System.out.println("띵");
            try {

                Thread.sleep(500);

            } catch (Exception e) {}

        }
    }
}
