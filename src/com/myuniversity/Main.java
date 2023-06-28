package com.myuniversity;

import com.myuniversity.course.Course;
import com.myuniversity.course.CourseService;
import com.myuniversity.student.Student;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService(100);
        courseService.run();

//        Course c = new Course("자바, 고급 프로그래밍", 14);
//        c.joinStudent(new Student("이현미"));
//        c.joinStudent(new Student("아무나"));
//
//        System.out.println("\n-- 참가한 학생");
//        Student[] students = c.getStudents();
//
//        for (int i = 0; i < c.getNumOfStudent(); i++) {
//            System.out.println(students[i].getName());
//        }
    }
}
