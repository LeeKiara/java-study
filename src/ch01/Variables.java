package ch01;

public class Variables {
    public static void main(String[] args) {
        // 변수 = variables = 이름이 있는 메모리 공간
        // 프로그래밍 : 사람의 언어를 컴퓨터 언어로 바꾸는 작업

        // 변수 선언 = declare = 변수(이름) 만들기
        int age;
        // 값 할당(assignment) = age = 변수에 값 저장
        age = 23; // 제작자 나이다.
        System.out.println(age);// 로깅(logging) = 결과 출력 확인

        // 변수이름은 숫자로 시작 불가능 (ex : int 1ex(x))
        // 일반적으로 소문자로 시작, 두번째 단어부터는 대문자로 시작
        // 이런 형태의 변수 이름 표기법을 camel-case(카멜케이스) 표기법이라고 한다.
        int studentAge; // int student/Age; (단어 두개 이상이 붙을 경우 두번째 단어 첫자 대문자)

    }
}
