import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        party.set(0, new Hero("勇者", 100, "剣"));
        party.set(1, new Wizard("魔法使い", 60, 10));
        party.set(2, new Thief("盗賊", 70));
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.set(0, new Matango('A', 45));
        monsters.set(1, new Matango('A', 50));
        monsters.set(2, new Matango('A', 40));
        System.out.println("---味方パーティ---");
        for (Character member : party ) {
                member.showStatus();
            }
        }
}
