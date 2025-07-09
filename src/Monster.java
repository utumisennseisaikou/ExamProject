public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public Monster(String name,char suffix,int hp){
        if (hp < 0) {     // ここで引数をチェック
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.name = name;
        this.suffix = suffix;
        setHp(hp);
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public final boolean isAlive(){
        if(hp>0){
            return true;
        }else {
            return false;
        }
    }
    public char getSuffix() {
        return suffix;
    }
    public void showStatus(){
        System.out.println(this.getName()+this.suffix +": HP"+this.getHp());
    }

}
