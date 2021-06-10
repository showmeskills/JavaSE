public class Account{
    private double balance;
    public Account(double balance){
        this.setBalance(balance);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withDraw(double amount){
        if(this.balance < amount){
            System.out.println("insufficient account");
        }else{
            this.balance -= amount;
        }
    }
    public void deposite(double amount){
        this.balance += amount;
    }
    
}