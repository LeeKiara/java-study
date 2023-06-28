package ch06.map.account;

import java.util.*;

public class AccountManagement {

    // 배열을 Map으로 변경
    private Map<String, Account> accountMap;  // 계좌 HashMap

    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 생성자
    public AccountManagement() {
        accountMap = new HashMap<>(); // 계좌목록 HashMap 생성
//        scanner = new Scanner(System.in);
    }

    // 계좌번호와 초기 입금액을 입력 받고 계좌 객체를 생성한 후 Map에 추가 (put 메서드)
    // ** parameter
    //  - accountNumber : 계좌번호
    //  - balance : 초기 입금액
    // ** return : void
    public void addAccount(String accountNumber, double balance) {

        // 계좌 인스턴스 생성
        Account account = new Account(accountNumber, balance);
        // 계좌 추가
        accountMap.put(accountNumber, account);

        System.out.println("계좌가 추가 되었습니다. (계좌번호 : "+accountNumber+
                ", 입금액: "+balance+")");
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

        // 순서없이 출력 : HashMap
        for (Account acc : accountMap.values()) {
            System.out.println("계좌번호 : [" + acc.getAccountNumber() +
                    "], 잔액: [" + acc.getBalance() + "]");
        }

        // 정렬 할 경우 : TreeMap 으로 변경한 다음에 값목록 가져와서 출력
        for (Account acc : new TreeMap<>(accountMap).values()) {
            System.out.println("계좌번호 : [" + acc.getAccountNumber() +
                    "], 잔액: [" + acc.getBalance() + "]");
        }
    }

    // 입금
    public void deposit(String accountNumber, double amount) {
        // **코드 작성 (done)
        // 계좌번호로 계좌객체를 찾고 입금 금액 만큼 추가한다.
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

    // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
    private Account findAccount(String accountNumber) {

        for (Account acc : accountMap.values()) {
            System.out.println("계좌번호 : [" + acc.getAccountNumber() + "], 잔액: [" + acc.getBalance() + "]");
            if(acc.getAccountNumber().equals(accountNumber))    {
                return acc;
            }
        }

        // 에러가 안나게...
        return null;
    }

    public void run() {

        while (true) {

            try {

                System.out.println("\n=== 계좌 관리 프로그램 ===");
                System.out.println("1. 계좌 추가");
                System.out.println("2. 계좌 목록 조회");
                System.out.println("3. 입금");
                System.out.println("4. 출금");
                System.out.println("0. 종료");
                System.out.print("원하는 기능을 선택하세요: ");

                // 메뉴번호 받기
                scanner = new Scanner(System.in);
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
                        //showAccountList();
                        break;
                    case 4:     // 4. 출금
                        System.out.print("계좌번호: ");
                        accountNumber = scanner.nextLine();
                        System.out.print("출금액: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // 개행 문자 제거
                        withdraw(accountNumber, withdrawAmount);
                        //showAccountList();
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        break;
                }
            } catch(InputMismatchException ie) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.(InputMismatchException)");
                //break;
            }
        }


    }
}