package ch02;

public class Arithmetic {

    public static void main(String[] args) {

        // Arithmetic(산술) 연산(operation)
        // 주요한 산술 연산자로 : 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 그리고 나머지(modulo, %)
        // 컴퓨터공학: 수학 > 이산수학(discrete mathematics), 선형대수학(linear algebra)
        // 이산수학 : 수열, 순열, 조합, 경우의 수
        // 패턴(규칙)을 찾고, 수식화 한다.
        // 선형대수학 : 행렬, 벡터 > 게임그래픽스에서 많이 씀, 인공지능

        // 덧셈(+)
        int a = 10;
        int b = 5;
        int sum = a + b;
        int sum1 = 10 + b;

        System.out.println(sum);
        System.out.println(sum1);

        // 빼기, -
        int difference = a - b;
        logs("빼기: "+a+"-"+b+"", difference+"");

        // 곱셈, *(별표, asterisk)
        // product, multiply
        int product = a * b;
        logs("곱셈, *", product+"");

        // 나누기, /
        int quotient = a / b;
        logs("나누기, /", quotient+"");

        // 나머지, %(remainder)
        int remainer = a % b;
        logs("나머지: "+a+"%"+b, remainer+"");

        int aPlus = 5;
        int bPlus = 2;
        int c = aPlus + bPlus;
        System.out.println(c); // 7
        logs("문제1", c+"");

        int x = 10;
        int y = x % 3;
        System.out.println(y); // 1
        logs("문제2", y+"");

        int aPlus2 = 7;
        int bPlus2 = 3;
        int cSum = (aPlus2 + bPlus2) * 2;
        System.out.println(cSum); // 20
        logs("문제3", cSum+"");

        int aPlus3 = 7;
        int bPlus3 = 2;
        int cDiv = aPlus3 / bPlus3; // 3
        int dMod = aPlus3 % bPlus3; // 1
        System.out.println(cDiv + " " + dMod);
        logs("문제4", cDiv + " " + dMod);

        // 대입연산
        // =(할당(assignment), 대입)

    }

    public static void logs(String title, String values) {

        System.out.println(title+" : "+values);

    }
}
