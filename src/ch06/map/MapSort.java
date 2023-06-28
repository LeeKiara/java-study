package ch06.map;

import ch06.list.Student;

import java.util.*;

public class MapSort {

    public static void main(String[] args) {

        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(new Student("Roa"));
        listStudent.add(new Student("Kasey"));
        listStudent.add(new Student("Marian"));

        System.out.println();
        System.out.println("--Before Sort(List Collections.sort) : 저장된 순서로 나오지 않음 -----------");
        for (Student result : listStudent) {
            System.out.println(result.getName());
        }

        // sort case 2 -> java 8 부터 지원
        // 컬렉션.sort(lstStudent, Comparator.comparing(클래스명::필드(getter))
        // 클래스명::필드명 -> 해당 클래스의 필드로 무엇인가를 하겠다.
        Collections.sort(listStudent, Comparator.comparing(Student::getName));

        System.out.println();
        System.out.println("--After Sort(List Collections.sort) : 이름으로 정렬 ------------");
        for (Student result : listStudent) {
            System.out.println(result.getName());
        }

        // HashMap 생성
        Map<String, Student> students = new HashMap<>();

        // 문제 2: 문제 1에서 생성한 맵에 5명의 학생을 추가하세요.
        students.put("001", new Student("Roa2", 20));
        students.put("002", new Student("Casey2", 30));
        students.put("003", new Student("Jamse2", 18));

        System.out.println();
        System.out.println("--Before Sort(Map Collections.sort) : ------------");
        for (Student result : students.values()) {
            System.out.println(result.getName());
        }

        // Collections sort를 사용하기 위해 Map을 List로 담기
        List<Student> studentList = new ArrayList<>(students.values());
        // sort case 2 -> java 8 부터 지원
        // 컬렉션.sort(lstStudent, Comparator.comparing(클래스명::필드(getter))
        // 클래스명::필드명 -> 해당 클래스의 필드로 무엇인가를 하겠다.
        Collections.sort(studentList, Comparator.comparing(Student::getName));

        System.out.println();
        System.out.println("--After Sort(Map Collections.sort): 이름으로 정렬 ------------");
        for (Student result2 : studentList) {
            System.out.println(result2.getName());
        }
    }
}
