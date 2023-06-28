package ch05.statics;

public class Main2 {
    public static void main(String[] args) {
        // 멤버, 메서드 다 static 메모리 공간에 올라감
        // getCount 메서드가 static으로 선언했기 때문에, 사용할 수 있음
        int result1 = Counter.getCount();   // ++
        System.out.println(result1);    // 0

        int result2 = Counter.getCount();   // ++
        System.out.println(result2);    // 1
    }
}
