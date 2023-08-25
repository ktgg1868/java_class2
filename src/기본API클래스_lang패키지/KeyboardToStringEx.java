package 기본API클래스_lang패키지;

import java.io.IOException;

public class KeyboardToStringEx {
    public static void main(String[] args) throws IOException{
        
        byte[] bytes = new byte[100]; //배열생성

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes); //배열을 읽은 바이트저장, 읽은 바이트수 리턴
        
        String str = new String(bytes, 0, readByteNo-2); //배열을 문자열로 변환
        System.out.println(str);

    }
}
