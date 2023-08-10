package 기본API클래스;

public class Member1Ex {
    public static void main(String[] args) {
        
        Member1 obj1 = new Member1("blue");
        Member1 obj2 = new Member1("blue");
        Member1 obj3 = new Member1("red");

        if(obj1.equals(obj2)) {

            System.out.println("obj1과 obj2는 동일합니다.");

        } else {

            System.out.println("obj1과 obj2는 같지 않습니다.");

        }

        if(obj1.equals(obj3)) { //매개값이 Member타입이지만, id필드값이 다르므로 false

            System.out.println("obj1과 obj3는 동일합니다.");

        } else {

            System.out.println("obj1과 obj3는 같지 않습니다.");

        }
    }
}
