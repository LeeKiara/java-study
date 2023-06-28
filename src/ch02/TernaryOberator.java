package ch02;

public class TernaryOberator {
    public static void main(String[] args) {
        // 삼항연산자 (항이 3개, 항은 연산의 대상)
        // 1항 연산자 : ++a
        // 2항 연산자 : a + b

        // 3항 연산의 구조
        // 조건식 ? 값1 : 값2
        // 조건식의 값이 true 이면 ? 앞의 값을 반환
        // 조건식의 값이 false 이면 ? 뒤의 값을 반환
        // 조건식은 true/false를 반환할 수 있는 식만 온다.
        int num1 = 10;
        int num2 = 5;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("더 큰 숫자는? " + max);

        // 문제 1: 다음은 삼항 연산자를 사용하여 조건에 따라 값을 반환하는 문제입니다. 결과값을 예측해보세요.
        int x = 10;
        int y = 5;

        int result = (x > y) ? (x + y) : (x - y);   // 15
        System.out.println("문제1 : "+result);

        // 문제 2
        int a = 8;
        int b = 12;

        result = (a % 2 == 0) ? (a / 2) : (b / 2); // 4
        System.out.println("문제2 : "+result);

        // 문제 3
        int num = 7;

        String result2 = (num > 0) ? "양수" : ((num < 0) ? "음수" : "0"); // 양수
        System.out.println("문제3 : "+result2);

    }
}
