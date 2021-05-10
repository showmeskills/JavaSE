public class Person {
    private String name;
    private char gender;
    private int age;
    public Person(){}

    public Person(String name, char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setGender(char gender){
        if(gender == '男' || gender == '女') this.gender = gender;
    }
    public char getGender(){
        return this.gender;
    }

    public void setAge(int age){
        if(age>=0 || age <= 150){
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }
}
