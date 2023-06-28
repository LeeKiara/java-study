package ch07.example3;

public class EmployeeManagement {

    public void run() {

        /*
        Employee라는 클래스를 만들고, calculateSalary라는 메서드를 추가해주세요.
        FullTimeEmployee와 PartTimeEmployee라는 두 개의 하위 클래스를 만들고,
        calculateSalary 메서드를 오버라이드해 각각 다른 연봉 계산식을 사용하도록 해주세요.
         */
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setName("Roa");    // 이름
        fullTimeEmployee.setYearSalary(12000000);   // FullTime.연봉
        fullTimeEmployee.calculateSalary();

        System.out.println();
        // 시급 필드(10만원)
        // 월간 근무시간 필드(80시간)
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setName("Casey");  // 이름
        partTimeEmployee.setTimeSalary(100000);    // PartTime.시급
        partTimeEmployee.setMonthEmployTime(80);   // PartTime.월간 근무시간
        partTimeEmployee.calculateSalary();
    }
}
