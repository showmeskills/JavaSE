
public class PractiseTwo {
    public static void main(String[] args) {
          // 对象数组(类数组) 类似于声明20次 student
          Student[] student = new Student[20];// String[] arr = new String[20];
          for (int i = 0; i < student.length; i++) {
              // new 20次 student
              student[i] = new Student();
              // 给student 对象属性赋值
              student[i].number = i + 1;
              // 年级1-6；
              student[i].state = (int) ((long) Math.round((double) (Math.random() * (6 - 1 + 1) + 1)));
              // score [0-100]
              student[i].score = (int) ((long) Math.round((double) (Math.random() * (100 - 0 + 1))));
            
          }
          PractiseTwo practiseTwo = new PractiseTwo();
          practiseTwo.searchState(student, 5);
          System.out.println();
          practiseTwo.sort(student);
          System.out.println();
          practiseTwo.print(student);
      
    }
    //遍历student[]数组操作
    public void print(Student[] student){
        for (int i = 0; i < student.length; i++) {
            // System.out.println(student[i].number+" "+student[i].state+"
            // "+student[i].score);
            System.out.println(student[i].info());
        }
    }
    /**
     * @Description 查找student数组中指定年级的信息
     * @author Terrance
     * @date 2021年4月23日下午4:19:54
     * @param student 要查找的数组
     * @param state要找的年级
     */
    //获取state 3 的学生信息
    public void searchState(Student[] student,int state){
        for(int i = 0; i < student.length; i++){
            if (student[i].state == state) {
                 System.out.println(student[i].info());
            }
        }
    }
    /**
     * @Description 给student排序
     * @param student
     */
    public void sort(Student[] student){
           //冒泡排序
           for (int i = 0; i < student.length - 1; i++) {
            for(int j = 0; j <student.length- 1 - i;j++){
                if(student[j].score > student[j+1].score){
                    Student temp = student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }
        }
    }
}

class Student {
    int number;
    int state;
    int score;
    // 显示学生信息方法
    public String info() {
        return "number:" + this.number + "年级:" + this.state + "成绩:" + this.score;
    }
}
