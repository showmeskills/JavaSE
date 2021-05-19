package newClassAsVariable;

public class Hero {
    private String name;
    private Weapon weapon;
    public Hero(){};
    public Hero(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println("hero name is:"+this.name+"using "+this.getWeapon().getWeaponcode());
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return this.weapon;
    }
}
