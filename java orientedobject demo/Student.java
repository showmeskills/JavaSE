

public class Student {
   private String name;
   private int age;
   private int score;
   private String classNumber;
   public Student(){};
   public Student(String name, int age, int score, String classNumber){
       this.name = name;
       this.age = age;
       this.score = score;
       this.classNumber = classNumber;
   }
   public void print(){
      System.out.println("class:"+this.classNumber+",name:"+this.name+",score:"+this.score+",age"+this.age);
   }
   public int getScore(){
     return this.score;
   }
   public int getAge(){
       return this.age;
   }
}
