package com.myuniversity.course;

import ch05.accessModifier.Animal;
import com.myuniversity.student.Student;
import java.util.Scanner;

// 과목과 관련된 기능을 제공하는 클래스
public class CourseService {

    private Course course;          // 과목
    private Course[] CourseList;    // 과목배열
    private int numCourse;          // 과목이 생성된 개수
    private Scanner scanner;        // 사용자 키보드 입력 객체

    Animal animal = new Animal();

    public void test() {
        // protected 메서드는 다른 패키지에서 사용을 못함
        // animal.eat();
    }

    public CourseService() {
    }

    public CourseService(int maxSize) {
        CourseList = new Course[maxSize]; // 과목 배열 생성
        numCourse = 0;                    // 과목이 생성된 개수
    }

    // 과목 생성 기능
    public void createCourse(String courseName, int maxStudent) {

        // 과목 생성
        Course course = new Course(courseName, maxStudent);

        // 과목배열에 생성된 과목Object 대입
        CourseList[numCourse] = course;

        // 과목이 생성된 개수에 1 증가
        numCourse++;

        System.out.println("과목이 생성 되었습니다. (과목명 : "+courseName+", 과목수: "+numCourse+")");

    }

    // 과목명으로 과목Object 찾기
    private Course findCourse(String CourseName) {

        // 과목배열 loop 돌기 : 과목이 생성된 개수(numCourse) 만큼만
        for (int i = 0; i < numCourse; i++) {
            // 과목배열에서 과목Object를 1개씩 대입
            Course oneCourse = CourseList[i];

            if (oneCourse != null) {
                //찾는 과목이 있을경우 과목Object 리턴
                if (oneCourse.getName().equals(CourseName)) {
                    return oneCourse;
                }
            }
        }
        return null;
    }

    // 과목에 참여 학생 추가(수강신청)
    public void assignCourse(String curseName, String studentName) {
        // 신청하고자 하는 과목 찾기
        Course oneCourse = findCourse(curseName);

        // 과목이 있을 경우
        if(oneCourse != null) {
            // 과목에 학생 추가 (수강신청)
            oneCourse.joinStudent(new Student(studentName));
            // 과목에 참여한 학생 리스트
            oneCourse.printJoinStudents(oneCourse);
        } else {
            System.out.println(curseName+" 과목이 없습니다.");
        }
    }

    // 과목에 참여한 학생 출력 기능(과정명)
    public void printStudentByCourseName(String CourseName) {
        // 신청하고자 하는 과목 찾기
        Course oneCourse = findCourse(CourseName);

        // 과목이 있을 경우
        if(oneCourse != null) {
            // 과목에 참여한 학생 리스트
            oneCourse.printJoinStudents(oneCourse);
        } else {
            System.out.println("출력 하고자 하는 과목이 없습니다.");
        }
    }

    // 과목 출력
    private void printCourse() {

        // 과목 갯수(numCourse)만큼 loop 수행.
        for (int i = 0; i < numCourse; i++) {
            // 과목배열에서 과목Object를 1개씩 대입
            Course oneCourse = CourseList[i];

            if (oneCourse != null) {
                System.out.println(oneCourse.getName());    // 과목명
            }
        }
    }

    private void printALLCourse() {

        // 과목 갯수(numCourse)만큼 loop 수행.
        for (int i = 0; i < numCourse; i++) {

            // 과목배열에서 과목Object를 1개씩 대입
            Course oneCourse = CourseList[i];

            System.out.println("\n▶ ["+oneCourse.getName()+"] 과목에 "+oneCourse.getNumOfStudent()+"이 참여 하였습니다. \n▶ 참여한 학생 리스트");
            for (int j = 0; j < oneCourse.getNumOfStudent(); j++) {
                Student[] std = oneCourse.getStudents();
                System.out.println(j+". "+std[j].getName());
            }
        }
    }

    // run 메서드는 메서드에서 실행
    public void run() {

        while (true) {

            System.out.println("\n=== 과목 수강 신청 ===");
            System.out.println("1. 과목 생성");
            System.out.println("2. 과목별 수강 신청 (과목명, 학생명)");
            System.out.println("3. 과목별 수강 신청현황 (과목명)");
            System.out.println("4. 과목 생성 현황 ");
            System.out.println("5. 전체 조회 ");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            // 메뉴번호 받기
            scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:     // 1. 과목 추가
                    System.out.print("과목명: ");
                    String courseName = scanner.nextLine();
                    System.out.print("참여가능 학생 수: ");
                    int maxStudent = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거

                    createCourse(courseName, maxStudent);

                    break;
                case 2:     // 2. 과목에 참여 학생 추가(assignCourse)
                    System.out.print("과목명: ");
                    String courseName2 = scanner.nextLine();
                    System.out.print("학생명: ");
                    String studentName = scanner.nextLine();

                    assignCourse(courseName2, studentName);

                    break;
                case 3:     // 과목에 참여한 학생 출력 기능(printStudentByCourseName)
                    System.out.print("과목명: ");
                    String courseName3 = scanner.nextLine();
                    printStudentByCourseName(courseName3);
                    break;
                case 4:     // 과목 조회
                    System.out.println("---------------------------------");
                    System.out.println("현재까지 생성된 과목은 다음과 같습니다.");
                    System.out.println("---------------------------------");
                    printCourse();
                    break;
                case 5:     // 전체조회
                    printALLCourse();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }

        }

    }

}
