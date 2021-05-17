import java.util.Scanner;

public class QQLogin {
    private String account = "465446853";
    private String pwd = "88Y04A30n";
    public QQLogin(){
        this.login();
    };

    public void login(){
        Scanner scanner = new Scanner(System.in);
        int error = 0;
        boolean isFlag = true;
        while(isFlag){
            error++;
            System.out.println("please enter your account");
            String account = scanner.next();
            System.out.println("please enter your pwd");
            String pwd = scanner.next();
            if(account.equals(this.account) && pwd.equals(this.pwd)){
                System.out.println("login successfully");
                break;
            }else{
                System.out.println("login failed"+"your current error is"+error+"times");
                if(error == 3){
                    System.out.println("your error is larger than" +error+"times");
                    break;
                }
                
            }
        }
        scanner.close();
    }
}