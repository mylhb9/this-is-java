package ch06;

import java.util.Scanner;

public class BankApplication {
    private static Account1[] accountArray = new Account1[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("--------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo==1) {
                createAccount();
            } else if(selectNo == 2) {
                accountList();
            } else if(selectNo == 3) {
                deposit();
            } else if(selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");

    }

    private static void createAccount() {
        for(int i=0; i<accountArray.length; i++) {
            if(accountArray[i]== null) {
                System.out.println("---------");
                System.out.println("계좌생성");
                System.out.println("---------");
                System.out.print("계좌번호: ");
                String ano = scanner.next();
                System.out.print("계좌주: ");
                String owner = scanner.next();
                System.out.print("초기입금액: ");
                int initBalance = scanner.nextInt();
                accountArray[i] = new Account1(ano, owner, initBalance);
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("---------");
        System.out.println("계좌목록");
        System.out.println("---------");
        for(int i=0; i< accountArray.length; i++) {
            if(accountArray[i]!=null) {
                System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
            } else {
                break;
            }
        }
    }

    private static void deposit() {
        System.out.println("---------");
        System.out.println("예금");
        System.out.println("---------");
        System.out.print("계좌번호: ");
        Account1 account = findAccount(scanner.next());
        System.out.print("예금액: ");
        account.setBalance(account.getBalance() + scanner.nextInt());
        System.out.println("결과: 예금이 성공하였습니다");
    }

    private static void withdraw() {
        System.out.println("---------");
        System.out.println("출금");
        System.out.println("---------");
        System.out.print("계좌번호: ");
        Account1 account = findAccount(scanner.next());
        System.out.print("출금액: ");
        account.setBalance(account.getBalance() - scanner.nextInt());
        System.out.println("결과: 출금이 성공하였습니다");
    }

    private static Account1 findAccount(String ano) {
        Account1 account = null;
        for(int i=0; i< accountArray.length; i++) {
            if(accountArray[i]!=null) {
                if(accountArray[i].getAno().equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

}
