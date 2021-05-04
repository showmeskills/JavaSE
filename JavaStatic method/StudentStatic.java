package demo;
/*
    如果一个成员变量使用static关键字,那么这个变量不再属于对象自己
    它属于所在的类型,多个对象共享同一份数据
*/
public class StudentStatic {
    public static void main(String[] args) {
        Student studentOne = new Student("terrance",16);
        Student.room = "101教室";
        System.out.println("name:"+studentOne.getName()+",age:"+studentOne.getAge()+",room:"+Student.room+",学号:"+studentOne.getId());

        Student studentTwo = new Student("terry",25);
        System.out.println("name:"+studentTwo.getName()+",age:"+studentTwo.getAge()+",room:"+Student.room+",学号:"+studentTwo.getId());


  
        MyClass.methodStatic();
    }
}
