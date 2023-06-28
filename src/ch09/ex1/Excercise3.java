package ch09.ex1;

public class Excercise3 {
    public static void main(String[] args) {
        BaseBallPlayer baseBallPlayer = new BaseBallPlayer();
        baseBallPlayer.play();
    }

}

interface Player {
    void play();
}

class FootBallPlyer implements Player {

    public void play() {
        System.out.println("축구를 합니다.");
    }
}
class BaseBallPlayer implements Player {

    BaseBallPlayer() {

    }

    @Override
    public void play() {
        System.out.println("야구를 합니다.");
    }
}


