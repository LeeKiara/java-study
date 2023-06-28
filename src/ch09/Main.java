package ch09;

import ch06.list.account.Account;
import ch07.Student;
import ch07.example4.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // List : 인터페이스, ArrayList : 구현클래스
        // <String> : 매개변수를 타입(클래스)으로 넣었습니다.
        // 매개변수를 타입으로 넣츨 수 있게 하는 것에 제네릭(제너릭, 쥐네릭)
        // 1. 컴파일 시점에서 데이터 타입을 체크할 수 있음
        // 기능을 타입(클래스)별로 만들지 않아도 됨
        // 2. 코드를 재 사용할 수 있음 (코드를 유현하게 ~)
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");

//        for (String s : list) {
//            System.out.println(s);
//        }

//        List list2 = new ArrayList<>();
//        list2.add("aaa");
//        list2.add("bbb");

        /*
        * 오버로딩을 이용한 방법
        * Util util = new Util();
         * util.add(Integer a, Integer b)
         * util.add(String a, String b)
        *
        * 제네릭
         * Util<타입> util = new Util();
         * punlic T add ()
         *
         * public class CollectionUtil<T> {
         *      printList(List<T> list) {
         *          for... .출력
         *      }
         * }
        * */

        /*
        * 제네릭을 사용하면 --->
        * 클래스나 메소드가 다루는 데이터의 타입을 컴파일 타임에 체크 -->
        * 타입 안정성과 코드 재사용을 높일 수 있음
        *
        * 제네릭을 사용하면 --->
        * 클래스나 메소드 매개변수 타입을 자유롭게 설정할 수 있으며, 컴파일 타임에 타입 체크를 하므로 런타임 에러를 방지할 수 있음
        * */

        // 제네릭을 쓸 수 있는 상황 :
        // 연산이나 로직이 같고, 메서드명 같고, 매개변수도 같을 걸 쓰는데
        // 다만, 타입만 다를 경우

//        GenericStack<String> stack = new GenericStack<>();
//        GenericStack<Student> stackStudents = new GenericStack<>();
//        GenericStack<Course> stackCources = new GenericStack<>();
//        GenericStack<Account> stackAccount = new GenericStack<>();
//
//        GenericQueue<String> queue = new GenericQueue<>();
//        queue.enqueue("1");


        GenericStack<String> stack = new GenericStack<>();
        stack.push("Hello");
        stack.push("World");
        String poppedFromStack = stack.pop(); // "World"
        System.out.println(poppedFromStack);

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(100);
        stack2.push(200);
        int poppedFromStack2 = stack2.pop(); // 200
        System.out.println(poppedFromStack2);

        System.out.println();

        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        Integer dequeuedFromQueue = queue.dequeue(); // 1
        System.out.println(dequeuedFromQueue);

        GenericQueue<String> queue2 = new GenericQueue<>();
        queue2.enqueue("one");
        queue2.enqueue("two");
        String dequeuedFromQueue2 = queue2.dequeue(); // 1
        System.out.println(dequeuedFromQueue2);
    }
}
