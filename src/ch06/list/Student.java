package ch06.list;

// Comparable 인터페이스를 구현한다.
// 자바 객체를 특정 필드로 정렬하는 방법(chatgpt)
// java sort by specific field
public class Student implements Comparable<Student> {
    // 다음과 같은 필드를 가지고 있다: name, age, grade.
    private String name;
    private int age;
    private int grade;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printStudent() {
        System.out.println("name : "+this.name+", age : "+this.age+", grade : "+this.grade);
        return;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    // Collections.sort 메서드를 실행하면
    // 객체별로 compareTo 메서드를 실행하여 정렬해줌
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

//    public boolean equals(Object obj) {
//        return (this == obj);
//    }

//    @Override
//    public int compareTo(Student arg0) {
//        int targetAge = arg0.getAge();
//
//        if(this.age == targetAge)
//            return 0;
//        else if(this.age > targetAge)
//            return 1;
//        else
//            return -1;
//    }


}