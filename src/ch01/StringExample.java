package ch01;

public class StringExample {
    public static void main(String[] args) {

        // string(문자열) : 기본 자료형이 아니다.
        // 문자를 여러개로 연결(문자의 배열)
        // char(문자열)을 여러개를 연결하는 것과 같다
        String greeting = "Hello, World";
        char data[] = {'a', 'b', 'c'};

        // 문자열 초기화 방법
        // 문자열 값을 코드에 직접 입력한 것을 리터럴
        String firstName = new String("John");
        String lastName = "Doe";

        // 문자열 결합(concat)
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자열 처리에 특수문자, 줄바꿈, 탭
        String message = "\"메세지 출력하고 싶어요\"";
        System.out.println(message);

        String tabMessage = "Hello\tworld";
    }
}
