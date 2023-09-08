package 스레드제어;

import java.awt.Toolkit;

public class SleepEx {
    public static void main(String[] args) {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10; i++) {

            toolkit.beep();

            try {

                Thread.sleep(3000); //3초동안 메인 스레드의 상태를 일시정시 지킴

            } catch (InterruptedException e) {}

        }
    }
}
