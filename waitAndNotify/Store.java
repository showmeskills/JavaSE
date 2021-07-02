public class Store extends Thread{
    private Foods foods;
    public Store(String name, Foods foods){
        super(name);
        this.foods = foods;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
            synchronized(this.foods){
                //if the store has food and then going to sleep
                if(this.foods.getStock() == true){
                    try{
                        this.foods.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
               
                if(count%2 == 0){
                    this.foods.setInSide("lamp");
                    this.foods.setOutside("beef");
                }else{
                    this.foods.setInSide("fishing");
                    this.foods.setOutside("vege");
                }
                System.out.println("store need 5 seconds to make food");
                System.out.println("store start to making food type of"+this.foods.getInSide()+"and"+this.foods.getOutside());
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                this.foods.setStock(true);
                this.foods.notify();
                System.out.println("foods have been made"+this.foods.getInSide()+this.foods.getOutside());
                System.out.println("customer can start to eat");
            }
        }
    }
}
