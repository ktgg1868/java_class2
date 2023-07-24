package 인터페이스2;

import 인터페이스1.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
    
    private int volume;

    public void turnOn() {
        
        System.out.println("Tv를 켭니다.");
        
    }

    public void turnOff() {

        System.out.println("Tv를 끕니다.");
    
    }

    public void setVolume(int volume) {
        if(volume < RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨: " + volume);

    }

    public void search(String url) {
        System.out.println(url + "를 검색합나다.");
    }
}
