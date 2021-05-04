package demo;

public class Student{
    private int id;
    private String name;
    private int age;
    static String room;//所在的教室
    private static int idCounter = 0;//学号技术器,每当new了一个新对象的时候,计算器++;



    public Student(){
        this.id =++idCounter;
    }//无参构造器
    public Student(String name,int age){//有参构造器
        this.id =++idCounter;
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

}