package 예외클래스;

public class ClassCastExceptionEx {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat); //ClassCastException 발생 원인

    }

    public static void changeDog(ANimal animal) {

        //ClassCastException에러 발생
        /*if(animal instanceof Dog) {

                Dog dog = (Dog) animal; 

        }*/
    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}