public class Student{
    private int sNo;
    private String sName;
    private int sAge;
    private int sJava;

    public Student(){}
    public Student(int sNo,String sName, int sAge,int sJava){
        this.sNo = sNo;
        this.sName = sName;
        this.sAge = sAge;
        this.sJava = sJava;
    }
    public int getNo(){
        return this.sNo;
    }
    public String getName(){
        return this.sName;
    }
    public int getAge(){
        return this.sAge;
    }
    public int getJava(){
        return this.sJava;
    }

}