public class Test{
    public static void main(String[] args){
        Foods foods = new Foods();
        Customer customer = new Customer("Terrance",foods);
        Store store = new Store("kfc",foods);
        customer.start();
        store.start();
    }
}