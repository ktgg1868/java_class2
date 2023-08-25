package 기본API클래스_lang패키지;

public class StringLengthEx {
    public static void main(String[] args) {
        
        String ssn = "7306241230123";
        int length = ssn.length();

        if(length == 13) {

            System.out.println("유효한 주민번호를 입력하였습니다.");

        } else {

            System.out.println("유효하지 않은 주민번호를 입력하였습니다.");
            
        }
    }
}
