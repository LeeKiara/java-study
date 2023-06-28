package ch04;

import java.util.Scanner;

public class MatrixEx {
    public static void main(String[] args) {
        // 문제 1: 3x3 크기의 정수형 2차원 배열을 생성하고,
        // 사용자로부터 값을 입력받아 배열에 저장한 후, 저장된 값을 출력하는 프로그램을 작성해보세요.
        int[][] matrix1 = new int[3][3];
//        matrix1[0][0] = 1;
//        matrix1[0][1] = 2;

//        System.out.println(matrix1.length);
//        System.out.println(matrix1[0].length);

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 9개를 입력하세요: ");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
//                matrix1[i][j] = i + j;
                matrix1[i][j] = scanner.nextInt();
                System.out.println("["+i +","+j+"] = "+matrix1[i][j]);
            }
        }

        System.out.println("모두 출력");
        // 모두 출력
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("["+i +","+j+"] = "+matrix1[i][j]);
            }
        }

    }
}
