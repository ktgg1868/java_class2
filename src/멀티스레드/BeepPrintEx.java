package 멀티스레드;

import java.awt.Toolkit;

//메인스레드만 사용한 경우
public class BeepPrintEx {
    public static void main(String[] args) {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //toolkit 객체 얻기

        for(int i=0; i<5; i++) {

            toolkit.beep(); //비프음 발생
            try {

                Thread.sleep(500); //0.5초 일시 정지

            } catch (Exception e) {}

        }

        for(int i=0; i<5; i++) {

            System.out.println("띵");
            try {

                Thread.sleep(500); //0.5초 일시 정지

            } catch (Exception e) {}

        }
    }
}
