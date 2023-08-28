package 멀티스레드.공유객체;

public class Calculator {
    
    private int memory;

    public int getMemory() {

        return memory;

    }

    /* synchronized => 동기화 메소드 만들기 위해 사용하는 키워드
     * ex) public synchronized void method() {
     *      임계 영역; (단 하나의 스레드만 실행)
     * } */
    //동기화 메소드만들기
    public synchronized void setMemory(int memory) {

        this.memory = memory;

        try {

            Thread.sleep(2000);

        } catch(InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
