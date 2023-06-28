package ch02;

public class CompareSize {

    public static void main(String[] args) {
        // 크기 비교 연산자 : 두 피연산자 간의 상대적인 크기를 비교
        int a = 5;
        int b = 3;
        // 연산은 왼쪽이 기준이다.
        boolean result1 = (a > b);  // 큰가? greater than, gt
        boolean result2 = (a < b);  // 작은가? less than, lt
        System.out.println(result1);
        System.out.println(result2);

        // a >= b : 크거나 같은가?
        boolean result3 = (a >= b);
        boolean result4 = (a <= b);
    }
}
