package ch02;

public class Compare {

    public static void main(String[] args) {
        // 동등 비교 연산자 : ==
        // 똑같은지 비교
        int a = 5;
        int b = 3;
        boolean result = (a == b);    // false
//        System.out.println(result);

        String str1 = "abc";
        String str2 = "abc";
        boolean resultStr = (str1 == str2);
        System.out.println(resultStr);
        boolean resultStrNot = (str1 != str2);
        System.out.println(resultStrNot);
        System.out.println("----------------------");

        // 문자열 비교 시 동등 비교(==) 연산자를 사용 시 오답 발생
        // 문자뎔은 참조형 변수이기 때문에, RAM에 문자열값 대신 Reference(값이 있는 공간(Heap)의 주소) 저장
        String str3 = new String("abc");
        String str4 = new String("abc");
        boolean resultStr1 = (str3 == str4);    // 주소가 같은지를 비교
        boolean resultStrNot1 = (str3 != str4);
        System.out.println(resultStr1);
        System.out.println(resultStrNot1);

        // 자바에서 문자열 비교는 문자열변수명.equals(변수/값)
        resultStr1 = (str3.equals(str4));
        // 논리적으로 반대의 연산을 하고 싶을때, !(Not 연산) 사용 → 정확히는 결과값이 반대로 반환함
        resultStrNot1 = (!str3.equals(str4));
        System.out.println("\n" + str3 + "==" + str4 + " >>> " + resultStr1);
        System.out.println(resultStrNot1);

        // 부등 비교 연산자 : 두 피연산자의 값이 서로 다른지 확인
        // not equal
        boolean resultNot = (a != b);   // ture

    }
}
