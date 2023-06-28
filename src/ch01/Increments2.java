package ch01;

public class Increments2 {

    public static void main(String[] args) {

        // 변수 x를 5로 초기화하고, 후위 증감 연산자를 사용하여 x의 값을 출력한 후, x의 값을 1만큼 증가시키세요.
        int num1 = 5;
        logs("num++", num1++);
        int result1 = num1;
        logs("result1", result1);
        logs("--------------");

        // 변수 y를 7로 초기화하고, 전위 증감 연산자를 사용하여 y의 값을 출력한 후, y의 값을 2만큼 감소시키세요.
        logs("변수 y를 7로 초기화하고, 전위 증감 연산자를 사용하여 y의 값을 출력한 후, y의 값을 2만큼 감소시키세요.");
        int y = 7;
        logs("++y", ++y);
        y--;
        y--;
        logs("결과", y);

        // 변수 a를 10으로 초기화하고, 후위 증감 연산자를 사용하여 a의 값을 출력한 후, a의 값을 3만큼 감소시키세요.
        logs("\n변수 a를 10으로 초기화하고, 후위 증감 연산자를 사용하여 a의 값을 출력한 후, a의 값을 3만큼 감소시키세요.");
        int a = 10;
        logs("a++", a++); // 10
        a--; // 11, 10
        a--; // 10, 9
        a--; // 9, 8
        a--; // 8, 7
        logs("결과", a);

        // 변수 b를 15로 초기화하고, 전위 증감 연산자를 사용하여 b의 값을 출력한 후, b의 값을 4만큼 증가시키세요.
        logs("\n변수 b를 15로 초기화하고, 전위 증감 연산자를 사용하여 b의 값을 출력한 후, b의 값을 4만큼 증가시키세요.");
        int b = 15;
        logs("++b", ++b); // 16
        b--;
        b--;
        b--;
        b--;
        logs("결과", b);

        /*





변수 i를 3으로 초기화하고, 후위 증감 연산자를 사용하여 i의 값을 출력한 후, i의 값을 2만큼 증가시키세요.

변수 j를 6으로 초기화하고, 전위 증감 연산자를 사용하여 j의 값을 출력한 후, j의 값을 1만큼 감소시키세요.

변수 n을 8로 초기화하고, 후위 증감 연산자를 사용하여 n의 값을 출력한 후, n의 값을 3만큼 감소시키세요.

변수 m을 12로 초기화하고, 전위 증감 연산자를 사용하여 m의 값을 출력한 후, m의 값을 5만큼 증가시키세요.

변수 p를 2로 초기화하고, 후위 증감 연산자를 사용하여 p의 값을 출력한 후, p의 값을 4만큼 증가시키세요.

변수 q를 9로 초기화하고, 전위 증감 연산자를 사용하여 q의 값을 출력한 후, q의 값을 2만큼 감소시키세요.
         */
    }
    public static void logs(int values) {
        System.out.println(values);
    }

    public static void logs(String values) {
        System.out.println(values);
    }

    public static void logs(String title, String values) {
        System.out.println(title+" : "+values);
    }
    public static void logs(String title, int values) {
        System.out.println(title+" : "+values);
    }

}
