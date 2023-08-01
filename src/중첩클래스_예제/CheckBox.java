package 중첩클래스_예제;

public class CheckBox {
    
    OnSelectListener listener;

    void setOnSelectListener(OnSelectListener listener) {

        this.listener = listener;

    }

    void select() {

        listener.onSelect();

    }

    static interface OnSelectListener {

        void onSelect();

    }
}
