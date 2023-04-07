package com.interest;

import com.interest.banks.BankInterest;

public class Main {
    public static void main(String[] args) {
        BankInterest bnkInt = new BankInterest();
        System.out.println("Thanks for using our service");
        int actualFdInterest = bnkInt.getFdInterestPercent();
        System.out.println("Previous Fd interest:" + actualFdInterest);
        bnkInt.setFdInterestPercent(actualFdInterest - 1);
        int changedFdRate = bnkInt.getFdInterestPercent();
        System.out.println("After decreased repo rates:" + changedFdRate);
        System.out.println("Previous Loan interest:" + bnkInt.getLoanInterestPercent());
        bnkInt.setLoanInterestPercent(bnkInt.getLoanInterestPercent() - 1);
        System.out.println("After decreased repo rates:" + bnkInt.getLoanInterestPercent());
    }
}
