package ch02;

public class Increments {
    public static void main(String[] args) {
        // increment, decrement
        // 증가 또는 감소 연산
        int a = 10;
        logs(a);

        // 증가연산
        a = a + 1;
        logs("a + 1", a);
        logs("");

        // 변수의 값을 증가
        logs("before a", a);
        logs("++a", ++a);
        logs("after a", a);

        // 후행 연산
        // 현재 처리하고 있는 구문에서는 현재 값을 반영
        // 다음 구문부터는 증가된 값이 반영
        logs("");
        logs("before a", a);
        logs("a++", a++);   // 세미콜런으로 끝나는 1개의 단위를 구문, 식(expression)
        logs("after a", a);

        logs("---------");

        logs(--a);
        logs(a--);
        logs(a);

        // 3, 4, 6, 7, 8, 10번
        int num = 8;
        int result = num++;
        System.out.println(result); // 8

        int num1 = 4;
        int result2 = ++num1;
        System.out.println(result2); //

        int aNum2 = 10;
        int bNum2 = aNum2--;
        System.out.println(bNum2);

        int aNum3 = 3;
        int bNum3 = 4;
        int c = ++aNum3 * bNum3--; // 4 * 4
        System.out.println(c);

    logs("-----------");
        int aNum4 = 5;
        logs("aNum4", aNum4);
        logs("aNum4++", aNum4++);
        logs("++aNum4", ++aNum4);
        aNum4 = 5;
        logs("aNum4++ + ++aNum4", aNum4++ + ++aNum4);

        // 현재 처리하고 있는 구문에서는 현재 값을 반영
        // 다음 구문부터는 증가된 값이 반영
        int aNum5 = 3;
        int bNum5 = aNum5++ + ++aNum5;
        System.out.println(bNum5);  // 8
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
