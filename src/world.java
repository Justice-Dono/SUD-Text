import java.util.Random;

public class world {
    public static String[][] world;
    public static Integer pX;
    public static Integer pY;

    public static String[][] newWorld(Integer defInt){
        String[][] world = new String[defInt][defInt];
        Random localRandom = new Random();
        for(int x = 0; x< world.length;x++){
            for(int y = 0;y<world[x].length;y++){
                Integer localInt = localRandom.nextInt(2 - 0) + 0;
                if(localInt == 1){
                    world[x][y] = "E";
                }
                else{
                    world[x][y] = "-";
                }
            }
        }
        Integer playerX = localRandom.nextInt(defInt-0) + 0;
        pX = playerX;
        Integer playerY = localRandom.nextInt(defInt -0) + 0;
        pY = playerY;
        world[playerX][playerY] = "P";
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

    public static Integer getPlayerX(){
        return (pX + 1);
    }

    public static Integer getPlayerY(){
        return (pY + 1);
    }

    public static void printWorld(){
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
    }

    public static void movePlayerNorth(){
        String token = "P";
        world[pX][pY] = "-";
        pX = (pX - 1);
        world[pX][pY] = token;
    }

    public static void movePlayerEast(){
        String token = "P";
        world[pX][pY] = "-";
        pY = (pY + 1);
        world[pX][pY] = token;
    }

    public static void movePlayerSouth(){
        String token = "P";
        world[pX][pY] = "-";
        pX = (pX + 1);
        world[pX][pY] = token;
    }

    public static void movePlayerWest(){
        String token = "P";
        world[pX][pY] = "-";
        pY = (pY - 1);
        world[pX][pY] = token;
    }
}
