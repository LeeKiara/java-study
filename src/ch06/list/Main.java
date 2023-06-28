package ch06.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<자료형> 변수형 = new ArrayList<자료형>();
        // 자료형에 따라서 다르게 작동하기 위해서 추가적인 매개변수를 <자료형>을 넣는다
        // 자료형을 매개변수로 받는 것을 제네릭/제너릭(generic)
        // 매개변수의 자료형은 기본(원시) 자료형(primitive type)은 안됨
        // int/long 안됨 -> Integer, Long 클래스 타입을 넣어줘야한다.
//        List<String> list = new ArrayList<String>();
        List<String> list = new LinkedList<String>();
        List<Integer> listInt = new ArrayList<Integer>();

        // 추가
        list.add(new String("남"));
        list.add(new String("명"));
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("------------------");

        // 특정 위치의 값을 변경
        // 리스트변수.set(인덱스, 객체)
        list.set(0, new String("조"));
        list.set(1, new String("이"));
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("------------------");

        // 리스트변수.size() - 요소의 개수
        System.out.println(list.size());
        System.out.println("------------------");

        list.add("김성우");
        list.add("김소현");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("------------------");
        // 1번 요소를 삭제, 뒤에 있는 것을 정부 당겨옴. 중간에 구멍(null)이 안 생김
        // 객체 제거 : 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨짐
        list.remove(1);
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("------------------");
        // 2번쩨 객체 삽입
        list.add(2, new String("이현미"));
        for (String name : list) {
            System.out.println(name);
        }

        // 이렇게 중간에 삭제하거나, 추가하게 되면
        // 뒤쪽요소를 당겨오거나 밀어야되는 overhead(추가적인 연산) 발생
        // 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList 보다는 LinkedList
        // ------------------┼----------┼----------------
        //            요소추가 │ 전체 탐색 │ 요소삭제/삽입
        // ------------------┼----------┼----------------
        // ArrayList    빠름  │   빠름   │  느림(많이)
        // LinkedList   느림  │   느림   │  빠름

    }
}
