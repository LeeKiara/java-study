package ch03;

// 제어문 > 반복문 while
public class LoopWhile {
    public static void main(String[] args) {

        // while (반복문)
        /*
        * while (조건식) {
        *   조건이 참인 동안 계속해서 반복을 수행
        *   조건이 false가 되는 탈출구문이 일반적으로 존재
        * }
        * */
        int i = 0;
        while (i<5) {
            System.out.println("i의 값:"+i);
            if(i == 2)  {
                // 반복문을 종료하고 빠져나옴, 이후 코드는 실행하지 않음
                // 가장 가까운 반복문을 종료하고 나옴
                /*
                * while(...) {
                *   while(...) {
                *       ...
                *       break;
                 *  }
                 *  -- 여기가 실행됨
                 * }
                * */
                break;
            }
            i++;
        }

        System.out.println("반복문 종료");
        System.out.println("이후 i값은 : "+i);
    }
}
