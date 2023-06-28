package ch03;

public class LoopEx {

    public static void main(String[] args) {
        // 문제 1: 1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요.
        for (int i=1; i < 11; i++)  {
            System.out.println(i);
        }

        // 문제 2: 1부터 100까지의 숫자 중에서 홀수만 출력하는 프로그램을 작성하세요.
        System.out.println("문제 2: 1부터 100까지의 숫자 중에서 홀수만 출력하는 프로그램을 작성하세요.");
        for (int i=1; i < 100; i++)  {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        // 문제 3: 구구단 중 5단을 출력하는 프로그램을 작성하세요.
        System.out.println("문제 3: 구구단 중 5단을 출력하는 프로그램을 작성하세요.");
        for (int i=2; i < 10; i++)  {
            if(i == 5) {
                for (int j = 1; j < 9; j++) {
                    System.out.println(i + "*" + j + " = " + (i * j));
                }
            }
        }

        // 문제 4: 10부터 1까지 역순으로 출력하는 프로그램을 작성하세요.
        System.out.println("문제 4: 10부터 1까지 역순으로 출력하는 프로그램을 작성하세요.");
        for (int i=10; i >= 1; i--)  {
            System.out.println(i);
        }

        // 문제 5: 1부터 100까지의 숫자 중 3의 배수인 숫자들의 합을 계산하는 프로그램을 작성하세요.
        System.out.println("문제 5: 1부터 100까지의 숫자 중 3의 배수인 숫자들의 합을 계산하는 프로그램을 작성하세요.");
        int sum = 0;
        for (int i=1; i < 100; i++)  {
            if(i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // 문제 6: 0부터 100까지의 숫자 중에서 3의 배수이거나 5의 배수인 숫자들을 출력하는 프로그램을 작성하세요.
        System.out.println("문제 6: 0부터 100까지의 숫자 중에서 3의 배수이거나 5의 배수인 숫자들을 출력하는 프로그램을 작성하세요.");
        for (int i=0; i <= 100; i++)  {
            if(i == 0)
                continue;

            if(i % 3 == 0 || i % 5 == 0 ) {
                System.out.println(i);
            }
        }

        // 문제 7: 사용자로부터 숫자를 입력받아, 해당 숫자까지의 합을 계산하는 프로그램을 작성하세요.
        System.out.println("// 문제 7: 사용자로부터 숫자를 입력받아, 해당 숫자까지의 합을 계산하는 프로그램을 작성하세요.");
        int sum2 = 0;
        int endNum = 10;

        for (int i = 1; i <= endNum; i++) {
            sum2 += i;
        }

        System.out.println(sum2);

        // 문제 8: 0부터 10까지의 숫자를 거꾸로 출력하는 프로그램을 작성하세요
        System.out.println("문제 8: 0부터 10까지의 숫자를 거꾸로 출력하는 프로그램을 작성하세요");
        for (int i=10; i >= 0; i--)  {
            System.out.println(i);
        }

        // 문제 9: 구구단 중 7단을 거꾸로 출력하는 프로그램을 작성하세요.
        System.out.println("문제 9: 구구단 중 7단을 거꾸로 출력하는 프로그램을 작성하세요.");
        for (int i=2; i < 10; i++)  {
            if(i == 7) {
                for (int j = 9; j > 0; j--) {
                    System.out.println(i + "*" + j + " = " + (i * j));
                }
            }
        }

        // 문제 10: 별 찍기 문제: 다음과 같이 별을 출력하는 프로그램을 작성하세요.
        /*
         *
         **
         ***
         ****
         *****

          */
        System.out.println("문제 10: 별 찍기 문제: 다음과 같이 별을 출력하는 프로그램을 작성하세요.");
//        String star = "";
//        for (int i=0; i < 5; i++)  {
//            star = "";
//            for (int j = 0; j < i; j++) {
//                star += "*";
//            }
//            System.out.println(star);
//        }

        // 다른 방법으로 ~
        for (int i=0; i <= 5; i++)  {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // space(4) + *
        // space(3) + **
        // space(2) + ***
        for (int i=0; i <= 5; i++)  {
            // space(4) + *
            for (int y = 5; y > i; y--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
