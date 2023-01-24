package OOP_Inheritance;

public class BankAccount_Main {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("123456789", 250.0, "my account", "myaccount@bank.com",
//                "2165328974");
        //i have created constructor with parameter. So i can comment out these lines
//        BankAccount myAccount = new BankAccount();
//        myAccount.setNumber("123456789");
//        myAccount.setCustomerName("My Account");
//        myAccount.setCustomerEmail("myaccount@bank.com");
//        myAccount.setBalance(350);

        OOP_Inheritance.BankAccount myAccount = new OOP_Inheritance.BankAccount();
        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());

        myAccount.depositFunds(250);
        myAccount.withdrawalAmount(50);
        //here we have 200$ in myAccount
        myAccount.withdrawalAmount(201);
        //here i put some more balance to myAccount
        myAccount.depositFunds(300);
        myAccount.withdrawalAmount(150);
        myAccount.withdrawalAmount(151);

        OOP_Inheritance.BankAccount timsAccount = new OOP_Inheritance.BankAccount("Tim", "tim@mail.com", "13245698");
        System.out.println("Account no :" + timsAccount.getNumber() + "; name :" + timsAccount.getCustomerName());
    }
}
