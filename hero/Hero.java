public class Hero{
    int power;
    String name;
    public Hero(){
        this.power = 100;
    }
    public Hero(String name){
        this.name = name;
        this.power = 100;
    }
    public void go(){
        if(this.power <=0){
            System.out.println("can\'t move");
        }else{
            System.out.println("move");
        }
    }
    public void eat(int n){
       if(this.power + n >100){
            this.power = 100;
       }else{
           this.power+=n;
       }
    }
    public void hurt(){
        this.power -= 10;
        if(this.power < 0){
            this.power = 0;
        }
    }
}