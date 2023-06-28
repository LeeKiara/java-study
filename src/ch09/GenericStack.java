package ch09;

// 스택이라는 자료구를 만들것임
// LinkedList를 이용하여 만들 것임
// 스택은 LIFO(Last In First Out) 형태의 자료구조호
// 가장 나중에 넣은 것이 가장 먼저 처리되는 형태의 자료구조
// 접시를 쌓아놓고 설거지 하는것과 비슷하다

// 메서드 호출이 스택에 쌓아놓고 실행된다.
// a() -> b() -> c() : 실행순서는 c() -> b() -> a()

// 웹 브라우져 뒤로 가기 : 가장 나중에 열린 페이지부터 뒤로 가기를 실행합니다.
// NavigationStack: 1 -> 2 -> 3... 뒤로가기를 3 -> 2 -> 1

import java.util.LinkedList;

// StackoverFlow
// push, pop

// 임의의 타입 T의 객체를 저장하는 스택
public class GenericStack<T> {

    private LinkedList<T> stack = new LinkedList<>();

    public void push(T item) {
        stack.addLast(item);
    }

    public T pop() {
        return stack.removeLast();
    }
}
