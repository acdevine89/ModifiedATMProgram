package com.example.ModifiedATMProgram;
import java.util.*;

public class ModifiedATMProgram {

    Scanner user = new Scanner(System.in);
    private double depositAmount;
    private double withdrawAmount;
    private double balanceAmount = 0;

    public void setDepositAmount(double userDeposit) {
        depositAmount = userDeposit;
        balanceAmount += depositAmount;
    }

    public void setWithdrawAmount(double userWithdraw) {
        withdrawAmount = userWithdraw;
        balanceAmount -= withdrawAmount;
    }

    public void setBalanceAmount() {
        balanceAmount = depositAmount - withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

//    public class GetInteger {
//
//        Scanner userMenuInput = new Scanner(System.in);
//        public void main(String[] args) {
//            System.out.print("Enter menu selection by typing number here: ");
//            int i = GetAnInteger();
//            System.out.println("You entered " + i + ". Good. Now we're getting somewhere!");
//        }
//
//        public int GetAnInteger() {
//            while (true) {
//                try {
//                    return userMenuInput.nextInt();
//                }
//                catch (InputMismatchException e) {
//                    userMenuInput.next();
//                    System.out.print("Invalid choice. Please type 1, 2, 3 or 4: ");
//                }
//
//            }
//        }
//
//    }
//
//    public class GetDouble {
//
//        Scanner userInput = new Scanner(System.in);
//        public void main(String[] args) {
//            System.out.print("Enter menu selection by typing number here: ");
//            double i = GetADouble();
//            System.out.println("You entered " + i + ". Good. Now we're getting somewhere!");
//        }
//
//        public double GetADouble() {
//            while (true) {
//                try {
//                    return userInput.nextDouble();
//                }
//                catch (InputMismatchException e) {
//                    userInput.next();
//                    System.out.print("Invalid choice. Please type 1, 2, 3 or 4: ");
//                }
//
//            }
//        }
//
//    }

}
