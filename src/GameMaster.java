import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        Hero hero = new Hero("勇者", 100, "剣");
        Wizard wizard = new Wizard("魔法使い", 60, 10);
        Thief thief = new Thief("盗賊", 70);
        party.add(hero);
        party.add(wizard);
        party.add(thief);
        System.out.println("---味方パーティ---");
        for (Character member : party) {
            member.showStatus();
        }
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        Matango matango = new Matango('A', 45);
        Goblin goblin = new Goblin('A', 50);
        Slime slime = new Slime('A', 40);
        monsters.add(matango);
        monsters.add(goblin);
        monsters.add(slime);
        System.out.println("---敵グループ---");
        for (Monster member : monsters) {
            member.showStatus();
        }
        System.out.println("味方の総攻撃");
        for (Character member : party) {
            for (Monster m : monsters) {
                member.attack(m);
            }
        }
        System.out.println("敵の総攻撃");
        for (Monster member : monsters) {
            for(Character m : party) {
                member.attack(m);
            }
        }
        System.out.println("ダメージを受けた勇者が突然光だした!");
        System.out.println("勇者はスーパーヒーローに進化した!");

        for (Character member : SuperHero){
            for (Monster m : monsters) {
                member.attack(m);
            }
        }

    }
}
