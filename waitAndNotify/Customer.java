public class Customer extends Thread {
    private Foods foods;
    public Customer(String name,Foods foods){
        super(name);
        this. foods = foods;
    }

    @Override
    public void run(){
        while(true){
            System.out.println("customer eats food");
            synchronized(this.foods){

                if(this.foods.getStock() == false){
                    try{
                        this.foods.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("customer is eating food"+this.foods.getInSide()+this.foods.getOutside()+"type of food");
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                this.foods.setStock(false);
                this.foods.notify();
                System.out.println("customer has eaten foods===>"+this.foods.getInSide()+this.foods.getOutside());
                System.out.println("Inform store to start making foods");
                System.out.println("--------------------------------------------------------");
            }
        }
    }
}
