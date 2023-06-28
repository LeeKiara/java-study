package ch02;

public class Logical {
    public static void main(String[] args) {

        // 논리 연산 : 논리적인 조건을 평가하고, 그 결과로 참(true) 또는 거짓(false)을 반환하는 연산
        boolean a = true;
        boolean b = false;

        // AND(논리곱) 연산자 &&(ampersand)
        // && : 둘다 true면 true, 하나라도 false면 false;
        System.out.println(a && b);

        // short-circuit evaluation(단락 평가)
        // 왼쪽값에 의해서 연산 결과를 도출할 수 있으면 오른쪽 값은 판단하지 않음
        System.out.println(b && a); // 첫 번째 피연산자가 거짓이면 두 번째 피연산자의 평가를 수행하지 않음

        // OR(논리합) 연산자 || (pipe)
        // OR 연산은 둘중 하나라도 true면 true, 둘 다 false면 false
        boolean result2 = a || b;
        System.out.println(result2);



    }
}
