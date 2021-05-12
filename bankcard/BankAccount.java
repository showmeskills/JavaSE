public class BankAccount{
    private String cardNumber;
    private String pwd;
    private long balance;
    public BankAccount(){};

    public void setCardNumer(String cardNumber){
  
            this.cardNumber = cardNumber;
    
    }
    public void setPwd(String pwd){

            this.pwd = pwd;
        
    }
    public void setBalance(long balance){
        this.balance = balance;
    }
    private long interestRate(){
        this.balance += (this.balance * 0.0001);
        return this.balance;
    }
    public void info(){
        System.out.println("card:\t"+this.cardNumber+",pwd:\t"+this.pwd+",balance:\t"+this.balance);
    }
    public void setUpAccount(String cardNumber,String pwd,long balance){
        if(cardNumber.length() == 19&&pwd.length()==6&&balance>0 ){
            this.setCardNumer(cardNumber);
            this.setPwd(pwd);
            this.setBalance(balance);
            if(balance>100000){
                this.interestRate();
            }
            System.out.println("your account created");
        }else{
            System.out.println("your accout is setting failed");
        }

    }
}