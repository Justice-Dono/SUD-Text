import java.util.Scanner;

public class launch {
        static Life player;
        static String[][] localWorld;

    public static String getEntity(Integer x, Integer y){
        String entity = world.world[x-1][y-1];
        return entity;
    }

    public static String checkNorth(){
        String result;
        try {
            String entity = getEntity((world.getPlayerX()-1), world.getPlayerY());
                if(entity == "E"){
                    result =  "There is an Entity to the North";
                    return result;
                } else {
                    result = "There is nothing to the North";
                    return result;
                }
        } catch (IndexOutOfBoundsException e) {
            result = "There is an impassible wall to the North";
            return result;
        }
    }

        public static String checkEast(){
        String result;
        try {
            String entity = getEntity(world.getPlayerX(), (world.getPlayerY()+1));
                if(entity == "E"){
                    result =  "There is an Entity to the East";
                    return result;
                } else {
                    result = "There is nothing to the East";
                    return result;
                }
        } catch (IndexOutOfBoundsException e) {
            result = "There is an impassible wall to the East";
            return result;
        }
    }

    public static String checkSouth(){
        String result;
        try {
            String entity = getEntity((world.getPlayerX()+1), world.getPlayerY());
                if(entity == "E"){
                    result =  "There is an Entity to the South";
                    return result;
                } else {
                    result = "There is nothing to the South";
                    return result;
                }
        } catch (IndexOutOfBoundsException e) {
            result = "There is an impassible wall to the South";
            return result;
        }
    }

    public static String checkWest(){
        String result;
        try {
            String entity = getEntity(world.getPlayerX(), (world.getPlayerY()-1));
                if(entity == "E"){
                    result =  "There is an Entity to the West";
                    return result;
                } else {
                    result = "There is nothing to the West";
                    return result;
                }
        } catch (IndexOutOfBoundsException e) {
            result = "There is an impassible wall to the West";
            return result;
        }
    }
    public static void startInputLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.print("Enter something (type 'Exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("World")){
                System.out.println("Enter world boundries:");
                String localInput = scanner.nextLine();
                Integer localInt = Integer.parseInt(localInput);
                world.world = world.newWorld(localInt);
            }
            if (input.equalsIgnoreCase("Move")) {
                System.out.println("which cardinal direction would you like to move?");
                System.out.println("North\nEast\nSouth\nor West?");
                String localInput = scanner.nextLine();
                if (localInput.equalsIgnoreCase("North")){
                    world.movePlayerNorth();
                    
                }
                if (localInput.equalsIgnoreCase("East")){
                    world.movePlayerEast();
                    
                }
                if (localInput.equalsIgnoreCase("South")){
                    world.movePlayerSouth();
                    
                }
                if (localInput.equalsIgnoreCase("West")){
                    
                }
                world.printWorld();
            }
            if (input.equalsIgnoreCase("Update")){
                world.printWorld();
            }
            if (input.equalsIgnoreCase("Exit")) {
                continueLoop = false;
            }
        }

        System.out.println("Loop stopped.");
        scanner.close();
    }
    public static void main(String[] args) {
        /**world.world = world.newWorld();
        Life localPlayer = player.makePlayer();
        System.out.println(checkNorth());
        System.out.println(checkEast());
        System.out.println(checkSouth());
        System.out.println(checkWest());
       **/
        player = Life.makePlayer();
        startInputLoop();
    }
}
