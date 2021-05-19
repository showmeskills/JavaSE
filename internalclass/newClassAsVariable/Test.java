package newClassAsVariable;

public class Test {
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.setName("ai she");
        hero.setWeapon(new Weapon("axes"));
        hero.attack();
    }
}
