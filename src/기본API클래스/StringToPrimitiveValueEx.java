package 기본API클래스;

public class StringToPrimitiveValueEx {
    public static void main(String[] args) {
        
        //문자열을 기본타입값으로 변환

        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " +value3);
        
    }
}
