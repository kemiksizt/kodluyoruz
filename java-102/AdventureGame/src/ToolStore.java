
import sun.audio.AudioPlayer;


public class ToolStore extends NormalLocation {
    
    public ToolStore(Player player) {
        super(player, "Shop");
    }
    
    public boolean onLocation() {
        System.out.println();
        System.out.println("----- Welcome to the Shop ! -----");
        System.out.println();
        boolean showMenu = true;
        
        while(showMenu){
            System.out.println("1 - Weapons");
            System.out.println("2 - Armors");
            System.out.println("3 - Exit");
            System.out.print("Your choice : ");

            int selectItem = scanner.nextInt();
            
            System.out.println();

            while(selectItem < 1 || selectItem > 3){
                System.out.print("Invalid choice , please try again : ");
                selectItem = scanner.nextInt();
            }

            switch (selectItem){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Good Bye ! ");
                    showMenu = false;
                    return true;
            }               
        }
        
        return true;
        
    }
    
    public void printWeapon(){
        System.out.println("----- Weapons -----");
        
        
        for(Weapon w: Weapon.weapons()){
            System.out.println("<Id : "+ w.getId() + " - " + w.getName() + " , Price : " + w.getPrice() + " , Damage : " + w.getDamage() + ">");
        }
        
        System.out.println("0 - Exit");
        
        
    }
    
    public void buyWeapon(){
        
        System.out.print("Choose weapon id : ");
        int selectWeaponID = scanner.nextInt();
        while(selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Invalid choice , please try again : ");
            selectWeaponID = scanner.nextInt();
        }
        
        if(selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
        
            if(selectedWeapon != null){
                if(selectedWeapon.getPrice() > this.getPlayer().getCoin()){
                    System.out.println("Not enough money !");
                }
                else{
                    // Purchasing area
                    System.out.println("You bought " + selectedWeapon.getName() + " !");
                    int balance = this.getPlayer().getCoin() - selectedWeapon.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("New amount : " + this.getPlayer().getCoin());
                    System.out.println("Previous Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Current Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
        
        
    }
    
    
    public void printArmor(){
        System.out.println("----- Armors -----");
        
        
        for(Armor a : Armor.armors()){
            System.out.println(a.getId() + " - " + a.getName() + " <Price : " + a.getPrice()+ ", Armor : " + a.getBlock() + " >");
        }
        
        System.out.println("0 - Exit");
        
    }
    
    
    public void buyArmor(){
        
        System.out.print("Choose armor id : ");
        int selectArmorID = scanner.nextInt();
        while(selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.print("Invalid choice , please try again : ");
            selectArmorID = scanner.nextInt();
        
        }
        
        if(selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
        
        
            if(selectedArmor != null){
                if(selectedArmor.getPrice() > this.getPlayer().getCoin()){
                    System.out.println("Not enough money !");
                }
                else{
                    // Purchasing area
                    System.out.println("You bought " + selectedArmor.getName() + " !");
                    int balance = this.getPlayer().getCoin() - selectedArmor.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("New amount : " + this.getPlayer().getCoin());
                    System.out.println("Previous Armor : " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Current Armor : " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }
        
        
    
    }    
     
    
}
