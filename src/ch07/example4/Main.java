package ch07.example4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CourseManager cm = new CourseManager();

        // 온라인 강의 신청 : 강좌명, 강좌코드, 강사명, 플랫폼
        cm.addCourse(new OnlineCourse("Java", "ON-001", "Jane", "AWS"));
        cm.addCourse(new OnlineCourse("React", "ON-002", "Tom", "AWS"));

        //cm.printCourses();

        // 오프라인 강의 신청 : 강좌명, 강좌코드, 강사명, 강의실, 강의시간
        cm.addCourse(new LectureCourse("Java-offline", "OFF-001", "Jane", "ROOM1", 9));
        cm.addCourse(new LectureCourse("React-offline", "OFF-002", "Tom", "ROOM2", 10));

        cm.printCourses();

        System.out.println();
        String findInstructor = "Jane";
        System.out.println("특정 강사가 있는지 확인. 찾는 강사명 : "+findInstructor);
        List<Course> findCourse = cm.getCourseByInstructor(findInstructor);

        if(findCourse != null) {
            System.out.println("** find 결과 ** ");
            for (Course c : findCourse) {
                // 특정 강사가 있는지
                System.out.println("▷ 과목명 : "+ c.getCourseName() +", "+
                        "▷ 과목코드 : "+ c.getCourseCode() +", "+
                        "▷ 강사명 : "+ c.getInstructor());
                }
            }

        System.out.println();

        System.out.println("getOnlineCourses: OnlineCourse 객체들을 배열로 반환하는 메서드 call");
        List<Course> onCourses =cm.getOnlineCourses();
        for (Course course : onCourses) {
            OnlineCourse oc = (OnlineCourse)course;
            String resultMsg = cm.printOnlineCourse(oc);
            System.out.println(resultMsg);
        }

        System.out.println();

        System.out.println("getLectureCourses: LectureCourse 객체들을 배열로 반환하는 메서드 call");
        List<Course> lCourses =cm.getLectureCourses();
        for (Course course : lCourses) {
            LectureCourse lc = (LectureCourse)course;
            String resultMsg = cm.printLectureCourse(lc);
            System.out.println(resultMsg);
        }

    }

}
