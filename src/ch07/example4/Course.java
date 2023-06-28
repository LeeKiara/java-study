package ch07.example4;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;  // 과목명
    private String courseCode;  // 과목코드
    private String instructor;  // 강사명

    public Course() {

    }

    public Course(String courseName, String courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }

}
