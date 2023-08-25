package 기본API클래스_lang패키지;

public class StringSubstringEx {
    public static void main(String[] args) {
        
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
        
    }
}
