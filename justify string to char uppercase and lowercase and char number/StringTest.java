import java.util.Scanner;

public class StringTest {
    private int alphbites = 0;
    private int number = 0;
    public StringTest() {
        this.setStr();
    };

    public void setStr(){
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        char[] charType = type.toCharArray();
        for(int i = 0; i < type.length(); i++){
            if(charType[i] >= '0' && charType[i] <= '9'){
                this.number++;
            }else if(charType[i] >= 'a' && charType[i] <='z' || charType[i]>='A' && charType[i] <= 'Z'){
                this.alphbites++;
            }
        }
        System.out.println("number is "+this.number+",alphbites are"+this.alphbites);
        scanner.close();
    }

}