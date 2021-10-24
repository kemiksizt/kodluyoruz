
import java.util.Scanner;


public class Player {
    
    
    private int damage;
    private int health;
    private int defHealth;
    private int coin;
    private String name;
    private String charName;
    private Inventory inventory;
    
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public int getTotalDamage(){
        
        return damage + this.getInventory().getWeapon().getDamage();
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
        if(health < 0){
            health = 0;
        }
        
        this.health = health;
    }

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }
    
    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
    
    
    
    public void selectChar(){
        GameChar [] charList = {new Samurai(),new Archer(), new Knight() };
        System.out.println("-----------------------------");
        
        for(GameChar gameChar : charList){
            System.out.println("ID : " + gameChar.getId() +
                               "\t Characater : " + gameChar.getCharName() + 
                               "\t Damage : " + gameChar.getDamage() +
                               "\t Health : " + gameChar.getHealth() + 
                               "\t Coin : " + gameChar.getCoin());
        }
        System.out.println("---------------------------------------------------------------------------------------");
        
        System.out.print("Please Choose your character : ");
        int selectChar = scanner.nextInt();
        
        switch(selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        
        System.out.println("Character : " + this.getCharName() +
                           ", Damage : " + this.getDamage() + 
                           ", Health : " + this.getHealth() + 
                           ", Coin : " + this.getCoin());
        
    }
    
    public void printInfo(){
        System.out.println("Weapon : " + this.getInventory().getWeapon().getName()+
                           ", Armor : " + this.getInventory().getArmor().getName() +
                           ", Damage : " + this.getTotalDamage()+
                           ", Block : " + this.getInventory().getArmor().getBlock()+
                           ", Health : " + this.getHealth() +
                           ", Coin : " + this.getCoin());
    }
    
  
    
    public void initPlayer(GameChar gamechar){
        this.setDamage(gamechar.getDamage());
        this.setHealth(gamechar.getHealth());
        this.setDefHealth(gamechar.getHealth());
        this.setCoin(gamechar.getCoin());
        this.setCharName(gamechar.getCharName());
        
        
    }
}
