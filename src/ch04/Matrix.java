package ch04;

public class Matrix {
    public static void main(String[] args) {
        // 다차원 배열은 배열을 요소로 갖는 배열, 행렬(matrix)이나 표와 같은 형태의 데이터를 표현하는 데 유용

        // 2차원 배열 초기화
        // [행][열]
        int[][] matrix = new int[3][4]; // 3행, 4열
        matrix[0][0] = 1;
        matrix[2][3] = 4;

        // 행단위 반복문
        for (int i = 0; i < 3 ; i++) {

            // 열단위 반복문
            for (int j = 0; j < 4; j++) {
                // 0행-1열....3행-4열
                matrix[i][j] = i + j;
            }

        }
    }
}
