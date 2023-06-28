package ch08;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        System.out.println("Circle 면적 구하기 : Math.PI * radius * radius => "+Math.PI +" * "+ radius +" * "+ radius +" => "+(Math.PI * radius * radius));
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
