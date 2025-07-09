public final class Slime extends Monster{
    Slime(char suffix,int hp){
        super(suffix,hp);
    }
    public void attack(Creature target){
        System.out.println( "スライム" +this.suffix+"は体当たり攻撃!" +target + "に5のダメージを与えた!");
    }
}
