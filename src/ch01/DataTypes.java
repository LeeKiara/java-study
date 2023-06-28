package ch01;

public class DataTypes {
    public static void main(String[] args) {
        // 1. 정수형 자료형
        // 대부분 쓰는 자료형
        int age = 23; //int 범위는 -2,147,483,648부터 2,147,483,647까지입니다.
        short no = 10; // short 범위는 -32,768부터 32,767까지입니다.
        long myLong = 12345; // long 범위는 -9,223,372,036,854,775,808부터 9,223,372,036,854,775,807까지입니다.
        byte myByte = 10; // byte 범위는 -128부터 127까지입니다.
        // bit = 컴퓨터의 가장 작은 단위.
        // 바이트(bytes) = 8bit
        // int = 4bytes를 저장 가능.
        // long = 8bytes를 저장 가능.

        // 2. 실수형 자료형(소숫점이 있는 숫자 (ex : 10.0 = 실수, 10 = 정수))
        // 실수 : Floating-Point
        float myFloat = 3.14f; // float = 4바이트 대부분 플로트 사용.
        double pi = 3.14159; // double = 8바이트 거의 안씀.

        // 3. 문자형 자료형(Character)
        // 글자1개 저장 가능 (ex : 1, a, b, 4, @)
        // 글자를 숫자로 변환하여 저장 (아스키코드, 유니코드)
        // 2bytes 공간크기
        char mychar = 'A';

        // 4.논리형 자료형(Boolean Type)
        // 참 or 거짓(treu or flase) 값을 저장하는 자료형
        boolean isTrue = true;
        boolean isKorean = false; //Q.한국사람입니까? A.flase(거짓)

        // 변수명 = 값 : 값을 변수명에 저장, 대입, 할당한다.
    }
}
