package interest;

public class BankInterest {
    private int fdInterestPercent = 6;
    private int loanInterestPercent = 12;
    public int getFdInterestPercent() {
        return fdInterestPercent;
    }

    public int getLoanInterestPercent() {
        return loanInterestPercent;
    }

    public void setFdInterestPercent(int interestPercent) {
        fdInterestPercent = interestPercent;
    }

    public void setLoanInterestPercent(int interestPercent) {
        loanInterestPercent = interestPercent;
    }
}
