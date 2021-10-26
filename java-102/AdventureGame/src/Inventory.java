
public class Inventory {
    
    private Weapon weapon;
    private Armor armor;
    

    
    
    public Inventory() {
        this.weapon = new Weapon("Fist", -1, 0, 0);
        this.armor = new Armor("Cloth Armor", -1, 0, 0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    
    
    
    
    
}
