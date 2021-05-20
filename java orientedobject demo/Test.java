import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        // Month month = new Month();
        // month.month();

        //new Transcription("Terrance");
        // new Tollery();
        //new RandomNumber(5);
        //new TossCoin();

        //new FootableTeam();


        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Jerry", 22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30,80 , "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));
        int avg = list.size();
        int sumAge = 0;
        for(int i=0; i < list.size(); i++){
            sumAge+=list.get(i).getAge();
        }
        System.out.println("sumAge average:"+sumAge/avg);

        int sumScore = 0;
        for(int i=0; i < list.size(); i++){
            sumScore+=list.get(i).getScore();
        }
        System.out.println("sumScore average:"+sumScore/avg);
    }
}
