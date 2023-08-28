package 멀티스레드;

public class ThreadB extends Thread {
    
    public void run() {

        //ThreadB 실행내용
        for(int i=0; i<2; i++) {

            System.out.println(getName()/* 스레드 이름 얻기 */ + "가 출력한 내용");

        }
    }
}
