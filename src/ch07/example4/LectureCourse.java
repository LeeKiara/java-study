package ch07.example4;

public class LectureCourse extends Course {

    private String room;    // (강의실)
    private int time;   // (강의시간)

    public LectureCourse(String courseName, String courseCode, String instructor, String room, int time) {
        // 부모생성자 호출
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public int getTime() {
        return time;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void addLectureCourse() {
        System.out.println("오프라인 강의를 신청합니다.");
    }
}
