package 멀티스레드.공유객체;

public class MainThreadEx {
    public static void main(String[] args) {
        
        //Calculator동기화X calculator = new Calculator동기화X();
        Calculator calculator = new Calculator();

        User1 user1 = new User1(); //User1 스레드 생성
        user1.setCalculator(calculator); //공유 객체 설정
        user1.start(); //User1 스레드 시작

        User2 user2 = new User2(); //User2 스레드 생성
        user2.setCalculator(calculator); //공유 개체 설정
        user2.start(); //User2 스레드 시작

    }
}
