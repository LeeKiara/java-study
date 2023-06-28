package ch05.overloading;

public class Main {

    public static void main(String[] args) {
        Operator operator = new Operator();
        int x = 10;
        int y = 50;
        int result = operator.multiply(x, y);
        System.out.println(result);

        double xx = 10.9;
        double yy = 50.8;
        double result2 = operator.multiply(xx, yy);
        System.out.println(result2);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int malResult = operator.multiply(arr);
        System.out.println(malResult);
    }
}
