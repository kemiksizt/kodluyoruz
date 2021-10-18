
public abstract class GameChar {
    private int id;
    private String charName;
    private int damage;
    private int health;
    private int coin;

    public GameChar(int id,String charName,int damage, int health, int coin) {
        this.id = id;
        this.charName = charName;
        this.damage = damage;
        this.health = health;
        this.coin = coin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
           

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    
    
    

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
    
    
    
    
}
