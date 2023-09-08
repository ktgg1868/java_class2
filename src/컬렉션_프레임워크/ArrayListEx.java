package 컬렉션_프레임워크;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();

        list.add("Java"); //String 객체를 저장
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size(); //저장된 총 객체 수 얻기
        System.out.println("총 객체수: " + size);
        System.out.println();

        String skill = list.get(2); //2반 인텍스의 객체 얻기
        System.out.println("2: " + skill);
        System.out.println();

        for(int i=0; i<list.size(); i++) { //저장된 총 객체 수만큼 루핑

            String str = list.get(i);
            System.out.println(i + ": " + str);

        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");

        System.out.println("데이터베이스 내용 수정 완료");
        System.out.println();

        for(int i=0; i<list.size(); i++) {

            String str = list.get(i);
            System.out.println(i + ": " + str);
            
        }

    }
    
}
