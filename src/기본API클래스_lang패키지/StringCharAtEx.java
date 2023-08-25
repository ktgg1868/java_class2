package 기본API클래스_lang패키지;

public class StringCharAtEx {
    public static void main(String[] args) {
        
        String ssn = "010614-1230123";
        char sex = ssn.charAt(7);
        switch (sex) {

            case '1':
            case '3':
                System.out.println("남성입니다.");
                break;
            
            case '2':
            case '4':
                System.out.println("여성입니다.");
                break;

        }
    }
}
