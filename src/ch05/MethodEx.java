package ch05;

public class MethodEx {

    public static void main(String[] args) {

        // utils 클래스 객체 생성하고 메서드 실행
        Utils utils = new Utils();

        System.out.println("문제 1: 두 개의 정수를 매개변수로 받아서, 그 합을 반환하는 sum이라는 이름의 메서드를 작성하세요.");
        int num1 = 10;
        int num2 = 10;
        int intSum = utils.sum(num1, num2);
        System.out.println(num1 + " + " +num2+" = "+intSum);
        System.out.println();

        System.out.println("문제 2: 두 개의 정수를 매개변수로 받아서 그 중 더 큰 수를 반환하는 findMax라는 메서드를 작성하세요.");
        num1 = 33;
        num2 = 44;
        int result = utils.findMax(num1, num2);
        System.out.println(num1 + " , " +num2+" = "+result);
        System.out.println();

        System.out.println("문제 3: 정수 배열을 매개변수로 받아서 배열의 모든 요소를 더한 값을 반환하는 메서드를 작성하세요");
        int[] param = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = utils.sumArray(param);
        System.out.println(sum+"\n");

        System.out.println("문제 4: 문자열 배열을 매개변수로 받아서 가장 긴 문자열을 반환하는 메서드를 작성하세요.");
        String[] arrColor = new String[4];
        arrColor[0] = "white";
        arrColor[1] = "yellow";
        arrColor[2] = "deepDarkBlue";
        arrColor[3] = "black";

        String maxStr = utils.maxLenString(arrColor);
        System.out.println(maxStr+"\n");

        System.out.println("문제 5: 정수 배열을 매개변수로 받아서 배열의 요소들 중에서 짝수의 개수를 반환하는 메서드를 작성하세요.");
        int[] param2 = {1, 2, 3, 4, 8};
        int oddCount = utils.oddCount(param2);
        System.out.println(oddCount+"\n");
    }

}
