package 기본API클래스.java_langEx;

public class IntegerCompareEx {
    public static void main(String[] args) {
        
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println( obj1 == obj2 ); //true
        System.out.println( obj3 == obj4 ); //false

        //obj3 == obj4 => false가 나오는 이유
        //-128 ~ 127 범위 안은 값을 비교하고, 범위 밖은 각각 할당된 주소를 비교하기 때문

    }
}
