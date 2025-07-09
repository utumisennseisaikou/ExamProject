public abstract class Character implements Creature{
    private String name;
    private int hp;
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp) {
        if(hp > 0){
            this.hp = hp;
        }
    }
    public boolean isAlive(){
        if(this.setHp()<=0) {
            return false;
        }
        else{
            return true;
        }
    }
    public void showStatus(){
        System.out.println( this.getName() +": HP"+ this.getHp() );
    }
}
