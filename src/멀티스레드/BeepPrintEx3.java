package 멀티스레드;

import java.awt.Toolkit;

/*  Runnable beepTask = new BeepTask();
    Thread thread = new Thread(beepTask); */
//위 두줄의 코드를 Runnable익명 구현 객체로 대체하여 작업스레드를 만드는법
public class BeepPrintEx3 {
    public static void main(String[] args) {
        
        Thread thread = new Thread(new Runnable() {
            
            @Override
            public void run() {

                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {

                    toolkit.beep();
                    try {

                        Thread.sleep(500);

                    } catch (Exception e) {}

                }
            }
        });
        thread.start();

        for (int i=0; i<5; i++) {

            System.out.println("띵");
            try {

                Thread.sleep(500);

            } catch (Exception e) {}

        }
    }
}
