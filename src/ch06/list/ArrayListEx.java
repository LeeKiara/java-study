package ch06.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();

        list.add(new Circle(3));
        list.add(new Circle(5));
        list.add(new Rectangle(5.0,6.0));

        System.out.println("전체 도형의 둘레의 합 : "+sumArea(list));
    }

    private static double sumArea(List<Shape> list) {
        double sumArea = 0;

        for(Shape s : list) {
            sumArea += s.calculateArea();
        }

        return  sumArea;
    }
}

class Circle implements Shape {
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

class Rectangle implements Shape, Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        System.out.println("Rectangle 면적 구하기 : this.width * this.height => "+this.width +" * "+ this.height +" => "+(this.width * this.height));

        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width * this.height);
    }

    @Override
    public void drawLines() {

    }
}

interface Shape {
    // 면적 계산
    double calculateArea();
    // 둘레 계산
    double calculatePerimeter();

}

interface Drawable {
    void drawLines();
}