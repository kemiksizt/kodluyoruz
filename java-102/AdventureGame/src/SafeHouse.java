
public class SafeHouse extends NormalLocation {
    
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }
    
    @Override
    public boolean onLocation() {
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        System.out.println("You are in the Safe House !");
        System.out.println("Your health is full !");
        
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        
        return true;
    }
    
}
