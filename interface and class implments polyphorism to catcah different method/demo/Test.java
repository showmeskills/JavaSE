package demo;

public class Test {
    public static void main(String[] args){
        // Star star = new Star();
        // star.shine();
        // Sun sun = new Sun();
        // sun.doAnything();
        //使用匿名内部类
        // new Sun(){
        //     @Override
        //     public void shine(){
        //         System.out.println("sun is shining");
        //     }
        // }.shine();
        //star 是父类
        //Sun是子类
        // Star star = new Sun();
        // star.shine();//多态先调用子类的方法如果没有再去父类中寻找
        // //向下转型,调用子类中的方法
        // Sun sun = (Sun)star;
        // sun.shine();
        // sun.doAnything();


        Universe uni = new Sun();
        Sun sun = (Sun) uni;
        sun.shine();
        sun.doAnything();
    }
}
