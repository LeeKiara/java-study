package ch08.exercise;

// 'Runnable' 인터페이스를 구현하는 'Rabbit' 클래스를 작성하세요.
// 'run' 메서드는 "The rabbit is running fast!"라는 메시지를 출력해야 합니다.
public class Rabbit implements Runnable {

    @Override
    public void run() {
        System.out.println("The rabbit is running fast!");
    };
}
