package ch07;

public class Lecture extends Person {

    private int careerTerm;

    public Lecture(String name, int age, int careerTerm) {
        super(name, age);
        this.careerTerm = careerTerm;
    }

    @Override
    public void introduce() {
        System.out.println("저의 경력은 "+this.careerTerm+"년 입니다.");
    }

    public void teach() {
        System.out.println(name + "이(가) 강의를 시작합니다.");
    }

}
