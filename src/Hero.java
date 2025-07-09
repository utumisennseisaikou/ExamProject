public abstract class Hero extends Character{
    String weapon;
    Hero(String name,int hp,String weapon){
        super(name,hp);
        this.weapon = weapon;
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + "は" + this.weapon + "で攻撃!" + target.getName() + "に10のダメージを与えた!");
    }




}
