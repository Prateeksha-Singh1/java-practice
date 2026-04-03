interface Camera {
    void clickPhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Device {
    void powerOn() {
        System.out.println("Device is ON");
    }
}

class Smartphone extends Device implements Camera, MusicPlayer {

    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class HybridDemo {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.powerOn();
        s.clickPhoto();
        s.playMusic();
    }
}