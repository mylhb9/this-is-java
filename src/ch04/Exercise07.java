package ch04;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        bank:
        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.printf("선택> ");

            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.printf("예금액> ");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.printf("출금액> ");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    break bank;

            }

        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
