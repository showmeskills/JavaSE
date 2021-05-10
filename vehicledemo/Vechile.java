public class Vechile{
    private String brand;
    private String color;
    private double speed;
    /**
     * @Description non-parameters constructor for current class
     */
    public Vechile(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    /**
     * @Description get private variables members
     */
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public double getSpeed(){
        return this.speed;
    }

    /**
     * @Description run functionality
     */
    public void run(){
        System.out.println(this.brand+"\tis\t"+this.color+"\tcolor\t"+"\tits speeding is\t" +this.speed);
    }


}