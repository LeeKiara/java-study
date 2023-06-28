package ch08.exercise2;

// 'Gradable' 인터페이스를 'Student' 클래스에 구현하세요.
// 'calculateGrade' 메서드는 학생의 성적에 따라 학점을 계산하도록 구현하세요.
public class Student implements Gradable, Studyable {

    @Override
    public int calculateGrade(int record) {
        int schoolGrade = 0;

        if(record >= 70)
            schoolGrade = 2;
        else if(record >= 80)
            schoolGrade = 3;
        else if(record >= 90)
            schoolGrade = 4;
        else
            schoolGrade = 1;

        return schoolGrade;
    }

    @Override
    public void study() {
        System.out.println("학생이 공부하고 있습니다.");
    }
}
