package 컬렉션_프레임워크;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
    
        List<String> list1 = new ArrayList<String>();

        /*
         * ArrayList랑 사용법은 동일, 내부구조는 완전히 다름
         * ArrayList => 내부 배열에 객체를 저장해서 관리
         * LinkedList => 인접 참조를 링크해서 체인처럼 관리
         */
        
        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {

            list1.add(0, String.valueOf(i));

        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {

            list2.add(0, String.valueOf(i));

        }

        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");

    }
}
