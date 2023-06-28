package ch01;

public class Excercise7 {
    public static void main(String[] args) {
        int number = 1234;

        // 십의 자리 이하 절사
        // 1234 -> 1200, 123 -> 100
        int result = (number / 100) * 100;
        System.out.println(result);

        number = 123;
        result = (number / 100) * 100;
        System.out.println(result);

    }
}
