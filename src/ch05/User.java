package ch05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 사용자 정보(User)를 저장하는 클래스를 작성하세요. 사용자의 이름, 나이, 이메일 주소를 저장할 수 있어야 합니다.
public class User {

    private String name;    // 이름
    private int age;        // 나이
    private String email;   // 이메일
    private String joinDate;    // 가입일자

    // 생성자
    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void displayUserInfo() {
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("메일 : "+email);
    }

    // 나이를 증가시키는 메서드
    public int addAge() {
        int value = this.age + 1;
        return value;
    }

    // 유효한 나이인지를 확인하는 메서드를 추가하세요.
    public boolean checkInvalidAge(int age) {

        boolean checkInvalidAge = true;

        if(age < 0) {
            checkInvalidAge = false;
        }

        return checkInvalidAge;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getJoinDate() {
        return this.joinDate;
    }

    // 유효한 이메일 주소인지를 확인
    public boolean isEmailPattern(String email) {

        boolean emailCheck = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);

        return emailCheck;
    }
}
