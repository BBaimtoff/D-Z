public class Main {
    public static void main(String[] args) {
        Boss Tanos = new Boss();
        Tanos.setBossDefence("Physics");
        Tanos.setBossHealth(1000);
        Tanos.setBossDamage(100);
        System.out.println(Tanos.getBossDamage());
        System.out.println(Tanos.getBossHealth());
        System.out.println(Tanos.getBossDefence());




        Hero Idol = new Hero();
        Idol.getHerodamage();
        Idol.getHeroHealth();
        Idol.getHeroSuperPower();
        System.out.println("HeroDamage: " + Idol.getHerodamage() + " HeroHealth: " + Idol.getHeroHealth() +
                " SuperPower: " + Idol.getHeroSuperPower());

     }
}
