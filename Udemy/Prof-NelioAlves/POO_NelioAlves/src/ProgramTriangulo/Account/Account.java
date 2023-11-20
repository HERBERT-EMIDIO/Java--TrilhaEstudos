package ProgramTriangulo.Account;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    Account(int number, String holder, double initialDepoist) {
        this.number = number;
        this.holder = holder;
        deposit(initialDepoist);
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }


    public void setHolder(String holder) {
        this.holder = holder;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }


    public String toString(){
        return "Account "
                +this.number
                +", Holder: "
                +this.holder
                +", Balance: $ "
                +String.format("%.2f",this.balance);
    }


}
