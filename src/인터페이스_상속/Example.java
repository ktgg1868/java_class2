package 인터페이스_상속;

public class Example {
    public static void main(String[] args) {
        
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA(); // InterfaceA변수 => methodA만 호출 가능
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB(); // InterfaceB변수 => methodB만 호출 가능
        System.out.println();

        InterfaceC ic = impl; // InterfaceC변수 => methodA,B,C 모두 호출 가능
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }

}
