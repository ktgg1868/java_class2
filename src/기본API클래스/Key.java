package 기본API클래스;

public class Key {
    
    public int number;
    public Key(int number) {

        this.number = number;

    }

    //12-18추가
    @Override
    public int hashCode() {

        return number;

    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Key) {

            Key compareKey = (Key) obj;
            if(this.number == compareKey.number) {

                return true;

            }
        }

        return false;

    }
}
