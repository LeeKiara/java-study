package ch08;

// 2개 인터페이스
public class Rectangle implements Shape, Drawable {
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
