package 기본API클래스.java_langEx;

public class StringConvertEx {
    public static void main(String[] args) {
        
        String strData1 = "200";
        int intData1 = Integer.parseInt(strData1);

        int intData2 = 150;
        String strData2 = String.valueOf(intData2);

        System.out.println(strData1 + "\n" + intData1 + "\n" + strData2 + "\n" + intData2);

    }
}
