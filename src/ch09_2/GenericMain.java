package ch09_2;

import com.myuniversity.student.Student;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);

        int target = 2;   // 찾을 특정 요소

        CollectionUtil<Integer> util = new CollectionUtil<>();
        int occurrenceCount = util.countOccurrences(numbers, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("one");

        String target2 = "one";

        CollectionUtil<String> util2 = new CollectionUtil<>();
        int occurrenceCount2 = util2.countOccurrences(list, target2);

        System.out.println("Number of occurrences of " + target2 + ": " + occurrenceCount2);

        Cache<Student> c = new Cache<>();
        c.setData(new Student("Roa"));
        Student s = c.getData();
    }

}

// 주어진 리스트에서 특정 요소의 개수를 세는 메서드
class CollectionUtil<T> {

//    private int occurrenceCount;

    public int countOccurrences(List<T> list, T target) {

        int count = 0;
        for(T item : list) {
            if(item.equals(target)) {
//                this.occurrenceCount++;
                count++;
            }
        }
        return count;
    }
}

