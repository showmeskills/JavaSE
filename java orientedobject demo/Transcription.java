import java.util.Scanner;

public class Transcription {
    private Scanner scanner = new Scanner(System.in);
    private boolean isFlag = false;
    private String name;
    public Transcription(){};
    public Transcription (String name){
        this.name = name;
        this.printTranscription();
    }
    public void printTranscription(){
        int sum = 0;
        int avg = 0;
        System.out.println("please enter your 5 courses score");
        for(int i=0; i< 5; i++){
            int score = scanner.nextInt();
            if(score < 0){
                this.isFlag = true;
                break;
            }else if(score >= 0){
                sum += score;
                avg++;
            }
        }
        if(isFlag){
            System.out.println("your score cant\'t be negative");
        }else{
            System.out.println("name:"+this.name+",sum :"+sum+",avg:"+(sum/avg));
        }
    }
}
