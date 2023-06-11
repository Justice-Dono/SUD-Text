import java.util.Random;
import java.util.Scanner;

public class world {
    public String[][] world;

    public static String[][] newWorld(){
        Integer defInt = worldGen();
        String[][] world = new String[defInt][defInt];
        Random localRandom = new Random();
        for(int x = 0; x< world.length;x++){
            for(int y = 0;y<world[x].length;y++){
                Integer localInt = localRandom.nextInt(2 - 0) + 0;
                world[x][y] = localInt.toString();
            }
        }
        StringBuilder localBuilder = new StringBuilder();
        for(int x = 0; x< world.length;x++){
            if(x>0){
            localBuilder.append("\n");
        }
            for(int y = 0;y<world[x].length;y++){
                localBuilder.append(world[x][y]);
            }
        }
        System.out.println(localBuilder.toString());
        return world;
    }

    static Integer worldGen(){
        try (Scanner localScanner = new Scanner(System.in)) {
            System.out.println("Enter world boundries:");
            String localString = localScanner.nextLine();
            Integer localInt = Integer.parseInt(localString);
            return localInt;
        } catch (NumberFormatException e) {
            // Will add nice error message at a later date, maybe loop?
            System.out.println("Error formatting numbers, make sure you entered an integer value.");
            e.printStackTrace();
            worldGen();
        }
        return null;
    }
}
