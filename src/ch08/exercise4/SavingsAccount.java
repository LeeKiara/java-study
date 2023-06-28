package ch08.exercise4;

public class SavingsAccount implements BankAccount {
    double balance = 0;

    @Override
    public double deposit(double amount) {
        System.out.println("SavingsAccount deposit");

        balance += amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        System.out.println("SavingsAccount withdraw");

        balance -= amount;
        return balance;
    }

    @Override
    public double getBalance() {
        System.out.println("SavingsAccount getBalance");
        return this.balance;
    }
}
