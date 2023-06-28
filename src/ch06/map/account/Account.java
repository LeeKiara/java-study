package ch06.map.account;

public class Account {
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액

    public Account() {
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // 계좌 객체에 잔액 증가
    public void deposit(double amount) {
        // **코드 작성 (done)
        // 입금 금액 만큼 해당 계좌객체에 잔고(balance) 추가
        balance += amount;
        //System.out.println("잔고(balance) 추가 되었습니다. : " + balance);
    }

    // 계좌 객체에 잔액 차감
    public void withdraw(double amount) {
        // **코드 작성 (done)
        // 출금 금액 만큼 해당 계좌객체에 잔고(balance) 차감
        // 단, 출금 금액보다 잔액이 적으면 오류 메시지를 출력하면 차감하지 않음
        if(balance < amount) {
            System.out.println("잔액이 부족합니다. 출금액을 확인해 주세요.");
        } else {
            balance -= amount;
        }

    }
}
