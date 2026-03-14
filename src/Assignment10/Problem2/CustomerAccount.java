package Assignment10.Problem2;

public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount)
    {
        if (amount <=0)
        {
            throw new IllegalArgumentException("The amount you are trying to deposit should be positive.");
        }
        balance += amount;
        System.out.println("You deposited amount: "+amount);
        return true;
    }

    public boolean withdraw(double amount)
    {
        if(amount > balance)
        {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        }
        if (amount > 0 && amount <= balance) {
            if(balance - amount < 100)
            {
                throw new AccountException("Low balance warning! Balance cannot go below $100.");
            }
            balance -= amount;
            System.out.println("You withdrew amount: "+amount);
            return true;
        }
        return false;
    }

    public double getBalance()
    {
        return balance;
    }
}
