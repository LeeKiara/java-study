package ch08.exercise;

// 'Swimmable' 인터페이스를 구현하는 'Fish' 클래스를 작성하세요.
// 'swim' 메서드는 "The fish is swimming"라는 메시지를 출력해야 합니다.
public class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("The fish is swimming");
    }
}
