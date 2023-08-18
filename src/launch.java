
public class launch {

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
    public static void main(String[] args) throws Exception {
        world.world = world.newWorld();
        //Life localPlayer = player.makePlayer();
        System.out.println(checkNorth());
        System.out.println(checkEast());
        System.out.println(checkSouth());
        System.out.println(checkWest());
        world.movePlayerNorth();
        world.printWorld();
        world.movePlayerEast();
        world.printWorld();
        world.movePlayerSouth();
        world.printWorld();
        world.movePlayerWest();
        world.printWorld();
    }
}
