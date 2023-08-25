package 기본API클래스_util패키지;

import java.text.*;
import java.util.*;

public class DateEx {
    public static void main(String[] args) {
        
        Date now  = new Date();
        String strNow1 = now.toString();  //toString() => 영문으로 날짜 리턴
        System.out.println(strNow1);

        //원하는 날짜 형식을 지정하여 리턴시키기
        SimpleDateFormat spdf = new SimpleDateFormat("yyyy년 MM월 d일 hh시 mm분 ss초");
        String strNow2 = spdf.format(now);
        System.out.println(strNow2);

    }
}
