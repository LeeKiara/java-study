package ch07.example4;

public class OnlineCourse extends Course {


    private String platform;    // 강의 플랫폼

    public OnlineCourse() {

    }

    public OnlineCourse(String courseName, String courseCode, String instructor, String platform) {
        // 부모생성자 호출
        super(courseName, courseCode, instructor);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void addOnlineCourse() {
        System.out.println("온라인 강의를 신청합니다.");
    }

}
