public class Student{
    private int sNO;
    private String sName;
    private int sAge;
    private int sJava;
    public Student(int sNO,String sName,int sAge, int sJava){
        this.sNO = sNO;
        this.sName = sName;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public int getNo (){
        return this.sNO;
    }
    public String getName (){
        return this.sName;
    }
    public int getAge (){
        return this.sAge;
    }
    public int getJava (){
        return this.sJava;
    }
}