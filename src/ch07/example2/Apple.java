package ch07.example2;

// Apple과 Banana라는 두 개의 하위 클래스를 만들고, 각각 getColor 메서드를 오버라이드해 각각의 과일 색상을 반환하도록 해주세요.
public class Apple extends Fruit {

    @Override
    public String getColor() {
        super.setColor("Red");
        String color = super.getColor();

        System.out.println("Apple color는 "+ color+" 입니다.");

        return color;

    }
}
