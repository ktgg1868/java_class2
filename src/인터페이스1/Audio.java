package 인터페이스1;

public class Audio implements RemoteControl {
    
    //필드
    private int volume;

    //turnOn()(추상메소드)의 실체 메소드
    public void turnOn() {

        System.out.println("Audio를 켭니다.");

    }

    //turnOff()(추상메소드)의 실체 메소드
    public void turnOff() {

        System.out.println("Audio를 끕니다.");

    }

    //setVolume()(추상메소드)의 실체 메소드
    public void setVolume(int volume) {
        //인터페이스 상수를 이용해서 volume필드의 값 제한
        if(volume < RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 Audio 볼륨: " + volume);

    }
}
