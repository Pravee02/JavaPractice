package javabasics;

class Bankaccount {
    private String name;
    private double balance;
    private String accountnumber;


    //constructor set initial values
    Bankaccount(String name, double balance, String accountnumber) {
        this.name = name;
        this.balance = balance;
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    // to change balance

    public void deposite(double amount) {
        if (amount >= 0)
            balance += amount;
        else
            System.out.println("invalid amount ");
    }

    public void withdrow(double amount) {
        if (amount <= balance && amount > 0)
            balance -= amount;
        else
            System.out.println("invalid amount or insuffieant amount  ");
    }
}





public class Encapsulation7{
    public static void main(String[] args) {

        Bankaccount acc= new  Bankaccount("Praveen",10_000,"SBI101");
        System.out.println(acc.getName());
        System.out.println(acc.getAccountnumber());
        System.out.println(acc.getBalance());

        acc.deposite(5000);
        acc.withdrow(3000);


        System.out.println(acc.getName());
        System.out.println(acc.getAccountnumber());
        System.out.println(acc.getBalance());
    }
}