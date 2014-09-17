package com.example.ModifiedATMProgram;
import java.util.Scanner;

public class ModifiedATMProgram {

    private double depositAmount;
    private double withdrawAmount;
    private double balanceAmount;

    public void setDepositAmount(double userDeposit) {
        depositAmount = userDeposit;
    }

    public void setWithdrawAmount(double userWithdraw) {
        withdrawAmount = userWithdraw;
    }

    public void setBalanceAmount(double currentBalance) {
        balanceAmount = currentBalance;
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

}
