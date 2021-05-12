public class Vehicle{
    private int speed;
    private int size;
    private String brand;
    public Vehicle(){}
    public Vehicle(int speed, int size){
        this.speed = speed;
        this.size = size;
        this.brand = "BMW";
    }

    public void move(){
        System.out.println("four whiles to move");
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void speedUp(int speed){
        this.speed +=speed;
    }
    public void speedDown(int speed){
        if(this.speed < 0){
            return;
        }
        this.speed -=speed;
    }
    public int getSpeed(){
        return this.speed;
    }
}