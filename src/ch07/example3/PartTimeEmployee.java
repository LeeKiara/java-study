package ch07.example3;

/**
 * PartTimeEmployee
 * - 시급 필드(10만원)
 * - 월간 근무시간 필드(80시간)
 */
public class PartTimeEmployee extends Employee {

    private int timeSalary;     // 시급
    private int monthEmployTime;    // 월간 근무시간

    public void setTimeSalary(int timeSalary) {
        this.timeSalary = timeSalary;
    }

    public void setMonthEmployTime(int monthEmployTime) {
        this.monthEmployTime = monthEmployTime;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();

        // PartTime 월급여 계산 = 시급 * 월 근무 시간
        int monthSalary = this.timeSalary * this.monthEmployTime;

        System.out.println(monthSalary + "원 입니다.");
    }
}
