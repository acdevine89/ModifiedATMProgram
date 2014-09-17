package com.example.ModifiedATMProgram;
import java.util.Scanner;

public class ModifiedATMDemo {
    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
    int userChoice;
    boolean quit = false;
    ModifiedATMProgram myATM = new ModifiedATMProgram();

    do {
        System.out.println("ATM Menu: What would you like to do?");
        System.out.println("1 - Deposit funds");
        System.out.println("2 - Withdraw funds");
        System.out.println("3 - Check balance");
        System.out.println("4 - Quit program");
        System.out.print("Enter menu selection by typing number here: ");
        userChoice = user.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println();
                System.out.print("Deposit amount: $");
                myATM.setDepositAmount(user.nextDouble());
                System.out.println("$" + myATM.getDepositAmount() + " deposited successfully.");
                System.out.println();
                break;
            case 2:

        }

    } while (!quit);


    }
}
