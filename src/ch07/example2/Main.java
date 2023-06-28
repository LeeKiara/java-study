package ch07.example2;

public class Main {

    public static void main(String[] args) {

        /*
        * Fruit 클래스를 만들고, 이 클래스는 getColor라는 메서드를 포함하게 해주세요.
          그 다음 Apple과 Banana라는 두 개의 하위 클래스를 만들고, 각각 getColor 메서드를 오버라이드해 각각의 과일 색상을 반환하도록 해주세요.
        Apple ->
        "과일의 색상을 알려 드릴께요"
        "사과의 색상은 ~"

        Banana ->
        "과일의 색상을 알려 드릴께요"
        * */
        Apple apple = new Apple();
        apple.getColor();

        System.out.println();
        Banana banana = new Banana();
        banana.getColor();
    }
}
