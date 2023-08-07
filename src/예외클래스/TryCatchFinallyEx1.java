package 예외클래스;

public class TryCatchFinallyEx1 {
    public static void main(String[] args) {
        
        try {

            Class clazz = Class.forName("java.lang.String2");

        } catch(ClassNotFoundException e) {

            System.out.println("클래스를 찾을 수 없습니다.");

        }
    }
}
