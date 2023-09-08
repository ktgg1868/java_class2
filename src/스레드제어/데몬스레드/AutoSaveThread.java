package 스레드제어.데몬스레드;

//데몬스레드 => 주 스레드를 보조하는 역할을 수행하는 스레드, 주 스레드가 종료되면 강제적으로 종료되는 스레드
public class AutoSaveThread  extends Thread {

    public void save() {

        System.out.println("작업 내용을 저장함");

    }

    @Override
    public void run() {

        while(true) {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                break;

            }

            save();
            
        }
    }
    
}
