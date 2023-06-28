package ch05;

import java.util.InputMismatchException;
import java.util.Scanner;

// 계좌 클래스
class Account {
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액

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

    // 입금
    public void deposit(double amount) {
        // **코드 작성 (done)
        // 입금 금액 만큼 해당 계좌객체에 잔고(balance) 추가
        balance += amount;
        //System.out.println("잔고(balance) 추가 되었습니다. : " + balance);
    }

    // 출금
    public void withdraw(double amount) {
        // **코드 작성 (done)
        // 출금 금액 만큼 해당 계좌객체에 잔고(balance) 차감
        // 단, 출금 금액보다 잔액이 적으면 오류 메시지를 출력하면 차감하지 않음
        if(balance < amount) {
            System.out.println("출금 금액보다 잔액이 작아, 인출할 수가 없습니다. 출금액 확인하세요.");
        } else {
            balance -= amount;
        }

    }
}

class AccountManagement {
    private Account[] accountList;  // 계좌 목록 배열
    private int numAccounts;        // 계좌의 개수
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수르 입력받는 생성자
    public AccountManagement(int maxSize) {
        accountList = new Account[maxSize];
        numAccounts = 0;
        scanner = new Scanner(System.in);
    }

    // 계좌번호와 초기 입금액을 입력 받고 계좌 객체를 생성한 후 배열의 가장 마지막에 추가한다.
    // ** parameter
    //  - accountNumber : 계좌번호
    //  - balance : 초기 입금액
    // ** return : void
    public void addAccount(String accountNumber, double balance) {
        // **코드 작성 (done)
        // 계좌번호와 초기 입금액을 입력 받고 계좌 객체를 생성한 후 배열의 가장 마지막에 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
        Account account = new Account(accountNumber, balance);
        accountList[numAccounts] = account;
        numAccounts++;
    }

    public void showAccountList() {
        // **코드 작성(done)
        // 계좌 목록을 출력
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1]
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // ------------------------------------
//        for(Account displayAcc : accountList)   {
//            if(displayAcc != null) {
//                Account acc = displayAcc;
//                System.out.println("계좌번호 : [" + acc.getAccountNumber() + "], 잔액: [" + acc.getBalance() + "]");
//            }
//        }

        // 계좌 갯수(numAccounts) 만큼 돌려도 될것같음
        for (int i = 0; i < numAccounts; i++) {
            if(accountList[i] != null) {
                Account acc = accountList[i];
                System.out.println("계좌번호 : [" + acc.getAccountNumber() + "], 잔액: [" + acc.getBalance() + "]");
            }
        }
    }

    // 입금
    public void deposit(String accountNumber, double amount) {
        // **코드 작성 (done)
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
        Account acc = findAccount(accountNumber);

        if(acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("입금하고자 하는 계좌가 없습니다. 계좌번호를 다시 확인하세요.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        // **코드 작성 (done)
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
        Account acc = findAccount(accountNumber);

        if(acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("출금하고자 하는 계좌가 없습니다. 계좌번호를 다시 확인하세요.");
        }
    }

    private Account findAccount(String accountNumber) {
        // **코드 작성 (done)
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
        for(Account tempAcc : accountList)   {
            if(tempAcc != null) {
                Account acc = tempAcc;
                //System.out.println("계좌번호 : [" + acc.getAccountNumber() + "], 잔액: [" + acc.getBalance() + "]");
                if(acc.getAccountNumber().equals(accountNumber))    {
                    return acc;
                }
            }
        }

        return null;
    }

    public void run() {
        try {

            while (true) {
                System.out.println("\n=== 계좌 관리 프로그램 ===");
                System.out.println("1. 계좌 추가");
                System.out.println("2. 계좌 목록 조회");
                System.out.println("3. 입금");
                System.out.println("4. 출금");
                System.out.println("0. 종료");
                System.out.print("원하는 기능을 선택하세요: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 제거

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                switch (choice) {
                    case 1:     // 1. 계좌 추가
                        System.out.print("계좌번호: ");
                        String accountNumber = scanner.nextLine();
                        System.out.print("잔액: ");
                        double balance = scanner.nextDouble();
                        scanner.nextLine(); // 개행 문자 제거
                        addAccount(accountNumber, balance);
                        break;
                    case 2:     // 2. 계좌 목록 조회
                        showAccountList();
                        break;
                    case 3:     // 3. 입금
                        System.out.print("계좌번호: ");
                        accountNumber = scanner.nextLine();
                        System.out.print("입금액: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // 개행 문자 제거
                        deposit(accountNumber, depositAmount);
                        showAccountList();
                        break;
                    case 4:     // 4. 출금
                        System.out.print("계좌번호: ");
                        accountNumber = scanner.nextLine();
                        System.out.print("출금액: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // 개행 문자 제거
                        withdraw(accountNumber, withdrawAmount);
                        showAccountList();
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        break;
                }
            }

        } catch(InputMismatchException ie) {

            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }

        }
}

public class Main {
    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement(100);
        accountManagement.run();
    }
}