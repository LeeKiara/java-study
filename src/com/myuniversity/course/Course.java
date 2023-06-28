// 학과별 과목 정보를 관리하는 클래스들
package com.myuniversity.course;

// 다른 패키지에 있는 클래스를 가져다 쓰는 방법
// import 패키지명....클래스명;
// import 패키지명....*;    // 해당 패키지 모든 클래스
// import com.myuniversity.student.*; > 잘 안씀
import com.myuniversity.student.Student;

public class Course {

    private String name;

    private int maxStudent = 20;
    // final 변수
    // 상수(constant) : 초기화만 가능하고, 변경 불가능한 값
    // 상수는 대문자 snake-case를 많이 사용한다.(관례, convention)
    private final int MAX_STUDENT = 20;

    private int numOfStudent = 0;   // 현재 과목에 몇명의 학생이 있는지
    private Student[] students;


    public Course(String name, int maxStudent) {
        this.name = name;
        this.maxStudent = maxStudent;
        this.students = new Student[maxStudent];    // 과목에 최대 몇명이 가능한지
    }

    // 과목에 참여한 학생 리스트
    public void printJoinStudents(Course course) {

        System.out.println("▶ ["+this.name+"] 과목에 "+this.numOfStudent+"이 참여 하였습니다. \n▶ 참여한 학생 리스트");
        for (int i = 0; i < course.getNumOfStudent(); i++) {
            System.out.println(i+". "+students[i].getName());
        }

    }

    // 해당 과목에 학생 참가(추가)
    public void joinStudent(Student student) {
        this.students[numOfStudent] = student;
        this.numOfStudent++;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }


    public String getName() {
        return name;
    }

}
