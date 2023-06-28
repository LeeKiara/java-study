package ch05.statics;

public class Counter {

    // static 필드는 모든 클래스에 공유
    // Main이 실행되는 순간 메모리에 저장
    private static int count = 0;

    public Counter() {
        count++;    // 정적 변수 값 증가
    }

    // 멤버, 메서드 다 static 메모리 공간에 올라감
    public static int getCount() {
        return count++;
    }

    /*
    * 메서드 안에서 객체 생성
    *
    * void method(...) {
    *   Class instance = new Class(...);
    *   instance.get...();
    * }
    *
    * // 가비지 컬렉션(garbage collection)
    * JVM이 필요 없어진 객제/변수/메서드 등을 메모리에서 제거
    * */



}
