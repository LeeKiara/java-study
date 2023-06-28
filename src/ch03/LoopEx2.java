package ch03;

import java.util.Scanner;

public class LoopEx2 {

    public static void main(String[] args) {

        // 문제1. 5의 배수 합계
        System.out.println("문제1. 5의 배수 합계");
        int sum = 0;
        for (int i=1; i <= 100; i++)  {
            if(i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // 문제2. 1~100 까지 짝수, 홀수 의 합
        System.out.println("\n문제2. 1~100 까지 짝수, 홀수 의 합");
        int evenSum = 0;
        int oddSum = 0;

        for (int i=1; i<= 100; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("짝수의 합계는 "+evenSum);
        System.out.println("홀수의 합계는 "+oddSum);

        // 문제3. 두개의 주사위 두 눈의 합이 6이 되는 모든 경의 수 출력
        System.out.println("\n문제3. 두개의 주사위 두 눈의 합이 6이 되는 모든 경의 수 출력");
        int qubeSum = 0;
        for (int i=1; i <= 6; i++)  {
            for (int y=1; y <= 6; y++) {
                qubeSum = i + y;
                if(qubeSum == 6) {
                    System.out.println("주사위1("+i + "), 주사위2("+ y +") = "+qubeSum);
                }
            }
        }

        // 문제4. 이중 for문을 이용하여 별표 출력
        System.out.println("\n문제4. 이중 for문을 이용하여 별표 출력");
        for (int i=0; i <= 5; i++)  {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 문제5. 이중 for문을 이용하여 별표 출력(거꾸로)
        System.out.println("\n문제5. 이중 for문을 이용하여 별표 출력(거꾸로)");
        for (int i=5; i > 0; i--)  {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 문제6. 이중 for문을 이용하여 별표 출력(트리모양)
        System.out.println("\n문제6. 이중 for문을 이용하여 별표 출력(트리모양)");
        // space(4) + *(1) + space(4)
        // space(3) + ***(3) + space(3)
        // space(2) + *****(5) + space(2)
        // space(1) + *******(7) + space(1)
        // space(0) + *********(9) + space(0)
        int maxStar = 9;
        int max = maxStar/2; //4;
        for (int i=0; i <= maxStar; i++)  {
            // 별의 갯수가 홀수일 경우에만 프린트
            if (i % 2 == 1) {
                // 별 앞에 공간 넣기
                for (int space1= 0; space1 < max; space1++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                // 별 뒤에 공간 넣기
//                for (int space1= 0; space1 < max; space1++) {
//                    System.out.print(" ");
//                }
                System.out.println("");
                max--;
            }
        }

        // 다른 방식...
        // 행(가로, y) -> 상위, 열(세로, x) -> 하위
        int line = 10;
        for (int i=1; i <= line; i++)  {
            // 별 앞에 space 넣기
            // 5 - 1(행번호) 만큼 출력
            for (int j= 1; j <= (line-i); j++) {
                System.out.print(" ");
            }

            // 별 출력 : 별 갯수 : 2n - 1
            for (int y= 1; y <= (2 * i - 1); y++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        // 문제7. 주사위의 눈이 6이 나올때까지 반복해서 굴리고, 8이되면 지금까지 횟수 출력
        System.out.println("\n문제7. 주사위의 눈이 6이 나올때까지 반복해서 굴리고, 8이되면 지금까지 횟수 출력");
        int cubePoint = 0;
        int count = 0;

//        for(int i=0; i < 6; i++) {
//            cubePoint = (int) (Math.random() * 6) + 1;
//            count++;
//
//            System.out.println("("+cubePoint+")");
//
//        }

        while (cubePoint != 6) {

            cubePoint = (int) (Math.random() * 6) + 1;
            count++;

            System.out.println("("+cubePoint+")");
        }

        System.out.println("총 주사위 굴린 횟수는 : "+count+"회");

    }
}
