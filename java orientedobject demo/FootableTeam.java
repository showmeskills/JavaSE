import java.util.Random;
import java.util.ArrayList;

public class FootableTeam {
    private ArrayList<String> team1 = new ArrayList<String>();
    private ArrayList<String> team2 = new ArrayList<String>();
    private ArrayList<String> team3 = new ArrayList<String>();
    private ArrayList<String> team4 = new ArrayList<String>();
    private String[] allTeam = new String[]{"Ivory Coast", "Argentina", "Australia", "Serbia", "Netherlands", "Nigeria", "Japan", "United States", "China", "New Zealand", "Brazil", "Belgium", "South Korea", "Cameroon", "Honduras", "Italy"};
    private Random random = new Random();

    public FootableTeam() {
        this.distribution();
    };
    public void distribution(){
        int teams = 4;
        int allTeam = this.allTeam.length;
        int [] distributionArray = new int[teams];
        for(int i=0; i<teams;i++){
            int random = this.random.nextInt(4)+1;
            if(random%2 == 1){
                random++;
            }
            allTeam -= random;
            distributionArray[i] = random;
        }
        distributionArray[teams -1] += allTeam;
        this.makeTeam(distributionArray);
    }
    public void makeTeam(int[] distributionArray){
        int index = -1;
        for(int i = 0; i < distributionArray[0]; i++){
            index++;
            this.team1.add(this.allTeam[index]);
            System.out.println("team1:"+this.team1.get(i));
        }  
        for(int i = 0; i < distributionArray[1]; i++){
            index++;
            this.team2.add(this.allTeam[index]);
            System.out.println("team2:"+this.team2.get(i));
        }
        for(int i = 0; i < distributionArray[2]; i++){
            index++;
            this.team3.add(this.allTeam[index]);
            System.out.println("team3:"+this.team3.get(i));
        }
        for(int i = 0; i < distributionArray[3]; i++){
            index++;
            this.team4.add(this.allTeam[index]);
            System.out.println("team4:"+this.team4.get(i));
        }
    }
}
