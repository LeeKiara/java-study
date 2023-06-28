package ch04;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 문제 1: 정수형으로 구성된 길이 5의 배열을 선언하고, 인덱스 2의 요소에 7을 할당하고 출력하세요.
        int[] num1 = new int[5];
        num1[1] = 7;
        System.out.println(num1[1]);

        // 문제 2: 문자열로 구성된 길이 3의 배열을 선언하고, 각 요소에 "Java", "Python", "C++"을 할당하고 출력하세요.
        String[] str1 = new String[3];
        str1[0] = "Java";
        str1[1] = "Python";
        str1[2] = "C++";

        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }

//        // 문제 3: 실수형으로 구성된 길이 4의 배열을 선언하고, 사용자로부터 값을 입력받아 각 요소에 할당하고 출력하세요.
//        // 사용자로부터 콘솔창(터미널)에서 키보드로 입력을 받을 때
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("실수형값을 입력하세요: ");
//
//        // 실수형으로 값 1개를 입력 받을수 있음
//        // 커서(프롬프트) 깜빡이고 있는것은 입력 대기 중
//        int inputMax = 4;
//        for (int i = 0; i < inputMax; i++) {
//            Double inputNum = scanner.nextDouble();
//
//            Double[] num3 = new Double[inputMax];
//            num3[i] = inputNum;
//            System.out.println("입력 받은 숫자는:"+num3[i]);
//
//        }

// 문제 4: 정수형으로 구성된 길이 7의 배열을 선언하고, 1부터 7까지의 숫자를 할당하고 출력하세요.
        System.out.println("문제 4: 정수형으로 구성된 길이 7의 배열을 선언하고, 1부터 7까지의 숫자를 할당하고 출력하세요.");
        int[] num4 = new int[7];
        for (int i = 0; i < num4.length; i++) {
            num4[i] = i+1;
        }
        for (int i = 0; i < num4.length; i++) {
            System.out.println(num4[i]);
        }

        // 문제 6: 정수형으로 구성된 길이 5의 배열을 선언하고, 모든 요소를 0으로 초기화하고 출력하세요.
        System.out.println("문제 6: 정수형으로 구성된 길이 5의 배열을 선언하고, 모든 요소를 0으로 초기화하고 출력하세요.");
        int[] num6 = new int[5];
        for (int i = 0; i < num6.length; i++) {
            num6[i] = 0;
        }
        for (int i = 0; i < num6.length; i++) {
            System.out.println(num6[i]);
        }

        // 문제 7: 정수형으로 구성된 길이 4의 배열을 선언하고,
        // 사용자로부터 4개의 정수를 입력받아 배열에 할당하고, 배열의 모든 요소의 합을 출력하세요.
//        System.out.println("문제 7: 정수형으로 구성된 길이 4의 배열을 선언하고, 사용자로부터 4개의 정수를 입력받아 배열에 할당하고, 배열의 모든 요소의 합을 출력하세요.");
//
//        int[] arrNum7 = new int[4];
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("정수형값을 입력하세요: ");
//
//        int sum = 0;
//        for (int i = 0; i < arrNum7.length; i++) {
//            arrNum7[i] = scanner.nextInt();
//            System.out.println("입력 받은 숫자는:"+arrNum7[i]);
//
//            sum += arrNum7[i];
//        }
//
//        System.out.println("배열의 모든 요소의 합:"+sum);


        // 문제 8: 정수형으로 구성된 길이 5의 배열을 선언하고,
        // 사용자로부터 5개의 정수를 입력받아 배열에 할당하고, 배열에서 가장 큰 값과 가장 작은 값을 출력하세요.
//        System.out.println("문제 8: 정수형으로 구성된 길이 5의 배열을 선언하고, 사용자로부터 5개의 정수를 입력받아 배열에 할당하고, 배열에서 가장 큰 값과 가장 작은 값을 출력하세요.");
//        int[] arrNum8 = new int[5];
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("정수형값을 입력하세요: ");
//
//        for (int i = 0; i < arrNum8.length; i++) {
//            arrNum8[i] = scanner2.nextInt();
//            System.out.println("입력 받은 숫자는:"+arrNum8[i]);
//        }
//
//        // 배열에서 가장 큰 값과 가장 작은 값 구하기
//        int maxNum8 = 0;
//        int minNum8 = 0;
//
//        for (int i = 0; i < arrNum8.length; i++) {
//
//            if(i == 0) {
//                maxNum8 = arrNum8[0];
//                minNum8 = arrNum8[0];
//            } else {
//                // 배열에서 가장 큰 값 찾기 위해
//                if(arrNum8[i] > maxNum8) {
//                    maxNum8 = arrNum8[i];
//                }
//                // 배열에서 가장 작은 값 찾기 위해
//                if(arrNum8[i] < minNum8) {
//                    minNum8 = arrNum8[i];
//                }
//            }
//        }
//
//        System.out.println("배열에서 가장 큰 값:"+maxNum8);
//        System.out.println("배열에서 가장 작은 값:"+minNum8);


        // 문제 9: 문자열로 구성된 길이 5의 배열을 선언하고,
        // 사용자로부터 5개의 이름을 입력받아 배열에 할당하고, 배열을 알파벳순으로 정렬하여 출력하세요.
        System.out.println("문제 9: 문자열로 구성된 길이 5의 배열을 선언하고, 사용자로부터 5개의 이름을 입력받아 배열에 할당하고, 배열을 알파벳순으로 정렬하여 출력하세요.");
        String[] arrStr9 = new String[5];

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("이름 5개를 입력하세요: ");

        for (int i = 0; i < arrStr9.length; i++) {
            arrStr9[i] = scanner3.next();
            System.out.println("입력 받은 이름은 :"+arrStr9[i]);

            char subChar = arrStr9[i].substring(0,1).charAt(0);
            System.out.println(subChar);
        }

        // 문제 10: 정수형으로 구성된 길이 6의 배열을 선언하고,
        // 사용자로부터 6개의 정수를 입력받아 배열에 할당하고, 배열의 요소 중 홀수의 개수를 출력하세요.
//        int[] arrNum10 = new int[6];
//
//        Scanner scanner10 = new Scanner(System.in);
//        System.out.println("정수형값을 입력하세요: ");
//
//        for (int i = 0; i < arrNum10.length; i++) {
//            arrNum10[i] = scanner10.nextInt();
//            System.out.println("입력 받은 숫자는:"+arrNum10[i]);
//        }
//
//        // 배열의 요소 중 홀수의 개수를 출력하세요
//        int evenCount = 0;
//
//        for (int i = 0; i < arrNum10.length; i++) {
//
//            if(arrNum10[i] % 2 != 0) {
//                evenCount++;
//            }
//        }
//
//        System.out.println("배열의 요소 중 홀수의 개수:"+evenCount);
    }
}
