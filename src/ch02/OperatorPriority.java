package ch02;

public class OperatorPriority {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 단항 (++, --, +/-, !)
        // 산술 (+,-,*,/,%)
        // 크기비교 (>, >=, <, <=)
        // 동치비교 (==, !=)
        // 논리연산 (&&, ||)
        // 대입연산 (+=, -=, *=, /=, %=)

        int a = 5;
        int b = 3;
        int c = 2;
        int result = a + b * c; // 11

        System.out.println(result);


        int x = 10;
        int y = 5;
        int z = x % y + x / y; // 2

        System.out.println(z);

        a = 2;
        b = 3;
        c = 4;
        boolean isResult = a < b && b < c; // t and t
        System.out.println(isResult); // true

        x = 5;
        y = 10;
        z = 15;
        isResult = x > y || y > z;  // f or f
        System.out.println(isResult); // false

        a = 4;
         b = 2;
         c = 6;
         result = a * b / c;    // 8 / 6 = 1.32 > 정수형이니... 1
        System.out.println(result);
//
         x = 2;
         y = 3;
         z = 4;
         result = x + y * z++; // 2 + 3 * 4, z++는 현재 값인 4를 result에 사용한 후에 증가
        System.out.println(result); // 14
//
        a = 3;
         b = 5;
         c = 2;
         result = ++a * b-- / c; // 4 * 5 / 2
        System.out.println(result); // 10
//
//        int a = 5;
//        int b = 3;
//        int c = 2;
//        boolean result = a > b && a > c++;
//
//        int x = 10;
//        int y = 2;
//        int z = 5;
//        int result = x / y % z;
//
//        int a = 4;
//        int b = 2;
//        int c = 6;
//        int result = a + b * --c;
    }
}
