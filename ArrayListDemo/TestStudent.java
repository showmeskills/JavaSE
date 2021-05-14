import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student[] stu = new Student[5];
        String[] name = new String[]{"Terrance","Terry","Erick","John","Ben"};
        TestStudent testStudent = new TestStudent();
        for(int i = 0; i < stu.length; i++){
            int age = (int)(Math.random()*(20-10+1)+10);
            int score =(int)(Math.random()*(100-1+1)+1);
            stu[i] = new Student(i,name[i],age,score);
            students.add(stu[i]);
        }
        int allScore = 0;
        int max = students.get(0).getJava();
        int min = students.get(0).getJava();

        for(int i = 0; i < students.size();i++){
            allScore+=students.get(i).getJava();
            System.out.println("name:"+students.get(i).getName()+",age:"+ students.get(i).getAge()+",java:"+students.get(i).getJava());
            if(students.get(i).getJava()>max){
                max = students.get(i).getJava();
            }
            if(students.get(i).getJava()<min){
                min = students.get(i).getJava();
            }

        }
        testStudent.avgScor(allScore);
        testStudent.max(max);
        testStudent.min(min);
    }
    public void avgScor(int score){
        System.out.println("avg:"+score/5);
    }
    public void min(int score){
        System.out.println("min:"+score);
    }
    public void max(int score){
        System.out.println("max:"+score);
    }
}
