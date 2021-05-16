import java.util.Random;
import java.util.Scanner;
public class VerificationCode {
    private String code;

    public void setCode() {
        char[] arrChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
                'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
                'z' };
        Random random = new Random();
        String code = "";
        for(int i = 0; i < 6; i++){
            int index = random.nextInt(arrChar.length);
            code+=arrChar[index];
        }
        this.code = code;
    }
    public String getCode (){
        this.setCode();
        return this.code;
    }
    public void typeCode(String code){
        System.out.println(this.code);
        Scanner scanner = new Scanner(System.in);
        boolean isFlag = true;
        while(isFlag){
            String comparedCode = scanner.next();
            if(comparedCode.equals(code)){
                isFlag = false;
                System.out.println("verify successfully");
            }else{
                System.out.println("verify code is invalid");
            }
        }
        scanner.close();
    }
}
