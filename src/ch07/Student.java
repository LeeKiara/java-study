package ch07;

// extends 부모클래스
// 부모클래스의 필드 및 메서드를 상속 받는다.
// inheritance(상속) : 프로그래밍 언어에서는 상속은 자식이 부모를 선택해서 물려 받음

/*
   SE(SW 공학) -> generalization(일반화) -> inheritance(상속)
   but Java 에서는 반대로 접근....
   여러개의 클래를 구현하는데, 일반적인 속성과 기능이 있더라~ ->
   그거를 부모클래스를 만들고, 나머지 클래스들은 상속받고 필요한 것만 추가하자.
   - generalization : 일반적인 속성(attribute)과 기능(operation)
*/
public class Student extends Person {
    // Student는 name, age, 필드, introduce 메서드를 그냥 사용할 수 있음
    // 부모의 필드 외의 다른 필드르 추가 할 수 있음
    private String studentId;

    // 빈 생성자는 자동으로 상속 받음
    // 하지만 매개변수가 있는 생성자는 상속할 때 별도로 선언해줘야 함
    public Student(String name, int age, String studentId) {
        // 부모의 생성자를 호출
        // super(...)
        // 부모 객체도 실제로 생성이 됨
        super(name, age);
        this.studentId = studentId;
    }

    // 학생 연구(공부) 기능
    // 부모의 메서드 외에 다른 메서드를 추가함
    public void study() {
        System.out.println(name + "이(가) 공부를 시작합니다.");
    }

    // override : 부모클래스의 메서드를 재정의
    @Override
    public void introduce() {
        // 부모클래스 introduce 그대로 쓰고
        // 뭔가 추가를 하겠다.
        // super(부모)
        super.introduce();
        System.out.println("제 학번은 "+studentId+" 입니다.");
    }

}
