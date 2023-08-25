package 기본API클래스_lang패키지;

public class StringEqualsEx {
    public static void main(String[] args) {
        
        String strVar1 = new String("신민철");
        String strVar2 = "신민철";

        if(strVar1 == strVar2) {

            System.out.println("같은 String 객체 참조");

        } else {

            System.out.println("다른 String 객체 참조");

        }

        if(strVar1.equals(strVar2)) {

            System.out.println("같은 문자열을 가지고 있음");

        } else {

            System.out.println("다른 문자열을 가지고 있음");
            
        }
    }
}
