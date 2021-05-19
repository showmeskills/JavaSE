package newInterfaceAdVar;

public class Hero {
    private String name;
    private Skill skill;
    public Hero(){};
    public Hero(String name, Skill skill){
        this.name = name;
        this.skill = skill;
    }
    public void attack(){
        System.out.print("name:"+this.name+", is using");
        this.getSkill().use();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSkill(Skill skill){
        this.skill = skill;
    }
    public Skill getSkill(){
        return this.skill;
    }

}
