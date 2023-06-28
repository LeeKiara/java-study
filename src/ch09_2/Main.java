package ch09_2;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Hello");
        stack.push("World");
        String popItem = stack.pop();
        System.out.println("Last Item : "+popItem); // World
        System.out.println("Last Item : "+stack.pop()); // Hello

        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(100);
        intStack.push(200);
        int intPopItem = intStack.pop();
        System.out.println("Last Item : "+intPopItem); // 200
        System.out.println("Last Item : "+intStack.pop()); // 100

    }

}

// 임의의 타입 T의 객체를 저장하는 스택
class GenericStack<T> {

    LinkedList<T> stack = new LinkedList<>();

    GenericStack() {

    }
    public void push(T item) {
        stack.addLast(item);
    }

    public T pop() {
        return stack.removeLast();
    }


}
