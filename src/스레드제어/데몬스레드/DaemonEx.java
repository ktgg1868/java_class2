package 스레드제어.데몬스레드;

public class DaemonEx {
    public static void main(String[] args) {
        
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); //AutoSaveThread를 데몬 스레드로 만듬
        autoSaveThread.start();

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {}

        System.out.println("메인 스레드 종료");
        
    }
}
