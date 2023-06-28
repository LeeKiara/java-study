package ch07.example3;

/*
* Employee라는 클래스를 만들고, calculateSalary라는 메서드를 추가해주세요.
  FullTimeEmployee와 PartTimeEmployee 라는 두 개의 하위 클래스를 만들고,
  calculateSalary 메서드를 오버라이드해 각각 다른 연봉 계산식을 사용하도록 해주세요.
* */
public class FullTimeEmployee extends Employee {

    private int yearSalary; // 연봉

    public void setYearSalary(int yearSalary) {
        this.yearSalary = yearSalary;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();

        int monthSalary = this.yearSalary / 12;
        System.out.println(monthSalary+"원 입니다");
    }
}
