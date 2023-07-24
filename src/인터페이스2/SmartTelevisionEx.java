package 인터페이스2;

import 인터페이스1.RemoteControl;

public class SmartTelevisionEx {
    public static void main(String[] args) {

        SmartTelevision tv = new SmartTelevision();
        
        RemoteControl rc = tv;
        Searchable searchable = tv;

    }
    
}
