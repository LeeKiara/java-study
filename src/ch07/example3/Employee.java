package ch07.example3;

/*
* Employee라는 클래스를 만들고, calculateSalary라는 메서드를 추가해주세요.
  FullTimeEmployee와 PartTimeEmployee 라는 두 개의 하위 클래스를 만들고,
  calculateSalary 메서드를 오버라이드해 각각 다른 연봉 계산식을 사용하도록 해주세요.
* */
public class Employee {

    private String name;

    public Employee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    // 급여 계산
    public void calculateSalary() {
        System.out.println(this.name+"님. 금월 급여 정보를 알려 드리겠습니다");
    }

}
