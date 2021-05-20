package demo03;

public class Teacher extends Person{
    private String course;
    public Teacher(){};
    public Teacher(String course){
        this.course = course;
    }
    public String getCourse(){
        return this.course;
    }

    public void setCourse(String course){
        this.course = course;
    }
    public void teach(){
        super.setName("wang xiao ping");
        System.out.println(super.getName()+"is teaching"+this.course);
    }
}
