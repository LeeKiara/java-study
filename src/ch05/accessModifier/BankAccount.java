package ch05.accessModifier;

public class BankAccount {
    private int balance;    // private 필드

    // private 메서드 : 클래스 만든 사람만 가져다 쓸라고 한 것
    // 내부에서 클래스로 코드 분류하기 좋음
    private void deductFunds(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            // Insufficient : 불충분한
            System.out.println("Insufficient funds!");
        }
    }
}
