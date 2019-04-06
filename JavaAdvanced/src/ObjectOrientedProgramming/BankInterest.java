package ObjectOrientedProgramming;

public class BankInterest {
    public static void main(String[] args) {
        System.out.println("Year Current Balance Interest New Deposit New Balance");
        printTable();
    }

    private static void printTable() {
        int year=1;
        double currentBalance=1000.00;
        double interest;
        double newDeposit=0.00;
        double newBalance;

        for (int i = 0; i < 25; i++) {
//            interest=(currentBalance+newDeposit)*6.50/100; //I think this is the right answer to this problem!!!
            interest=(currentBalance)*6.50/100;
            newBalance=currentBalance+interest+newDeposit;
            System.out.printf("%2s %13.2f %11.2f %10.2f %11.2f \n"
                    , year
                    , currentBalance
                    , interest
                    , newDeposit
                    , newBalance);
            year++;
            newDeposit=100.00;
            currentBalance=newBalance;
        }
    }
}