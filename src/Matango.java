public abstract class Matango extends Monster{
    Matango(char suffix,int hp){
        super(suffix,hp);
    }
    public void attack(Creature target){
        System.out.println( "お化けキノコ" +this.suffix+"は体当たり攻撃!" + target.getName() + "に6のダメージを与えた!");

    }

}
