package ch08.exercise3;

public class Main {
    public static void main(String[] args) {
        MP3Player mp3 = new MP3Player();
        mp3.play();
        mp3.pause();
        mp3.stop();

        StreamingMusicPlayer smp = new StreamingMusicPlayer();
        smp.play();
        smp.pause();
        smp.stop();
    }
}
