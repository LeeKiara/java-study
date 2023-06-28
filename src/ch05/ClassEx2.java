package ch05;

public class ClassEx2 {
    public static void main(String[] args) {

        User user2;

        User user = new User();

        user.setName("Roa");
        user.setAge(20);
        user.setEmail("test123@naver.com");

        user.displayUserInfo();

        // 나이증가
        int value = user.addAge();
        System.out.println("나이 증가:"+value);

        // 유효한 이메일 주소인지를 확인하는 메서드 호출
        if(!user.isEmailPattern(user.getEmail())) {
            System.out.println(user.getEmail()+"은 유효하지 않은 이메일 주소입니다.");
        } else {
            System.out.println(user.getEmail()+"은 사용가능한 이메일 주소입니다.");
        }

        // 유효한 나이인지를 확인하는 메서드 호출
        if(!user.checkInvalidAge(user.getAge())) {
            System.out.println("유효하지 않은 나이입니다.");
        } else {
            System.out.println("유효한 나이입니다.");
        }

        user.setJoinDate("20230614");
        System.out.println("가입일자는 "+user.getJoinDate()+"입니다.");
    }
}
