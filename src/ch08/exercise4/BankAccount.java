package ch08.exercise4;

// BankAccount 인터페이스를 정의하세요.
// 이 인터페이스는 deposit, withdraw, getBalance 메서드를 포함해야 합니다.
public interface BankAccount {

    double deposit(double amount);
    double withdraw(double amount);
    double getBalance();

}
