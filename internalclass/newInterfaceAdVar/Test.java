package newInterfaceAdVar;

public class Test {
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.setName("ai she wang");
        hero.setSkill(new Skill(){
            @Override
            public void use(){
                System.out.println("旋风赞");
            }
        });
        hero.attack();
    }
}
