package 중첩인터페이스;

public class Button {
    
    OnClickListener listener; //인터펭이스 타입 필드

    //매개 변수의 다형성
    void setOnClickListener(OnClickListener listener) {

        this.listener = listener; 

    }

    void touch() {

        listener.onClick(); //onClick() 메소드 호출

    }

    //중첩 인터페이스
    static interface OnClickListener {

        void onClick();

    }
    
}
