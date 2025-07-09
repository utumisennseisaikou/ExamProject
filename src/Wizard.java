public class Wizard extends Character{
    public int mp;
    Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;

    }
    public void attack(Creature target){
        System.out.println(getName() + "は火の玉を放った!" + target.name + "に6のダメージを与えた!");
        target.hp -= 6;
        this.mp -= 1;
    }



}
