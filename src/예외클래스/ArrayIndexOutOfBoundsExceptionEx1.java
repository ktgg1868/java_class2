package 예외클래스;

public class ArrayIndexOutOfBoundsExceptionEx1 {
    public static void main(String[] args) {
        
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);

        //2개의 실행매개값을 주지 않아 예외 발생
    }
}
