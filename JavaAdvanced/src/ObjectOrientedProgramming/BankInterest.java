/*
Exercise 1.4:
A certain bank offers 6.5% interest on savings accounts, compounded annually. Create a table that shows how much money
a person will accumulate over a period of 25 years, assuming that the person makes an initial investment of $1000 and
deposits $100 each year after the first. Your table should indicate for each year the current balance, the interest,
the new deposit, and the new balance. The output of the program should like something like this:

Year Current Balance Interest New Deposit New Balance
 1       1000,00       65,00       0,00     1065,00
 2       1065,00       69,23     100,00     1234,23
 3       1234,23       80,22     100,00     1414,45
 ...
 25       9542,88      620,29     100,00    10263,16

Made by Vladislav Velinov.
*/
package ObjectOrientedProgramming;

public class BankInterest {
    public static void main(String[] args) {
        System.out.println("Year Current Balance Interest New Deposit New Balance");
        printTtable();
    }

    private static void printTtable() {
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