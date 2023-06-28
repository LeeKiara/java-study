package ch07.example2;

// 이 클래스는 getColor라는 메서드를 포함하게 해주세요.
public class Fruit {

    private String color;

    public Fruit() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        System.out.println("과일의 색상을 알려 드릴께요.");
        return this.color;
    }
}
