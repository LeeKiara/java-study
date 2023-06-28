package ch08.exercise4;

public class CheckingAccount implements BankAccount {
    double balance = 0;

    @Override
    public double deposit(double amount) {
        System.out.println("CheckingAccount deposit");

        balance += amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        System.out.println("CheckingAccount withdraw");

        balance -= amount;
        return balance;
    }

    @Override
    public double getBalance() {
        System.out.println("CheckingAccount getBalance");

        return this.balance;
    }
}
