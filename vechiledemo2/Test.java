public class Test {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(100,20);
        vehicle.speedUp(10);
        System.out.println(vehicle.getSpeed());
        vehicle.speedDown(50);
        System.out.println(vehicle.getSpeed());

    }
}
