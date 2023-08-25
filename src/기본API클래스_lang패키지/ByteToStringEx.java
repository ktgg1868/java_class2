package 기본API클래스_lang패키지;

public class ByteToStringEx {
    public static void main(String[] args) {
        
        byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes, 6, 4); //74d의 인덱스 위치, 4개
        System.out.println(str2);

    }
}
