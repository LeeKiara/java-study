package ch04;

public class Array {
    public static void main(String[] args) {
        // 배열(array)은 동일한 자료형(타입)의 여러 개의 값을 저장하는 자료구조(data structure)
        // 타입[] 배열이름 = new 타입[크기]
        int[] numbers = new int[5]; // 크기가 5인 배열

        // 배열 요소(element)에 값을 할당
        // 배열이름[번호(인덱스)]
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
//        numbers[4] = 50;

        System.out.println(numbers[0]);

        // 배열의 크기
        int arrayLength = numbers.length;
        System.out.println("배열의 크기 : "+arrayLength);

        // 배열을 반복문으로 접근
        // 0 ~ 배열의 길이보다 작을 때 까지
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("");

        // 배열요소의 초기값을 넣어서 초기화
        int[] numbers2 = {10, 20, 30, 40};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        // 배열의 한계점 : 크기가 불변이라서 ~, 선언 후 크기 변경이 불가능

        // 배열의 크기 나중에 정하기
        int[] numbers3;

        // 배열 크기 초기화, 숫자는 0 기반으로 초기화 된다.
        numbers3 = new int[3];


    }
}
