package ch08.exercise3;

public class MP3Player implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("MP3 play...");
    }

    @Override
    public void pause() {
        System.out.println("MP3 pause...");

    }

    @Override
    public void stop() {
        System.out.println("MP3 stop...");

    }
}
