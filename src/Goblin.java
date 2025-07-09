public class Goblin extends Monster{
    Goblin(char suffix, int hp){
        super(suffix, hp);
    }
    public void attack(Creature target){
        System.out.println( "ゴブリン" +this.suffix+"はナイフで攻撃!" +target.name + "に8のダメージを与えた!");
        target.setHp() -= 8;
    }

}
