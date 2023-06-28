package ch03;

public class Conditions {
    public static void main(String[] args) {
        // 조건문(condition)
        // 코드를 실행할지 말지를 결정하는데 사용
        // 프로그램의 로직(logic)을 제어하는 핵심적인 부분

        // if문
        /*
        if ( 조건식 ) {
            식이 true일 대 실행할 구문
        }
         */
        // 조건식 : true / false를 반환하는 식
        int age = 20;
        System.out.println("** 나이 : "+age);

        if(age >= 18) {
            System.out.println("성인입니다.");
        }

        // if-else 문
        // if문의 조건식이 true 이면, if 블록({})안의 코드가 실행
        // if문의 조건식이 false 이면, else 블록({})안의 코드가 실행
        age = 16;
        System.out.println("** 나이 : "+age);

        if(age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        // else if 문
        // 여러 조건을 평가할 때 사용
        age = 20;
        System.out.println("** 나이 : "+age);
        if (age >= 60) {
            System.out.println("노년입니다.");
        } else if (age >= 40) {
            System.out.println("장년입니다.");
        } else if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

//        if(age >= 18) {
//            if (age >= 60) {
//                System.out.println("노년입니다.");
//            } else if (age >= 18) {
//                System.out.println("성인입니다.");
//            }
//        } else {
//            System.out.println("미성년자입니다.");
//        }

    }
}
