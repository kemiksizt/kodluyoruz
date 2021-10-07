
public class Main {
    public static void main(String[] args) {
        
        Fighter f1 = new Fighter("Turab", 20, 100, 100, 30);
        Fighter f2 = new Fighter("Ali", 10, 85, 85, 40);
        
        Ring match = new Ring(f1, f2, 80, 110);
        match.start();
        
        
    }
    
}
