public class Laptop{
    char color;
    int cpu;
    public Laptop(){}
    public Laptop(char color,int cpu){
        this.color = color;
        this.cpu = cpu;
    }
    public String info(){
        String result = "laptop color:"+this.color+"\t"+"laptop cpu:"+this.cpu;
        return result;
    }
}