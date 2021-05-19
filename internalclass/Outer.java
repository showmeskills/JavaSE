public class Outer{

    private int num = 10;
    public Outer (){}
    public void method(int num){
        System.out.println("I am from inner "+num);
        //外部类调用内部类
        new Inner().method(this.num);
    }
    public class Inner{
        private int num = 20;
        public Inner(){}
        public void method(int num){
            System.out.println("I am fron outer"+num);
            //内部类调用外部类
            Outer.this.method(this.num);
        }
    }

}