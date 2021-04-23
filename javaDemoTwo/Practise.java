import java.util.Arrays;

public class Practise{
    public static void main(String[] args){
        // Rectangle rectangle = new Rectangle();
        // int result = rectangle.method(5,4);
        // System.out.println(result);

        StudentOne student = new StudentOne();
         student.method();
       
    }
}


class Rectangle{
    int size;
    public int method(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       return this.size = m*n;
    }
}


class StudentOne{
    int number;
    int state;
    int score;
    public void method(){
        int[][] student = new int[20][];
        for(int i=0;i<student.length;i++){
            this.number = i+1;
            this.state=(int)((long)Math.round((double)Math.random()*10));
            this.score=(int)((long)Math.round((double)Math.random()*10));
            student[i] = new int []{this.number,this.state,this.score};
              if(this.state == 3){
               System.out.println("when state equls to three, the student number:"+this.number+"state:"+state+"score:"+score);
            }
        }
        for(int i=0;i<student.length-1;i++){
            for(int j = 0; j <student.length- 1 - i;j++){
                if(student[j][2] > student[j+1][2]){
                    int temp = student[j][2];
                    student[j][2] = student[j+1][2];
                    student[j+1][2] = temp;
                }
            }
        }

        for(int i=0;i<student.length;i++){
            System.out.print(Arrays.toString(student[i]));
        }
        
    }
}


