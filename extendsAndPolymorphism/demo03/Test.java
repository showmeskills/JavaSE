package demo03;

public class Test {
    public static void main(String[] args){
       

        Teacher teacher = new Teacher("java");
        teacher.teach();

        Student student = new Student(90);
        student.showScore();
    }
}
