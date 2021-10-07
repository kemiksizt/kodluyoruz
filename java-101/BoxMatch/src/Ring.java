
public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    
    void start(){
        
        if(checkWeight()){
            if(whoStart(f1, f2)){
                while(this.f1.health > 0 && this.f2.health > 0){
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " health : " + this.f1.health);
                    System.out.println(this.f2.name + " health : " + this.f2.health);
                
                }
            }
            
            else {
                while(this.f1.health > 0 && this.f2.health > 0){
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }

                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f2.name + " health : " + this.f2.health);
                    System.out.println(this.f1.name + " health : " + this.f1.health);
                
                }
            }
        }
        
        else{
            System.out.println("Weight does NOT match ! ");
        }
    }
    
    
    
    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println("Winner is " + f2.name + " !!");
            return true;
        }
        
        if(this.f2.health == 0){
            System.out.println("Winner is " + f1.name + " !!");
            return true;
        }
        
        return false;
    }
    
    boolean whoStart(Fighter f1, Fighter f2){
        this.f1.randomStart = Math.random() * 100;
        this.f2.randomStart = Math.random() * 100;
        
        if(f1.randomStart > f2.randomStart){
            return true;
        }
        
            return false;
    }
    
}
