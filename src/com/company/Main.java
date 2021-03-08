package com.company;

import java.util.Scanner;


public class Main {
    static int password;
    static int option;
    static int account = 0;
    static int trials = 4;


    public static void displayMenu() {
        System.out.println("What you want to do?");
        System.out.println("1 - Withdrawal cash");
        System.out.println("2 - Deposit cash");
        System.out.println("3 - Check account status");
        System.out.println("4 - Shut down");
    }

    public static void withdrawal(int withdrawalCash) {
        if (account < 0 && withdrawalCash > 0) {
            account -= withdrawalCash;
            System.out.println("Your account status after deposit is: " + account);
        }
        System.out.println("You don't have that cash on your account !\n");
    }

    public static void deposit(int paymentCash) {
        account += paymentCash;
        System.out.println("Your account status after deposit is: " + account + "\n");
    }

    public static void accountBalance() {
        System.out.println("Your account status is: " + account + "\n");
    }

    public static void exit() {
        System.out.println("System will shut down!");
        System.exit(0);
    }

    public static void main(String[] args) {

        System.out.println("Podaj kod pin:");
        Scanner scanner = new Scanner(System.in);
        boolean isApplicationRuning =true;

        while (trials >= 0) {

            password = scanner.nextInt();

            if (password == 3671) {
                while (isApplicationRuning) {
                    displayMenu();
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("How much you want to withdrawal ? ");
                            int moneyMinus = scanner.nextInt();
                            withdrawal(moneyMinus);
                            break;
                        case 2:
                            System.out.println("How much you want to deposit?");
                            int moneyPlus = scanner.nextInt();
                            deposit(moneyPlus);
                            break;
                        case 3:
                            accountBalance();
                            break;
                        case 4:
                            exit();
                            break;
                        default: {
                            System.out.println("Invalid choice!");
                            break;
                        }
                    }
                }
            } else {
                trials--;
                if (trials > 0) {
                    System.out.println("Wrong password, you have only " + trials + " attempts left!");
                } else {
                    System.out.println("\nThe card has been blocked!");
                    exit();
                }
            }
        }
    }
}
