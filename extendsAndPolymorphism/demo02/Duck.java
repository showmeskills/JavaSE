package demo02;

public class Duck extends Poultry{
    public Duck(){}
    public Duck(String name, String symptom, int age, String illness){
        super(name,symptom,age,illness);
        this.showSymptom();
    }

    @Override
    public void showSymptom(){
        super.showMsg();
    }
}
