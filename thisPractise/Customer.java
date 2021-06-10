public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(){}
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAccount (Account account) {
        this.account = account;
    }
    public Account getAccount() {
        return this.account;
    }
}
