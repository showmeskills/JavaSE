package demo03;

public class Student extends Person{
    private int score;
    public Student(){};
    public Student(int score){
        this.score = score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public void showScore(){
        super.setName("li xiao le");
        System.out.println(super.getName()+"gain"+this.score);
    }
}
