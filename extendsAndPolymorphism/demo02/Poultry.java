package demo02;

public abstract class Poultry{
    private String name;
    private String symptom;
    private int age;
    private String illness;

    public Poultry(){};
    public Poultry(String name, String symptom, int age, String illness){
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }
    public abstract void showSymptom();

    public void showMsg(){
        System.out.println("动物名字:"+this.name+"age:"+this.age);
        System.out.println("reason:"+this.illness);
        System.out.println("symptom:"+this.symptom);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSymptom(){
        return this.symptom;
    }
    public void setSymptom(String symptom){
        this.symptom = symptom;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getIllness(){
        return this.illness;
    }
    public void setIllness(String illness){
        this.illness = illness;
    }
}