import java.util.Scanner;

public class ScannerTest{
    Scanner scanner = new Scanner(System.in);

    public ScannerTest(){}

    public void result(){
        String type = scanner.next();
      
        int upperCase = 0;
        String upperStr = "";
        int lowerCase = 0;
        String lowerStr = "";
        int num = 0;
        String numStr = "";
        for(int i = 0; i < type.length();i++){
            char charType = type.charAt(i);
            if(charType >='A' && charType <= 'Z'){
                upperCase++;
                upperStr += charType;
            }
            if(charType >='a' && charType <= 'z'){
                lowerCase++;
                lowerStr += charType;
            }
            if(charType >='0' && charType <= '9'){
                num++;
                numStr += charType;
            }
        }
        System.out.println("upper:"+upperCase+"times---"+upperStr);
        System.out.println("lower:"+lowerCase+"times---"+lowerStr);
        System.out.println("num:"+num+"times---"+numStr);
        scanner.close();
    }
    public void result2(){
        String type = scanner.next();
        char[] charType = type.toCharArray();
        int upperCase = 0;
        String upperStr = "";
        int lowerCase = 0;
        String lowerStr = "";
        int num = 0;
        String numStr = "";
        for(int i = 0; i < type.length();i++){
           
            if(charType[i] >='A' && charType[i] <= 'Z'){
                upperCase++;
                upperStr += charType[i];
            }
            if(charType[i] >='a' && charType[i] <= 'z'){
                lowerCase++;
                lowerStr += charType[i];
            }
            if(charType[i] >='0' && charType[i] <= '9'){
                num++;
                numStr += charType[i];
            }
        }
        System.out.println("upper:"+upperCase+"times---"+upperStr);
        System.out.println("lower:"+lowerCase+"times---"+lowerStr);
        System.out.println("num:"+num+"times---"+numStr);
        scanner.close();
    }
    public void result3(){
        String type = scanner.next();
        char[] charType = type.toCharArray();
        if(type.length() == 8){
            for(int i = 0; i < type.length(); i++){
                if(charType[i] >='A' && charType[i]<='Z'){
                    charType[i] = 'M';
                }
                System.out.print(charType[i]);
            }
        }else{
            System.out.println("length is not eligible");
        }

        scanner.close();
    }

}