package JavaPractise;
import java.util.ArrayList;
public class ArrayListStudent {
    public static void main(String[] args) {
        //ArrayList 创建类数组
        ArrayList<Student> student = new ArrayList<Student>();
        Student one = new Student("Tom",18);
        student.add(one);
        student.add(new Student("Jack",20));

        for(int i = 0; i < student.size(); i++) {
            Student name = student.get(i);
            Student age = student.get(i);
            System.out.println(name.getName()+" "+age.getAge());
        }
    }
}
