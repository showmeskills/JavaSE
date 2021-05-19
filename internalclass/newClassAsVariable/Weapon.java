package newClassAsVariable;

public class Weapon {
    private String weaponcode;
    public Weapon(){};
    public Weapon(String weaponcode){
        this.weaponcode = weaponcode;
    }
    public String getWeaponcode(){
        return this.weaponcode;
    }
    public void setWeaponcode(String weaponcode){
        this.weaponcode = weaponcode;
    }
}
