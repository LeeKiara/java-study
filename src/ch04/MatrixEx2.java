package ch04;

public class MatrixEx2 {
    public static void main(String[] args) {
        // 문제 3: 2개의 2x2 크기의 정수형 2차원 배열을 생성하고,
        // 두 배열의 각 요소를 더한 결과를 새로운 2차원 배열에 저장한 후, 결과 배열을 출력하는 프로그램을 작성해보세요.

        int[][] arrayNum1 = new int[2][2];
        int[][] arrayNum2 = new int[2][2];

        int seq = 0;
        for (int i = 0; i < arrayNum1.length; i++) {
            for (int j = 0; j < arrayNum1[i].length; j++) {
                arrayNum1[i][j] =  seq++;
                System.out.println("arrayNum1 => ["+i+","+j+"] "+ arrayNum1[i][j]);
            }
        }

        seq = 0;
        for (int i = 0; i < arrayNum2.length; i++) {
            for (int j = 0; j < arrayNum2[i].length; j++) {
                arrayNum2[i][j] =  seq++;
                System.out.println("arrayNum2 => ["+i+","+j+"] "+ arrayNum2[i][j]);
            }
        }

        int[][] arrayResult = new int[2][2];
        for (int i = 0; i < arrayNum2.length; i++) {
            for (int j = 0; j < arrayNum2[i].length; j++) {
                arrayResult[i][j] = arrayNum2[i][j];

                System.out.println("arrayResult => ["+i+","+j+"] "+ arrayResult[i][j]);
            }
        }

    }
}
