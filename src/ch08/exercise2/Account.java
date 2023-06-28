package ch08.exercise2;

// 'Taxable' 인터페이스를 'Account' 클래스에 구현하세요.
// 'Bankable' 인터페이스를 'Account' 클래스에 구현하세요. 각 메서드는 계좌에 입금과 출금을 수행하도록 구현하세요.
public class Account implements Taxable, Bankable, Loanable {

    double balance = 0; // 잔액

    // 'calculateTax' 메서드는 잔액의 10%를 세금으로 계산하도록 구현하세요.
    @Override
    public double calculateTax(double balance) {
        return balance * 10/100;
    }

    // 입금
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // 출금
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public int calculateInterest(int loanBalance) {

        //  'calculateInterest' 메서드는 대출 금액에 대한 이자를 계산하도록 구현하세요.
        int loanValue = loanBalance * (10/100);
        return loanValue;

    }
}
