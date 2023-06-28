package ch06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(0, new Student("조"));
        listStudent.add(1, new Student("김"));
        listStudent.add(2, new Student("양"));

        System.out.println("--Before ArrayList Sort-----------");
        for (Student s : listStudent) {
            System.out.println("name : " + s.getName());
        }

        System.out.println();
        // sort case 1
        Collections.sort(listStudent);

        // sort case 2 -> java 8 부터 지원
        // 컬렉션.sort(lstStudent, Comparator.comparing(클래스명::필드(getter))
        // 클래스명::필드명 -> 해당 클래스의 필드로 무엇인가를 하겠다.
        Collections.sort(listStudent, Comparator.comparing(Student::getName));

        System.out.println("--After ArrayList Sort : 이름순-----------");
        for (Student s : listStudent) {
            System.out.println("name : " + s.getName());
        }

        System.out.println();

        // ArrayList 정렬 : 나이 순
        List<Student> listStudent2 = new ArrayList<>();
        listStudent2.add(new Student("B", 13, 3));
        listStudent2.add(new Student("A", 12, 2));
        listStudent2.add(new Student("Z", 11, 1));

        System.out.println("--Before ArrayList Sort -----------");
        for (Student s : listStudent2) {
            System.out.println("name : " + s.getName() + ", age : " + s.getAge() + ", grade : " + s.getGrade());
        }

        // 나이순으로 정렬
        Collections.sort(listStudent2, Comparator.comparing(Student::getAge));

        System.out.println();
        System.out.println("--After ArrayList Sort(Collections.sort, 나이순으로..) ----------");

        for (Student s : listStudent2) {
            System.out.println("name : " + s.getName() + ", age : " + s.getAge() + ", grade : " + s.getGrade());
        }

        listStudent2.clear();

        listStudent2.add(new Student("B", 13, 3));
        listStudent2.add(new Student("A", 12, 2));
        listStudent2.add(new Student("Z", 11, 1));

        // 학년(grade) 순으로 정렬
        Collections.sort(listStudent2, Comparator.comparing(Student::getGrade));

        System.out.println();
        System.out.println("--After ArrayList Sort(Collections.sort, 학년(grade) 순으로..) ----------");
        for (Student s : listStudent2) {
            System.out.println("name : " + s.getName() + ", age : " + s.getAge() + ", grade : " + s.getGrade());
        }

        listStudent2.sort(new Comparator<Student>() {
            @Override
            public int compare(Student arg0, Student arg1) {
                int age0 = arg0.getAge();
                int age1 = arg1.getAge();
                if(age0 == age1)
                    return 0;
                else if (age0 > age1)
                    return  1;
                else
                    return -1;
            }
        });
    }
}

// **Comparable 인터페이스를 구현**한다.
// 자바 객체를 특정 필드로 정렬하는 방법
// java sort by specific field
class Student implements Comparable<Student> {
    // 다음과 같은 필드를 가지고 있다: name, age, grade.
    private String name;
    private int age;
    private int grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Collections.sort 메서드를 실행하면
    // 객체별로 compareTo 메서드를 실행하여 정렬해줌
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

}
