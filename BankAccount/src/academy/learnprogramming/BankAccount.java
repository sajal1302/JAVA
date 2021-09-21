package academy.learnprogramming;

public class BankAccount {


    static String bankName = "Bank of India"; //common for all
    String accountHolderName; //instance variable or non static variable//jvm initialize them with default value
    String accountNumber;
    float balance;

    public static void main(String[] args) {
        double loanInterestRate = 7.5;
        System.out.println(Main.bankName);
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHolderName = "JOHN";
        bankAccount.accountNumber = "0001";
        bankAccount.balance = 2000f;
        System.out.println();
    }

}

