package ch08;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체 생성이 불가하다.
//        Shape s = new Shape();

        // 구현체로만 객체 생성이 가능하다.
        Shape s = new Circle(5);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());

        // 회사 경영진이 원을 사각형으로 변경해~
        // 인터페이스르 쓰는 이유 : 변경하기 쉽다. (갈아끼지 ~)
        s = new Rectangle(10, 10);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());
    }
}
