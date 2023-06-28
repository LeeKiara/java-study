package ch05.accessModifier;

public class Animal {
    private String name;

    // protected 메서드는 다른 패키지에서 사용을 못함
    protected void eat() {
        System.out.println("The animal is eating.");
    }
}
