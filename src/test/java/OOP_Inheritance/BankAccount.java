package OOP_Inheritance;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //How to create constructor
    //same name with class
    //no return type even void
    public BankAccount(){
        //this () method calls another constructor. Then we make chaining constructor.
        //this this () must be the first in the constructor
        this("23423", 323.0, "James", "myaccount@mail.com", "12335436");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone){

        System.out.println("Account constructor with parameters called");
        //setNumber(number);
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.5, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount){

        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawalAmount(double withdrawalAmount){

        if (balance - withdrawalAmount < 0){
            System.out.println("Insufficient amount of $" + withdrawalAmount + " processed, remaining balance $" +balance);
        }else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
