
import java.util.Scanner;



public class Game {
    
    Scanner scanner = new Scanner(System.in);
    
    private Player player;
    private Location location;
/*
    public Game(Player player, Location location) {
        this.player = player;
        this.location = location;
    }
*/
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public void start(){
        System.out.println("Welcome to the Advanture Game !");
        System.out.print("Please enter name : ");
        //String playerName = scanner.nextLine();
        //Player player = new Player(playerName);
        Player player = new Player("Turab");
        System.out.println(player.getName() + " Welcome to the Mysterious World  !");
        System.out.println("Please choose your character ! ");
        player.selectChar();
        Location location = null;
        
        while(true){
            System.out.println();
            player.printInfo();
            System.out.println("###### Locations ######");
            System.out.println();
            System.out.println("1 - Safe House ---> No obstacles inside, its safe !");
            System.out.println("2 - Shop ---> You can buy weapon and armor !");
            System.out.println("3 - Cave ---> Award : Food, Be careful there could be Zombie ! ");
            System.out.println("4 - Forest ---> Award : Firewood, Be careful there could be Vampire ! ");
            System.out.println("5 - River ---> Award : Water, Be careful there could be Bear ! ");
            System.out.println("0 - Exit ---> Exit the game");
            System.out.print("Please choose the place : ");
            int selectLoc = scanner.nextInt();
            switch(selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Please enter valid value ");
            }

            if(location == null){
                System.out.println("You quickly gave up on this dark and swollen island !!");
                break;
            }
            
            if(!location.onLocation()){
                System.out.println("GAME OVER !");
                break;
            }
        }
        
       
    }
    
    
}
