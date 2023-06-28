package ch01;

public class StringsEx {

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
        String fullName = "문자열 겳합 " + firstName + " " + lastName;
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자열 처리에 특수문자, 줄바꿈, 탭
        // backslash 로 구분
        String message = "\"특수문자 Double Quotation 출력하고 싶어요\"";
        System.out.println(message);

        String tabMessage = "특수문자 탭 문자 출력 : Hello\tworld";
        System.out.println(tabMessage);

        String back = "특수문자 슬래시 출력 : Hello\\world";
        System.out.println(back);

        String name = "Roa";
        String address = "South Korea";
        String age = new String("20");
        String career = "IT 웹개발경력은 7~8년, 정보보안 경력은 9년 입니다.";

        String info = name + " " + age + "\t주소는" + address + "입니다."
                + "\n" + career;

        System.out.println(info);


    }
}
