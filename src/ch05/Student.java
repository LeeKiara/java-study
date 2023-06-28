package ch05;

// 클래스란? 찍어내는 틀인데, 조회하거나 정보 저장하고 기능을 쓸 수 있는 객체(object)를 생성할 때
public class Student {
    // 문제 1: 학생의 이름(name)과 학년(grade)을 필드로 가지는 Student 클래스를 작성하십시오.
    private String name;
    private int grade;
    private int age;


    // 생성자
    public Student(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public Student() {
    }

    // 문제 3: Student 클래스에 학생의 이름과 학년을 출력하는 메소드를 추가하십시오.
    public void printStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student grade: " + grade);
        System.out.println("Student age: " + age);
    }


    // 메서드(method) = 기능(function)
    // 학생 이름(name)을 입력받아서 저장하는 기능
    // CRUD (create read update delete)
    // 아무것도 반환하지 않으면 void
    // 메서드 선언 할 때
    // 1. public 쓴다(99.99%)
    // 2. 요구사항에 맞게 메서드(기능) 이름을 쓴다.(camel-case)
    // 3. 입력값을 받는지 ? (입력을 받으면) 매개변수 선언 : (입력이 없으면)비어둔다
    //                               -> 매개변수 선언 -> 매개변수 이름부터 정의
    //                                              -> 매개변수의 자료형
    // 4. 구현(implementation)할 코드를 작성
    // 5. 반환값이 있어요 ? 타입 선언 : void
    public void setName(String name) {
        // 학생 이름(name)을 입력받아서 객체 필드에 저장
        this.name = name;
    }

    // 학생 정보의 이름을 가져오는 메서드
    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {

        this.grade = grade;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void promoteGrade(int grade) {
        this.grade = grade + 1;
    }
}
