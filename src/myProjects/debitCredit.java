package myProjects;

import java.util.Scanner;

public class debitCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----------MENU-----------");
        System.out.println("1. Amount to be debited");
        System.out.println("2. Amount to be credited");
        System.out.println("3. View balance");
        System.out.println("4. Quit");

        System.out.println("Enter your choice");
        int menu = input.nextInt();

        int total = 0;

        while(menu!=4) {
            switch (menu) {
                case 1:
                    System.out.println("What is the amount you want to debit");
                    int debit = input.nextInt();
                    total += debit;
                    System.out.println("Choose again");
                    menu = input.nextInt();

                case 2:
                    System.out.println("What is the amount you want to credit");
                    int credit = input.nextInt();
                    total -= credit;
                    System.out.println("Choose again");
                    menu = input.nextInt();

                case 3:
                    System.out.println("The balance of your account is: " + total);
                    System.out.println("Choose again");
                    menu = input.nextInt();
            }

        }
    }
}
