package 기본API클래스_lang패키지.java_langEx;

import java.util.HashMap;

public class StudentEx {
    public static void main(String[] args) {
        
        //Student 키로 총점을 저장하는 HashMap 객체 생성
        HashMap<Student, String> hashMap = new HashMap<Student, String>();

        //new Student("1")의 점수를 95로 저장
        hashMap.put(new Student("1"), "95");

        //new Student("1")로 저장한 점수 읽어오기
        String score = hashMap.get(new Student("1"));
        System.out.println("1번 학생의 점수: " + score);

    }
}
