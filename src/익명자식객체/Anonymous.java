package 익명자식객체;

public class Anonymous {
    
    //필드 초기값 대입
    Person field = new Person() {

        //필드값 => 익명 객체 대입
        void work() {

            System.out.println("출근합니다.");

        }

        @Override
        void wake() {

            System.out.println("6시에 일어납니다.");
            work();

        }

    };

    void method1() {

        Person localVar = new Person() {

            void walk() {

                System.out.println("산책합니다.");

            }

            @Override

            void wake() {

                System.out.println("7시에 일어납니다.");
                walk();

            }

        };

        localVar.wake();

    }

    void method2(Person person) {

        person.wake();

    }
}
