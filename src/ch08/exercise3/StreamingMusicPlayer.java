package ch08.exercise3;

public class StreamingMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("StreamingMusic play");
    }

    @Override
    public void pause() {
        System.out.println("StreamingMusic pause");

    }

    @Override
    public void stop() {
        System.out.println("StreamingMusic stop");

    }
}
