package 예외클래스;

public class NullPointerExceptionEx {
    public static void main(String[] args) {
        
        String data = null;
        System.out.println(data.toString());

        //객체를 사용하려 했으나 객체가 없는 상태라 예외발생
    }
}
