public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    public Bank() {
        this.customers = new Customer[10];
    };

     

    public void addCustomer(String f, String l){
       Customer customer = new Customer(f, l);
       customers[numberOfCustomers++] = customer;
    }
    public Customer getCustomer(int index){
        if(index >=0 && index < this.numberOfCustomers){
            return this.customers[index];
        }else{
            return null;
        }
    }
    public int getNumberOfCustomers(){
        return this.numberOfCustomers;
    }
}
