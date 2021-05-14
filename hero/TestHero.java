public class TestHero {
    public static void main(String[] args){
        Hero hero = new Hero("Terrance");
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.hurt();
        hero.eat(50);
        System.out.println(hero.power);
        hero.go();
    }
}
