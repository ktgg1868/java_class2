package 기본API클래스_lang패키지;

public class ResourcePathEx {
    public static void main(String[] args) {
        
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("photo1.jpeg").getPath();
        String photo2Path = clazz.getResource("images/photo2.jpeg").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);
        
    }
}
