public abstract class Monster implements Creature{
    private String name;
    private int hp;
    char suffix;
    Monster(char suffix,int hp){
        this.hp = hp;
        this.suffix = suffix;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int setHp(){
        return this.hp;
    }
    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        }
    }
    public final boolean isAlive(){
        if(hp>0){
            return true;
        }else {
            return false;
        }
    }
    public void showStatus(){
        System.out.println(this.getName()+this.suffix +": HP"+this.getHp());
    }

}
