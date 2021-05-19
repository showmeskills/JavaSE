public class localInnerClass {
    
    public void methodClass(){
        class InnerClass{
            private int num;
            public InnerClass(){}
            public void setNum (int num){
                this.num = num;
            }
        }

        new InnerClass();
        new InnerClass().setNum(10);
    }
}
