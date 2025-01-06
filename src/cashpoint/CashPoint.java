package cashpoint;

import java.util.Scanner;

public class CashPoint {

    static Scanner sc = new Scanner(System.in);

    private static void checkBalance() {

        System.out.println("Your Balance : " + balance);

    }

    private static void Withdraw() {
        sc.nextLine();
        System.out.print("Enter your amount : ");
        int amount = sc.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Tk. withdrwal sucessfully");
        } else {
            System.out.println("Insufficient balance");
        }

    }

    private static void addMoney() {
        sc.nextLine();
        System.out.print("Enter your amount : ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println(amount + " Tk. Deposit sucessfully");
    }

    static double balance;
    static int pin = 1234;

    public static boolean checkPin() {
        System.out.print("Enter your Pin : ");
        int p = sc.nextInt();
        if (p == pin) {
            return true;
        }
        System.out.println("Invalid Pin!!! ");
        return false;
    }

    public static void main(String[] args) {

        int maxTime = 0;

        while (maxTime != 5 && !checkPin()) {
            checkPin();
        }

        System.out.println("       WELCOME TO CASH POINT");
        System.out.println("=====================================");
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            switch (ch) {

                case 1:
                    checkBalance();
                    System.out.println("");
                    break;
                case 2:
                    Withdraw();
                    System.out.println("");
                    break;
                case 3:
                    addMoney();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("THANK YOU FOR USING CASHPOINT");
                    return;

                default:
                    System.out.println("Inavlid Choice");
                    break;
            }

        }
    }

}
