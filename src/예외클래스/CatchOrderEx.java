package 예외클래스;

public class CatchOrderEx {
    
    public static void main(String[] args) {
        
        try {

            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(value1 + " + " + value2 + " = " + result);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("실행 매개값의 수가 부족합니다.");

        } catch(Exception e) {

            System.out.println("실행에 문제가 발생하였습니다.");

        } finally {

            System.out.println("다시 실행하세요.");
            
        }
    }
}
