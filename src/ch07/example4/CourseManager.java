package ch07.example4;

import java.util.ArrayList;
import java.util.List;

/*
문제 7: Course 클래스와 그 서브클래스들을 활용하여 다음과 같은 CourseManager 클래스를 작성하세요:
courses (Course 배열)
addCourse: Course를 배열에 추가하는 메서드
printCourses: 배열에 있는 모든 Course 정보를 출력하는 메서드
 */
public class CourseManager {

    List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        // 다형성을 이용해서
        // LectureCourse, OnlineCourse 각 각 실행
        if(course instanceof LectureCourse) {
            ((LectureCourse) course).addLectureCourse();
        } else if(course instanceof OnlineCourse) {
            ((OnlineCourse) course).addOnlineCourse();
        }

        courses.add(course);
    }

    // printCourses: 배열에 있는 모든 Course 정보를 출력하는 메서드
    public void printCourses() {
        System.out.println();
        System.out.println("======강의 신청 내역======");

        for (Course c : courses) {

            String resultMsg = "";

            if(c instanceof LectureCourse) {
                LectureCourse lc = (LectureCourse)c;
                resultMsg = printLectureCourse(lc);
            } else if(c instanceof OnlineCourse) {
                OnlineCourse oc = (OnlineCourse)c;
                resultMsg = printOnlineCourse(oc);
            }
            System.out.println(resultMsg);

        }
    }

    public String printLectureCourse(LectureCourse course) {

        StringBuilder resultMsg = new StringBuilder();

        resultMsg.append("▷ 과목명 : "+ course.getCourseName() +", "+
                "▷ 과목코드 : "+ course.getCourseCode() +", "+
                "▷ 강사명 : "+ course.getInstructor());
        resultMsg.append(", ▷ 강의실 : "+ course.getRoom() +", "+
                "▷ 시간 : "+ course.getTime());

        return resultMsg.toString();
    }

    public String printOnlineCourse(OnlineCourse course) {

        StringBuilder resultMsg = new StringBuilder();

        resultMsg.append("▷ 과목명 : "+ course.getCourseName() +", "+
                "▷ 과목코드 : "+ course.getCourseCode() +", "+
                "▷ 강사명 : "+ course.getInstructor());
        resultMsg.append(", ▷ 플랫폼 : "+ course.getPlatform());

        return resultMsg.toString();
    }

    // getCourseByInstructor: 특정 강사가 강의하는 Course 객체를 반환하는 메서드 (단, 한 명의 강사가 여러 개의 강의를 할 수 있음)
    public List getCourseByInstructor(String instructor) {

        List<Course> result = new ArrayList<>();

        // 강의 배열에서
        for (Course c : courses) {
            // 특정 강사가 있는지
            if(instructor.equals(c.getInstructor())) {
//                System.out.println("** debug ** \n ▷ 과목명 : "+ c.getCourseName() +", "+
//                        "▷ 과목코드 : "+ c.getCourseCode() +", "+
//                        "▷ 강사명 : "+ c.getInstructor());
                result.add(c);
            }
        }

        return result;
    }

    // getOnlineCourses: OnlineCourse 객체들을 배열로 반환하는 메서드
    public List getOnlineCourses() {

        List<OnlineCourse> onCourse = new ArrayList<>();

        for (Course c : courses) {
            if(c instanceof OnlineCourse) {
                onCourse.add((OnlineCourse)c);
            }
        }
        return onCourse;
    }

    // getLectureCourses: LectureCourse 객체들을 배열로 반환하는 메서드
    public List getLectureCourses() {

        List<LectureCourse> lCourses = new ArrayList<>();

        for (Course c : courses) {
            if(c instanceof LectureCourse) {
                lCourses.add((LectureCourse)c);
            }
        }
        return lCourses;
    }
}
