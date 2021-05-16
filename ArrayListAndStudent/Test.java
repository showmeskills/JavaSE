import java.util.Scanner;
import java.util.ArrayList;
public class Test {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> student = new ArrayList<Student>();
    while(true){
        System.out.println("1.input info --- 0.exit");
        int code = scanner.nextInt();
        switch(code){
            case 1:
                inputStudentInfo(student,scanner);
                break;
            case 0:
                System.out.println("enter has been done");
        }
        if(code == 0){
            break;
        }
    }
    scanner.close();
    print(student);
  }

  public static void inputStudentInfo(ArrayList<Student> list,Scanner scanner){
    System.out.println("enter your name:");
    String name = scanner.next();
    System.out.println("enter your age:");
    int age = scanner.nextInt();
    Student student = new Student(name,age);
    list.add(student);
  }
  public static void print(ArrayList<Student> list){
    for(int i=0;i<list.size();i++){
        Student student = list.get(i);
        student.show();
    }
  }
}
