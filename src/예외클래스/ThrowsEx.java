package 예외클래스;

public class ThrowsEx {
    public static void main(String[] args) {
        
        //findClass()를 예외처리
        try {

            findClass();

        } catch(ClassNotFoundException e) {

            System.out.println("클래스가 존재하지 않습니다.");

        }
    }


    //forName()메소드를 사용하는 findClass()메소드의 예외를 떠넘김
    public static void findClass() throws ClassNotFoundException {

        Class clazz = Class.forName("java.lang.String2");

    }

    //main()메소드에서 throws Exception을 붙이는것은 권장하지 않음
}