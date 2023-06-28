package ch06.set;

import ch06.list.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("양");
        Student s2 = new Student("박");
        Student s3 = s1;    // 같은 주소를 참조한다.
        Student s4 = new Student("박");

        // hashcode, 같은 참조면 같은 값
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        // 해쉬코드는 동일하나, 특정 값이 같은지 비교하고 싶을때 equals 메서드에 구현한다.
        // 기본적으로 같은 참조면 true이나, 바꿀수 있다
        System.out.println(s1.equals(s3));

        // 객체 추가
        Set<String> sets = new HashSet<>();
        sets.add("apple");
        sets.add("banana");
        sets.add("cherry");
        sets.add("durian");
        sets.add("elerberry");

        System.out.println("HashSet 객체 조회.......");
        // 객체 탐색/조회
        for (String s : sets) {
            System.out.println(s);
        }

        // contains : 해당 값이 있냐 없냐
        System.out.println(sets.contains("cherry"));

        // 체리값이 있으면 삭제해라.
        if(sets.contains("cherry")) {
            sets.remove("cherry");
        }

        System.out.println();
        List<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("durian");
        lst.add("elerberry");
        lst.add("durian");

        // 중복된 값을 배제하고 싶을 때
        for (String list : lst) {
            System.out.println(list);
        }

        System.out.println();
        System.out.println("중복된 값을 배제하고 싶을 때");

        Set<String> set2 = new HashSet<>(lst);
        for (String s : set2) {
            System.out.println(s);
        }


        System.out.println();
        System.out.println("중복제거, 정열하고 싶을 때");

        // 컬렉션(리스트) -> set으로 초기화 생성
        // TreeSet으로 하면 중복제거에 정렬까지 된다
        Set<String> set3 = new TreeSet<>(lst);
        for (String s : set3) {
            System.out.println(s);
        }

        System.out.println();
        Set<String> tmpSet = new HashSet<>();

        String tempStr = "abcdabcd";
        for (int i = 0; i < tempStr.length(); i++) {
            tmpSet.add(tempStr.substring(i, i+1));
        }

        for (String s : tmpSet) {
            System.out.println(s);
        }



    }
}
