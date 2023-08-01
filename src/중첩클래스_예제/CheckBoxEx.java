package 중첩클래스_예제;

public class CheckBoxEx {
    public static void main(String[] args) {
        
        CheckBox checkBox = new CheckBox();
        checkBox.setOnSelectListener(new BackgroundChangeListener());
        checkBox.select();
        
    }
}
