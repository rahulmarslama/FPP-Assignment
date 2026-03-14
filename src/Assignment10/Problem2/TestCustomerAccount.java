package Assignment10.Problem2;
public class TestCustomerAccount
{
    static void main()
    {
        CustomerAccount customerAccount = new CustomerAccount("Rahul Lama","712637123192",400.23);
        /*customerAccount.deposit(-99.90);
        customerAccount.withdraw(500);
        customerAccount.withdraw(320);*/
        customerAccount.deposit(400);
        customerAccount.withdraw(200);
        System.out.println("The remaining balance is "+customerAccount.getBalance());

    }
}