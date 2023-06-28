package ch05;

public class Utils {

    public Utils() {
    }

    // 두 개의 정수를 매개변수로 받아서, 그 합을 반환하는 sum이라는 이름의 메서드
    public int sum(int param1, int param2) {

        int sumVal = param1 + param2;

        return sumVal;
    }

    // 두 개의 정수를 매개변수로 받아서 그 중 더 큰 수를 반환하는 findMax라는 메서드를 작성
    public int findMax(int param1, int param2) {
        int maxVal = param1;

        if(param1 > param2) {
            maxVal = param1;
        } else if (param2 > param1) {
            maxVal = param2;
        }

        return maxVal;
    }

    // 정수 배열을 매개변수로 받아서 배열의 모든 요소를 더한 값을 반환하는 메서드를 작성하세요.
    public int sumArray(int[] param) {
        int sum = 0;

        for(int iNum : param) {
            sum += iNum;
        }
        return sum;
    }

    // 문자열 배열을 매개변수로 받아서 가장 긴 문자열을 반환하는 메서드를 작성하세요.
    public String maxLenString(String[] param) {

        int maxLen = param[0].length();
        String maxStr = param[0];

//        for (int i = 1; i < param.length; i++) {
//            if(param[i].length() > maxLen)   {
//                maxLen = param[i].length();
//                maxStr = param[i];
//            }
//        }

        for(String sParam : param) {
            if(sParam.length() > maxLen) {
                maxLen = sParam.length();
                maxStr = sParam;
            }
        }

        return maxStr;
    }

    // 정수 배열을 매개변수로 받아서 배열의 요소들 중에서 짝수의 개수를 반환하는 메서드
    public int oddCount(int[] param) {
        int count = 0;

//        for (int i = 0; i < param.length; i++) {
//            if(param[i] % 2 == 0)
//               count += 1;
//        }

        for(int iParam : param) {
            if(iParam % 2 == 0)
                count += 1;
        }

        return count;
    }

}
