package ch05.overloading;

public class Operator {

    // 메서드 오버로딩
    // 메서드명은 동일
    // 매개변수 개수 또는 타입이 다른 경우
    // 반환 타입만 다른 경우에는 안됨

    // 메서드 시그니처(method signature)
    // 어떤 메서드의 유일함을 나타내는 껍데기(프로트타입, 선언부)
    // 메서드 이름 + 매개변수(개수, 타입)

    // 정수값 2개 받고 곱하기
    public int multiply(int x, int y) {

        System.out.println("정수값 2개 받고 곱하기");

        return  x * y;
    }

    // 실수값 2개 받고 곱하기
    public double multiply(double x, double y) {

        System.out.println("실수값 2개 받고 곱하기");

        return  x * y;
    }

    public int multiply(int[] nums) {

        System.out.println(" 받고 곱하기");

        if(nums == null || nums.length < 0) {
            return 0;
        }

        int mulResult = 1;
        for(int num : nums) {
            mulResult *= num;
        }
        return mulResult;
    }

}
