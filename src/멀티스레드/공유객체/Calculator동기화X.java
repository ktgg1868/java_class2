package 멀티스레드.공유객체;

public class Calculator동기화X {
    
    private int memory;

    public int getMomory() {

        return memory;

    }

    public void setMemory(int memory) { //계산기 메모리에 값을 저장하는 메소드

        //매개값을 memory필드에 저장
        this.memory = memory;

        //스레드를 2초동안 일시정지 시킴
        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() /* 메모리 이름 얻기 */ + ": " + this.memory/* 메모리 값 */);

    }
}
