package ch08.exercise;

// 'Singable' 인터페이스를 구현하는 'Bird' 클래스를 작성하세요.
// 'sing' 메서드는 "The bird is singing"라는 메시지를 출력해야 합니다.
public class Bird implements Singable {
    @Override
    public void sing() {
        System.out.println("The bird is singing");
    }
}
