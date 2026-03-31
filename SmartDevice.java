interface MusicPlayer {
    void playMusic();
}

interface Camera {
    void takePhoto();
}

class Smartphone implements MusicPlayer, Camera {

    public void playMusic() {
        System.out.println("Playing music...");
    }

    public void takePhoto() {
        System.out.println("Taking photo...");
    }
}

public class SmartDevice {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.playMusic();
        phone.takePhoto();
    }
}