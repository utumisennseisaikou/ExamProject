public class SuperHero extends Hero {
    public SuperHero(Hero h) {
        super(h.getName(), h.getHp(), h.weapon);
    }

    public void attack(Creature target) {
        System.out.println(getName() + "は" + this.weapon + "で攻撃!" + target.getName() + "に25のダメージを与えた!");
        target -= 25;
    }

}
