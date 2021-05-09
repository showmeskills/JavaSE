public class TestStudent {
    public static void main(String[] args) {
        Student[] student = new Student[20];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].name = "T" + i;
            student[i].number = i + 1;
            student[i].score = (int) ((long) Math.round((double) (Math.random() * (100 - 0 + 1))));
        }
        TestStudent testStudent = new TestStudent();
        testStudent.sort(student);
        testStudent.print(student);

    }
    /**
     * @Description print student 
     * @param student
     */
    public void print(Student[] student){
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].info());
        }
    }
    /**
     * @Description sort student array
     * 
     */
    public void sort(Student[] student) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - 1 - i; j++) {
                if (student[j].score > student[j+1].score) {
                    Student temp = student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }
        }
    }
}

class Student {
    String name;
    int number;
    int score;

    public String info() {
        return "name:" + this.name + "学号:" + this.number + "成绩:" + this.score;
    }
}
