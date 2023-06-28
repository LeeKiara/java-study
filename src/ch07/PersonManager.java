package ch07;

public class PersonManager {

    public void work(Person p) {
        // 다형성을 이용해서
        // 현재 객체가 Student 일 수도 있고, Lecture 일 수도 있음
        if(p instanceof Student) {
            // this를 형변환
            ((Student) p).study();
        } else if(p instanceof Lecture) {
            ((Lecture) p).teach();
        }
    }
}
