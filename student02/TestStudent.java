import java.util.Random;

public class TestStudent {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        String[] name = new String[]{"Terrance","Errick","Terry","loogar","test"};
        Random random = new Random();
        TestStudent testStudent = new TestStudent();
        int score = 0;
        int max = 0;
        int tempmin =0;
        for(int i = 0; i <student.length; i++) {
            int sNo = random.nextInt(9)+1;
            int sAge = (int)(Math.random()*(20-10+1)+10);
            int sJava = (int)(Math.random()*(100-1+1)+1);
            student[i] = new Student(sNo,name[i],sAge,sJava);
            int min = student[0].getJava();
            System.out.println("name:"+student[i].getName());
            System.out.println("age:"+student[i].getAge());
            System.out.println("No:"+student[i].getNo());
            System.out.println("Java:"+student[i].getJava());
            System.out.println("-----------------------");
            score += student[i].getJava();
            if(student[i].getJava()>max){
                max = student[i].getJava();
            }
            if(student[i].getJava()<min){
                min = student[i].getJava();
                tempmin = min;
            }
        }
        testStudent.avgScore(score);
        testStudent.min(tempmin);
        testStudent.max(max);
    }
    public void avgScore(int score){
        System.out.println("avg scor:" + (score/5));
    }
    public void max (int max){
        System.out.println("max:" + max);
    }
    public void min(int min){
        System.out.println("min:" + min);
    }
}
