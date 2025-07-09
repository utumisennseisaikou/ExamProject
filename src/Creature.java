public interface Creature {
    boolean isAlive();
    String getName();
    int getHp();
    void setHp(int hp);
    void showStatus();
    void attack(Creature target);
}
