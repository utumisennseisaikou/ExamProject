public interface Creature {
    public abstract boolean isAlive();

    public abstract String getName();
    public abstract void setName();

    public abstract int getHp();

    public abstract int setHp();


    public abstract void showStetus();

    public abstract void attack(Creature target);
}
