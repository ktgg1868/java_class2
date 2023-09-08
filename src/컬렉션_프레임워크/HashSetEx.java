package 컬렉션_프레임워크;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java"); //같은내용 중복저장 X
        set.add("iBATIS");

        int size = set.size(); //저장된 객체 개수 얻기
        System.out.println("총 객체의 개수: " + size);

        Iterator<String> iterator = set.iterator(); //반복자 얻기
        while(iterator.hasNext()) {

            String element = iterator.next();
            System.out.println("\t" + element);

        }

        //객체 삭제
        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체의 개수: " + set.size());
        
        iterator = set.iterator();
        for(String element : set) {

            System.out.println("\t" + element);

        }

        set.clear();
        if(set.isEmpty()) {

            System.out.println("비어 있음");

        }
    }
}
