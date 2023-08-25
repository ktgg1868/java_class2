package 기본API클래스_lang패키지.java_langEx;

public class ByteToStringEx {
    public static void main(String[] args) {
        
        byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
        //String str = bytes.toString(); (X) 오답 > 객체의 문자정보를 리턴 => 이곳에선 사용X
        String str = new String(bytes);

        System.out.println(str);

    }
}
