public class Thief extends Character{
    Thief(String name,int hp){
        super(name,hp);
    }
    public void attack(Creature target){
        System.out.println(getName() + "は素早く攻撃した!" + target.name + "に5のダメージを与えた!");
        target.hp -= 5;
    }
}
