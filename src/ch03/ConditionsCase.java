package ch03;

public class ConditionsCase {
    public static void main(String[] args) {
        // switch 문
        int dayOfWeek = 3;

        // switch(변수) {
        // }
        // switch문의 변수의 값에 따라서 case 뒤에 값과 일치하는 구분을 실행
        // break 를 쓰지않으면, case에 맞는 코드를 실행한 후 뒤에 있는 코드가 실행되므로
        // 가급적 break를 case구문 마지막에 넣는다.
        // 일치하는 case문을 찾지못하면 default에 맞는 코드를 실행한다.
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            default:
                System.out.println("주말입니다");
        }

        // if~else로 변경
        if(dayOfWeek == 1) {
            System.out.println("월요일");
        } else if(dayOfWeek == 2) {
            System.out.println("화요일");
        } else {
            System.out.println("수요일~일요일");
        }
    }
}
