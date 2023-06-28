package ch04;

public class EnhancedFor {
    public static void main(String[] args) {
        // 향상된 for문
        // 배열 같이 여라개의 값을 저장할 수 있는 자료구조를 순차적 참색
        //

//        int[] numbers = {1, 2, 3, 4, 5};
//
//        // 향상된 for문을 이용하여 배열 순회, 다만 index 값을 모른다.
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        // 문제 1: 배열의 모든 요소의 합 구하기 정수로 이루어진 배열이 주어졌을 때,
        // 향상된 for문을 사용하여 배열의 모든 요소의 합을 계산하는 프로그램을 작성해보세요.
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // 코드 구현
        for (int number : numbers) {
            sum += number;
//            System.out.println(number);
        }
        System.out.println("배열의 합: " + sum);


        // 문제 2: 배열에서 최댓값 찾기 정수로 이루어진 배열이 주어졌을 때,
        // 향상된 for문을 사용하여 배열에서 최댓값을 찾는 프로그램을 작성해보세요.
        int[] numbers2 = {7, 14, 3, 8, 21, 5};
        int max = numbers[0];

        for (int number : numbers2) {
            if(number > max) {
                max = number;
            }
//            System.out.println(number);
        }

        System.out.println("최댓값: " + max);
    }
}
