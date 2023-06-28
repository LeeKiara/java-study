package ch09.ex3;

import java.util.ArrayList;
import java.util.List;

/*
* 주어진 리스트에서 특정 요소의 개수를 세는 메서드를 작성하는 문제입니다.
* countOccurrences 메서드를 구현하여 제시된 조건에 맞게 동작하도록 만들어보세요.
* 메서드는 특정 요소의 개수를 반환합니다.
* */
public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        int target = 1;   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<Integer> util = new CollectionUtil<>();
        int occurrenceCount = util.countOccurrences(numbers, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);

        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        String target2 = "apple";   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<String> util2 = new CollectionUtil<>();
        occurrenceCount = util2.countOccurrences(strList, target2);

        System.out.println("Number of occurrences of " + target2 + ": " + occurrenceCount);

    }
}
