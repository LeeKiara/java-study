package ch06.list;

public class SortTest {

    public static void main(String[] args) {

        int[] arr = {10, 40, 30, 20, 50};

        int arrLen = arr.length;

        for (int i = 0; i < arrLen-1; i++) {
            for (int j = i+1; j < arrLen; j++) {

                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int result : arr) {
            System.out.println(result);
        }

        System.out.println();

        char[] arrChar = {'C', 'B', 'D', 'A', 'E'};

        int arrCharLen = arr.length;

        for (int i = 0; i < arrCharLen-1; i++) {
            for (int j = i+1; j < arrCharLen; j++) {

                if(arrChar[i] > arrChar[j]) {
                    char tmp = arrChar[i];
                    arrChar[i] = arrChar[j];
                    arrChar[j] = tmp;
                }
            }
        }

        for (char result : arrChar) {
            System.out.println(result);
        }

    }
}
