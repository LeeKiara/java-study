package ch04;

import java.util.Scanner;

// default
class TestClass {
    // default 접근제한 : 패키지범위, 상속(x)
    void performTest() {

    }
}
public class ArrayEx {
    public static void main(String[] args) {
        // 사용자로부터 콘솔창(터미널)에서 키보드로 입력을 받을 때
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수값을 입력하세요: ");

        // 정수 값 1개를 입력 받을수 있음
        // 커서(프롬프트) 깜빡이고 있는것은 입력 대기 중
        int inputNum = scanner.nextInt();

        System.out.println("입력 받은 숫자는:"+inputNum);
    }
}
