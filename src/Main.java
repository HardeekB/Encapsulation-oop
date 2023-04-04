public class Main{
    public static void main(String[] args) {
        bankInterest bnkInt = new bankInterest();
        System.out.println("Thanks for using our service");
        int actual = bnkInt.getInterestPercent();
        System.out.println("Actual interest:" +actual);
        bnkInt.setInterestPercent(actual+1);
        int changed = bnkInt.getInterestPercent();
        System.out.println("After increased repo rates:" +changed);
    }
}