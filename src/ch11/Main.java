package ch11;

public class Main {

    public static void main(String[] args) {

        try {
            int term = 0;
            int amount = 240;
            int result = amount / term;

            System.out.println("한달에 "+result+"만원");

        } catch (ArithmeticException ae) {  // 특정 예외 상황
            System.out.println("산술연산 예외 발생 : "+ae.getMessage());
            System.out.println("나누기 연산의 값을 정확히 입력해주세요.");

        } catch (Exception e) { // 일반적인 예외 상황
            System.out.println(e.getMessage());
        }
    }
}
