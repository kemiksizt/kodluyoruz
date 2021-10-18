
import java.util.Random;


public class BattleLocation extends Location{

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    
    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle){
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }
    
    

    
    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println();
        System.out.println("-------------------");
        System.out.println();
        System.out.println("Now you are here : " + this.getName());
        System.out.println("Be Careful , " + obsNumber + " "+ this.getObstacle().getName() + " lives here !!" );
        
        System.out.print("<A>ttack or <R>un : ");
        String selectCase = scanner.nextLine().toUpperCase();
        
        if(selectCase.equals("A")){
            if(combat(obsNumber)){
                System.out.println(this.getName() + " defeat all enemies !");
                return true;
            }
        }
        
        if(this.getPlayer().getHealth() < 0){
            System.out.println("GAME OVER !");
            return false;
        }
        
        return true;
    }
    
    public boolean combat(int obsNumber){
        for(int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getDefHealth());
            playerStats();
            obstacleStats(i);
            
            while(this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.print("<A>ttack or <R>un : ");
                String selectCombat = scanner.nextLine().toUpperCase();
                
                if(selectCombat.equals("A")){
                    System.out.println("You Attack !");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getObstacle().getHealth() > 0){
                        System.out.println("Obstacle Attack !");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }
                
                else{
                    return false;
                }
            }
            
        }
        
        
        return false;
    }
    
    public void afterHit(){
        System.out.println("Your Health : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + "'s Health : " + this.getObstacle().getHealth());
        System.out.println("------------");
    }
    
    
    public void playerStats(){
        System.out.println("Player Stats");
        System.out.println("----------------");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Coin : " + this.getPlayer().getCoin());
        System.out.println();
     
    }
    
    
    public void obstacleStats(int i){
        System.out.println(i + ". " + this.getObstacle().getName() + " Stats");
        System.out.println("------------");
        System.out.println("Health : " + this.getObstacle().getHealth());
        System.out.println("Damage : " + this.getObstacle().getDamage());
        System.out.println("Prize : " + this.getObstacle().getAward());
        System.out.println();
    }
    
    
    
    public int randomObstacleNumber(){
        Random rand = new Random();
        
        return rand.nextInt(getMaxObstacle()) + 1;
    }
    
    

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    
    
    
    
    
}
