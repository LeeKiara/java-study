package ch05;

public class StudentEx {
    public static void main(String[] args) {

        Student student1 = new Student("Sera", 1, 8);
        student1.printStudentInfo();

        System.out.println(student1); // 객체를 찍으면 객체의 해쉬코드 출력
        System.out.println();

        Student student2 = new Student("Roa", 2, 9);
        student2.printStudentInfo();

        System.out.println();

        // 문제 4: Student 클래스 객체를 생성하고 setName 및 setGrade 메소드를 사용하여
        // 학생 이름을 "John"이라고 설정하고 학년을 10으로 설정하십시오.
        Student student3 = new Student();
        student3.setName("John");
        student3.setGrade(10);
        student3.setAge(18);

        System.out.println();

        // 문제 5: Student 클래스 객체를 생성하고 printStudentInfo 메소드를 사용하여 학생 정보를 출력하십시오.
        Student student4 = new Student();
        student4.setName("Kang");
        student4.setGrade(5);
        student4.setAge(11);
        student4.printStudentInfo();

        System.out.println();

        Student student5 = new Student();
        student5.setName("Lisa");
        student5.setGrade(11);
        student5.setAge(16);
        student5.printStudentInfo();

        System.out.println();

        Student student6 = new Student("LEE", 12, 20);
        // 학년증가
        student6.promoteGrade(student6.getGrade());
        System.out.println(student6.getName()+"1학년 증가:"+student6.getGrade());

        System.out.println();
    }
}
