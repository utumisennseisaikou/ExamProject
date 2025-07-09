public class Goblin extends Monster{
    Goblin(char suffix, int hp){
        super("ゴブリン",suffix, hp);
    }

    public void attack(Creature target){
        System.out.println( getName() +getSuffix()+"はナイフで攻撃!" +target.getName() + "に8のダメージを与えた!");
        target.setHp(target.getHp()- 8) ;
    }

}
