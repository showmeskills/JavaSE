public class User{
    private String username;
    private int balance;

    public User(){}
    public User(String username,int balance){
        this.username = username;
        this.balance = balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void show(){
        System.out.println("name:"+this.username+"\tbalance:"+this.balance);
    }
}