package 익명구현객체;

public class Button {
    
    OnClickListener listener; //인터페이스 타입 필드

    //매개 변수의 다향성
    void setOnClickListener(OnClickListener listener) {

        this.listener = listener;

    }

    void touch() {

        listener.onClick(); //구현 객체의 onClick() 메소드 호출

    }

    static interface OnClickListener {

        void onClick();

    }
}
