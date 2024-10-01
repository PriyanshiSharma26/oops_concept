//Question: Implement a BankAccount class with private attributes accountNumber, balance, and accountHolderName. Provide methods to deposit and withdraw money, ensuring that the balance cannot become negative.

class BankAccount
{
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    BankAccount(int accountNumber,double balance,String accountHolderName)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountHolderName=accountHolderName;
    }

    void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("amount deposited "+amount);
        }
        else{
            System.out.println("amount should be positive");
        }
    }

    void withdraw(double amount)
    {
        if(amount>0  && balance>=amount)
        {
            balance=balance-amount;
            System.out.println("withdraw amount is "+amount);
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }

    void display_details()
    {
        System.out.println("account no is "+accountNumber);
        System.out.println("balance is"+balance);
        System.out.println("account holder name is"+accountHolderName);
    }

}

class main_8
{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(1234567, 50000, "vaibhav");
        b1.display_details();
        b1.deposit(500);
        b1.display_details();
        b1.withdraw(40000);
        b1.display_details();
        b1.withdraw(-10000);
    }
}