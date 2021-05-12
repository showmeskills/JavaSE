public class CreditCard{
    private String card_number;
    private int password;

    public CreditCard() {
        this.password = 123456;
    }

    public CreditCard(String card_number, int password) {
        this.card_number = card_number;
        this.password = password;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}