package ch09_3;

public class Main {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("john");
        user1.setPassword(null);

        User user2 = new User();
        user2.setUsername(null);
        user2.setPassword("password123");

        user1.validate(); // 유효성 검사 예외 발생: Field 'password' is required.
        user2.validate(); // 유효성 검사 예외 발생: Field 'username' is required.
    }
}
